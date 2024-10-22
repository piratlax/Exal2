package com.summsoft.implementaciones;

import com.summsoft.interfases.HorarioDao;
import com.summsoft.modelos.Bus;
import com.summsoft.modelos.Conductor;
import com.summsoft.modelos.Horario;
import com.summsoft.modelos.MdlRutas;
import com.summsoft.utilerias.Conexion;
import com.summsoft.utilerias.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HorarioImpl extends Conexion implements HorarioDao{

    @Override
    public List rutas() throws Exception {
        List<MdlRutas> lista=null;
        try {
           this.Conectar(); 
           String query = "SELECT CONCAT(o.abrev,'-',d.abrev) as nombre FROM rutas as r INNER JOIN terminales as o ON r.idorigen = o.id "
                   + "INNER JOIN terminales as d ON  r.iddestino = d.id WHERE r.activa='SI'";
           PreparedStatement st = this.conexion.prepareStatement(query);
           lista = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              MdlRutas mdl = new MdlRutas();
              mdl.setNombre(rs.getString("nombre"));
              lista.add(mdl);
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public List conductor() throws Exception {
        List<Conductor> lista=null;
        try {
           this.Conectar(); 
           String query = "SELECT nombre FROM conductores WHERE activo='SI'";
           PreparedStatement st = this.conexion.prepareStatement(query);
           lista = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              Conductor mdl = new Conductor();
              mdl.setNombre(rs.getString("nombre"));
              lista.add(mdl);
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public List bus() throws Exception {
        List<Bus> lista=null;
        try {
           this.Conectar(); 
           String query = "SELECT numero FROM autobuses WHERE activo='SI'";
           PreparedStatement st = this.conexion.prepareStatement(query);
           lista = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              Bus mdl = new Bus();
              mdl.setNumero(rs.getString("numero"));
              lista.add(mdl);
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public boolean registrar(String ruta, String Conductor, String Bus, String hora) throws Exception {
       boolean resultado=false;
       
       int numero=0;
        try {
            this.Conectar();
            PreparedStatement ps=this.conexion.prepareStatement("SELECT * FROM folio WHERE id=1");
            ResultSet rs = ps.executeQuery(); 

            int periodo_actual = LocalDate.now().getYear();
            int mes_actual = LocalDate.now().getMonthValue();

            if (rs.next()) {
                int periodo = rs.getInt("periodo");
                int mes = rs.getInt("mes");
                numero = rs.getInt("numero") + 1;

                if (periodo != periodo_actual || mes != mes_actual) {
                    int ultimo_boleto = obtenerUltimoBoleto();
                    numero = 0;

                    try {
                        

                        // Actualizar folio
                        String sql="UPDATE folio SET periodo=?, mes=?, numero=?";
                        PreparedStatement ps1 = this.conexion.prepareStatement(sql);
                        ps1.setInt(1, periodo_actual);
                        ps1.setInt(2, mes_actual);
                        ps1.setInt(3, numero);
                        ps1.execute();
                                

                        // Actualizar boletos
                        sql="UPDATE boletos SET numero=0 WHERE id=?";
                        PreparedStatement ps2 = this.conexion.prepareStatement(sql);
                        ps2.setInt(1, ultimo_boleto);
                        ps2.execute();


                        
                    } catch (SQLException ex) {
                        System.out.println("error "+ex);
                        
                    }
                } else {
                    String sql="UPDATE folio SET numero=?";
                    PreparedStatement ps3 = this.conexion.prepareStatement(sql);
                    ps3.setInt(1, numero);
                    ps3.execute();
                }
            } else {
                // Insertar nuevo folio
                String sql="INSERT INTO folio (periodo, mes, numero) VALUES (?, ?, ?)";
                PreparedStatement ps4 = this.conexion.prepareStatement(sql);
                ps4.setInt(1, periodo_actual);
                ps4.setInt(2, mes_actual);
                ps4.setInt(3, 0);
                ps4.execute();
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String Folio = formatearNumeroBoleto(numero);
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO horarios (rutas_id, autobuses_id, conductores_id, folio, hora, personal, fecha) "
                    + "VALUES ((SELECT id FROM rutas WHERE nombre = ?), (SELECT id FROM autobuses WHERE numero = ?), (SELECT id FROM conductores WHERE nombre= ?), ?, ?, ?, CURDATE())");
            st.setString(1, ruta);
            st.setString(2, Bus);
            st.setString(3, Conductor);
            st.setString(4, Folio);
            st.setString(5, hora);
            st.setInt(6, Usuario.getId());
            
            // Verificar el número de filas afectadas
            int filasAfectadas = st.executeUpdate();
            if (filasAfectadas > 0) {
                resultado = true;
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
       
       return resultado;
    }

    private String formatearNumeroBoleto(int numero) {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMM");
        return formatter.format(fechaActual) + "-" + numero;
    }
    private int obtenerUltimoBoleto() throws SQLException {
        int ultimo_boleto = 0;
        try (PreparedStatement ps = this.conexion.prepareStatement("SELECT id FROM boletos ORDER BY id DESC LIMIT 1");
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                ultimo_boleto = rs.getInt("id");
            }
        }
        return ultimo_boleto;
    }

    @Override
    public List lista(String buscar) throws Exception {
    List<Horario> lista=null;
        try {
           this.Conectar(); 
           String query = buscar.isEmpty() ? "SELECT h.id, h.folio, r.nombre, h.hora, b.numero, c.nombre, h.activo FROM horarios as h " +
            "INNER JOIN rutas as r ON h.rutas_id = r.id INNER JOIN autobuses as b ON h.autobuses_id = b.id " +
            "INNER JOIN conductores as c ON h.conductores_id = c.id WHERE h.fecha = CURDATE()" : "SELECT * FROM horarios WHERE nombre LIKE '%"+buscar+"%'";
           
           PreparedStatement st = this.conexion.prepareStatement(query);
           lista = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              Horario mdl = new Horario();
              mdl.setId(rs.getInt("id"));
              mdl.setFolio(rs.getString("folio"));
              mdl.setRuta(rs.getString("r.nombre"));
              mdl.setHora(rs.getString("hora"));
              mdl.setBus(rs.getString("numero"));
              mdl.setConductor(rs.getString("c.nombre"));
              mdl.setActivo(rs.getString("activo"));
              
              lista.add(mdl);
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return lista;   
    }
}
