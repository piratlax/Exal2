package com.summsoft.vistas;

import com.summsoft.implementaciones.implUsuario;
import com.summsoft.interfases.daoUsuario;
import com.summsoft.modelos.mdlUsuario;
import com.summsoft.utilerias.Utilidades;
import com.summsoft.utilerias.Ventana;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class vistaPersonal extends javax.swing.JInternalFrame {

    private int Id;
    private String Clave;
    
    public vistaPersonal() {
        initComponents();
        Inicio();
        Tabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnIntegrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        jcPerfil = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setResizable(true);
        setTitle("Gestión Personal");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/mnuPersonal.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnIntegrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in.png"))); // NOI18N
        btnIntegrar.setText("Integrar");
        btnIntegrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnActivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/switch.png"))); // NOI18N
        btnActivar.setText("Habilitar/Deshabilitar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mnuSalir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnIntegrar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnActivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnNuevo)
                .addComponent(btnIntegrar)
                .addComponent(btnEditar)
                .addComponent(btnActualizar)
                .addComponent(btnActivar)
                .addComponent(btnSalir))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Usuario");

        jcPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contador" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Perfil");

        jLabel2.setText("Telefono");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtClave)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(477, 477, 477)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcPerfil, 0, 200, Short.MAX_VALUE)
                                .addComponent(txtTelefono)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(170, 170, 170))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

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

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset.png"))); // NOI18N
        jButton8.setText("Reset");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void Inicio() {
        btnNuevo.setEnabled(true);
        btnIntegrar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnActivar.setEnabled(true);

        txtNombre.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtClave.setEnabled(false);
        txtTelefono.setEnabled(false);

        txtNombre.setText("");
        txtUsuario.setText("");
        txtClave.setText("");
        txtTelefono.setText("");

    }

    private void Tabla() {
 // Definición de la cabecera y anchos de las columnas
        String[] cabecera = {"Id", "Nombre", "Usuario", "Perfil", "Telefono", "Activo"};
        int[] anchos = {0, 150, 50, 50, 50, 50};

// Obtener el modelo y limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);

// Agregar la cabecera al modelo
        model.setDataVector(null, cabecera);

// Establecer los anchos de las columnas
        for (int i = 0; i < cabecera.length; i++) {
            tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            tabla.setFont(new java.awt.Font("Tahoma", 0, 14));
        }
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);

// Rellenar la tabla con datos desde el DAO
        try {
            daoUsuario dao = new implUsuario();
            List<mdlUsuario> mdl = dao.listar("");

            for (mdlUsuario user : mdl) {
                model.addRow(new Object[]{
                    user.getId(),
                    user.getNombre(),
                    user.getUsuario(),
                    user.getPerfil(),
                    user.getTelefono(),
                    user.getActivo()
                });
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //cerramos
        Ventana.setPersonal(false);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnNuevo.setEnabled(false);
        btnIntegrar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnActivar.setEnabled(false);

        txtNombre.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtClave.setEnabled(true);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnIntegrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrarActionPerformed
        boolean nombre = !txtNombre.getText().trim().isEmpty();
        boolean usuario = !txtUsuario.getText().trim().isEmpty();
        boolean password = !txtClave.getText().trim().isEmpty();

        if (nombre && usuario && password) {
            daoUsuario dao = new implUsuario();

            // revisamos si no hay un nombre o un usario ya en la bd con los mismos datos
            try {
                if (dao.checkUsuario(txtUsuario.getText())) {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe en la base de datos");
                } else {
                    //encriptamos
                    String clave = Utilidades.encryptPassword(txtClave.getText());

                    mdlUsuario user = new mdlUsuario();
                    user.setNombre(txtNombre.getText());
                    user.setUsuario(txtUsuario.getText());
                    user.setTelefono(txtTelefono.getText());
                    user.setClave(clave);
                    user.setPerfil(jcPerfil.getSelectedItem().toString());

                    if (dao.registrar(user)) {
                        JOptionPane.showMessageDialog(null, "Personal correctamente integrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Faltan datos. Por favor, complete todos los campos requeridos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (Exception ex) {
            }

            Tabla();
            Inicio();
        }
    }//GEN-LAST:event_btnIntegrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
            int fila = tabla.getSelectedRow();

        if (fila >= 0) {

            txtNombre.setEnabled(true);
            txtClave.setEnabled(true);
            jcPerfil.setEnabled(true);
            txtTelefono.setEnabled(true);
            

            int id = (int) tabla.getValueAt(fila, 0);
            try {
                daoUsuario dao = new implUsuario();
                mdlUsuario mdl = dao.getUsuarioId(id);

                Id=mdl.getId();
                
                txtNombre.setText(mdl.getNombre());
                txtUsuario.setText(mdl.getUsuario());
                Clave = mdl.getClave();
                txtTelefono.setText(mdl.getTelefono());
                
                
                btnNuevo.setEnabled(false);
                btnIntegrar.setEnabled(false);
                btnEditar.setEnabled(false);
                btnActivar.setEnabled(false);

                btnActualizar.setEnabled(true);

            } catch (Exception e) {
                System.out.println("error " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un elemento de la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        boolean nombre = !txtNombre.getText().trim().isEmpty();
        

        if (nombre) {

            mdlUsuario mdl = new mdlUsuario();
            mdl.setNombre(txtNombre.getText());
            mdl.setUsuario(txtUsuario.getText());
            mdl.setTelefono(txtTelefono.getText());
            mdl.setPerfil(jcPerfil.getSelectedItem().toString());
            
            if (txtClave.getText().equals("")){
               mdl.setClave(Clave);
            }else{
                mdl.setClave(Utilidades.encryptPassword(txtClave.getText()));
            }
            
            mdl.setId(Id);

            try {
                daoUsuario dao = new implUsuario();
                dao.actualizar(mdl);
                JOptionPane.showMessageDialog(null, "Usuario correctamente actualizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
            Inicio();
            Tabla();
        } else {
            JOptionPane.showMessageDialog(null, "Faltan datos. Por favor, complete todos los campos requeridos.", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
        


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        int fila = tabla.getSelectedRow();

        if (fila >= 0) {
            int id = (int) tabla.getValueAt(fila, 0);
            String activa = tabla.getValueAt(fila, 5).toString();
            try {
                daoUsuario dao = new implUsuario();
                dao.desactivar(id, activa);
                Tabla();
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un usuario de la tabla");
        }    
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       // Definición de la cabecera y anchos de las columnas
        String[] cabecera = {"Id", "Nombre", "Usuario", "Perfil", "Telefono", "Activo"};
        int[] anchos = {0, 150, 50, 50, 50, 50};

// Obtener el modelo y limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);

// Agregar la cabecera al modelo
        model.setDataVector(null, cabecera);

// Establecer los anchos de las columnas
        for (int i = 0; i < cabecera.length; i++) {
            tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            tabla.setFont(new java.awt.Font("Tahoma", 0, 14));
        }
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);

// Rellenar la tabla con datos desde el DAO
        try {
            daoUsuario dao = new implUsuario();
            List<mdlUsuario> users = dao.listar(txtBuscar.getText());

            for (mdlUsuario user : users) {
                model.addRow(new Object[]{
                    user.getId(),
                    user.getNombre(),
                    user.getUsuario(),
                    user.getPerfil(),
                    user.getTelefono(),
                    user.getActivo()
                });
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       txtBuscar.setText((""));
       Tabla();
    }//GEN-LAST:event_jButton8ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnIntegrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcPerfil;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}