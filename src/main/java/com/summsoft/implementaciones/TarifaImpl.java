/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summsoft.implementaciones;

import com.summsoft.interfases.TarifaDao;
import com.summsoft.modelos.Tarifa;
import com.summsoft.utilerias.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mao
 */
public class TarifaImpl extends Conexion implements TarifaDao{
 @Override
    public List tarifas(String ruta) throws Exception {
         List<Tarifa> tarifa=null;
        try {
           this.Conectar(); 
           String query = "SELECT t.origen as origenid, t.destino as destinoid, teo.terminal as origen, ted.terminal as destino, "
                   + "ted.abrev as abrev, t.tarifa as sencillo, " +
            "t.insen as insen, t.nino as nino, t.nino_desc, t.redondo, t.redondo_desc, t.estudiante, t.pasillo FROM tarifas as t INNER JOIN terminales as teo ON t.origen = teo.id " +
            "INNER JOIN terminales as ted ON t.destino = ted.id WHERE t.idrutas=(select id from rutas WHERE nombre='"+ruta+"');";
           PreparedStatement st = this.conexion.prepareStatement(query);
           tarifa = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              Tarifa mdl = new Tarifa();
              mdl.setOrigenid(rs.getInt("origenid"));
              mdl.setDestinoid(rs.getInt("destinoid"));
              mdl.setSencillo(rs.getInt("sencillo"));
              mdl.setInsen(rs.getInt("insen"));
              mdl.setNino(rs.getInt("nino"));
              mdl.setNino_desc(rs.getInt("nino_desc"));
              mdl.setRedondo(rs.getInt("redondo"));
              mdl.setRedondo_desc(rs.getInt("redondo_desc"));
              mdl.setEstudiante(rs.getInt("estudiante"));
              mdl.setPasillo(rs.getInt("pasillo"));
              mdl.setOrigen(rs.getString("origen"));
              mdl.setDestino(rs.getString("destino"));
              mdl.setAbrev(rs.getString("abrev"));
              
              
              tarifa.add(mdl);
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return tarifa;
    }

    @Override
    public List destinos(String ruta) throws Exception {
        List<Tarifa> destino=null;
        try {
           this.Conectar(); 
           String query = "SELECT DISTINCT ted.terminal AS destino " +
            "FROM tarifas AS t " +
            "INNER JOIN terminales AS ted ON t.destino = ted.id " +
            "WHERE t.idrutas = (SELECT id FROM rutas WHERE nombre = '"+ruta+"')";
           PreparedStatement st = this.conexion.prepareStatement(query);
           destino = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              Tarifa mdl = new Tarifa();
              mdl.setDestino(rs.getString("destino"));
              
              
              destino.add(mdl);
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return destino;
    }   
}
