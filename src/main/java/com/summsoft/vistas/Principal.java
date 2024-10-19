package com.summsoft.vistas;

import com.summsoft.utilerias.Usuario;
import com.summsoft.utilerias.Ventana;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.ImageIcon;

/**
 *
 * @author Mao
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        //cambiar icono
        setIconImage(new ImageIcon(getClass().getResource("/icono.png")).getImage());
        setDate();
    }

    private void setDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        txtFecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
        txtPersonalActivo.setText("Bienvenido "+Usuario.getNombre());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Dashboard = new javax.swing.JDesktopPane();
        status = new javax.swing.JPanel();
        txtFecha = new javax.swing.JLabel();
        txtPersonalActivo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSistema = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuPersonal = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuBusEstilo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );

        txtFecha.setText("Hoy es {dayname} {day} de {month} de {year}");

        txtPersonalActivo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPersonalActivo.setText("Bienvenido");

        javax.swing.GroupLayout statusLayout = new javax.swing.GroupLayout(status);
        status.setLayout(statusLayout);
        statusLayout.setHorizontalGroup(
            statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(txtPersonalActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        statusLayout.setVerticalGroup(
            statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha)
                    .addComponent(txtPersonalActivo))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard)
            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mnuSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mnuSistema.png"))); // NOI18N
        mnuSistema.setText("Sistema");

        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mnuSalir.png"))); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuSistema.add(mnuSalir);

        jMenuBar1.add(mnuSistema);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mnuDireccion.png"))); // NOI18N
        jMenu2.setText("Dirección");

        mnuPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mnuPersonal.png"))); // NOI18N
        mnuPersonal.setText("Personal");
        mnuPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPersonalActionPerformed(evt);
            }
        });
        jMenu2.add(mnuPersonal);

        jMenuBar1.add(jMenu2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mnuAutobuses.png"))); // NOI18N
        jMenu1.setText("Autobuses");
        jMenu1.setActionCommand("Autobuses");

        mnuBusEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mnuEstilos.png"))); // NOI18N
        mnuBusEstilo.setText("Tipo y Diseño");
        mnuBusEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBusEstiloActionPerformed(evt);
            }
        });
        jMenu1.add(mnuBusEstilo);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Terminales");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPersonalActionPerformed
       if (!Ventana.isPersonal()){
            vistaPersonal personal = new vistaPersonal();
            Dashboard.add(personal);
            personal.setLocation(100,1);
            personal.setVisible(true);
            Ventana.setPersonal(true);
        }
    }//GEN-LAST:event_mnuPersonalActionPerformed

    private void mnuBusEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBusEstiloActionPerformed
        if (!Ventana.isBusStyle()){
            vistaTipoBus tipoBus = new vistaTipoBus();
            Dashboard.add(tipoBus);
            tipoBus.setLocation(100,1);
            tipoBus.setVisible(true);
            Ventana.setBusStyle(true);
        }
    }//GEN-LAST:event_mnuBusEstiloActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Dashboard;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuBusEstilo;
    private javax.swing.JMenuItem mnuPersonal;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenu mnuSistema;
    private javax.swing.JPanel status;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtPersonalActivo;
    // End of variables declaration//GEN-END:variables
}
