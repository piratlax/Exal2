package com.summsoft.vistas;

import com.summsoft.implementaciones.HorarioImpl;
import com.summsoft.interfases.HorarioDao;
import com.summsoft.modelos.Horario;
import com.summsoft.utilerias.Boletos;
import com.summsoft.utilerias.Ventana;
import static com.summsoft.vistas.Principal.Dashboard;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SeleccionViajeView extends javax.swing.JInternalFrame {


    public SeleccionViajeView() {
        initComponents();
        Tabla("");
    }

    private void Tabla(String buscar){
        
 // Definición de la cabecera y anchos de las columnas
        String[] cabecera = {"Id", "Folio", "Ruta", "Hora","Bus","Conductor"};
        int[] anchos = {0, 50, 50, 50, 40,150};

// Obtener el modelo y limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);

// Agregar la cabecera al modelo
        model.setDataVector(null, cabecera);

// Establecer los anchos de las columnas
        for (int i = 0; i < cabecera.length; i++) {
            tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            tabla.setFont(new java.awt.Font("Tahoma", 0, 18));
        }
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);

// Rellenar la tabla con datos desde el DAO
        try {
            
            HorarioDao dao = new HorarioImpl();
            List<Horario> mdl = dao.lista(buscar);

            for (Horario h : mdl) {
                model.addRow(new Object[]{
                    h.getId(),
                    h.getFolio(),
                    h.getRuta(),
                    h.getHora(),
                    h.getBus(),
                    h.getConductor(),
                    h.getActivo()
                });
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnSeleccionar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Viajes Programados"));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnSalir.setText("CANCELAR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       //cerramos
        Ventana.setSeleccion(false);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
      int fila = tabla.getSelectedRow();

        if (fila >= 0) {
       
            Boletos.setFolio(tabla.getValueAt(fila, 1).toString());
            
            Boletos.setRuta(tabla.getValueAt(fila, 2).toString());
            
            Boletos.setHora(tabla.getValueAt(fila, 3).toString());
            
            Boletos.setBus(tabla.getValueAt(fila, 4).toString());
            
            Boletos.setConductor(tabla.getValueAt(fila, 5).toString());
            
            
          try {
            VentaView venta = new VentaView();
            Dashboard.add(venta);
            venta.setLocation(100,1);
            venta.setVisible(true);
            
            this.dispose();
          } catch (Exception ex) {
              System.out.println("error aqui"+ex);
          }
            
            
            } else {
            JOptionPane.showMessageDialog(null, "Selecciona un elemento de la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
