/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testventanas;

/**
 *
 * @author Denisse
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents(); //aqui
        this.btnHome.setSelected(true); //mover
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
        btnMover = new javax.swing.JButton();
        pnlMover = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnCalendario = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(191, 17, 145));

        btnMover.setBackground(new java.awt.Color(191, 17, 145));
        btnMover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-menú-50.png"))); // NOI18N
        btnMover.setText("  ");
        btnMover.setBorder(null);
        btnMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnMover)
                .addContainerGap(602, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 60));

        pnlMover.setBackground(new java.awt.Color(204, 204, 204));
        pnlMover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("MIEMBROS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, -1));

        pnlMover.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 102, 102));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-volver-24 (1).png"))); // NOI18N
        btnSalir.setText(" Salir");
        btnSalir.setBorder(null);
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMover.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 130, 40));

        btnHome.setBackground(new java.awt.Color(204, 204, 204));
        btnHome.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(102, 102, 102));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-casa-24 (1).png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnHome.setBorderPainted(false);
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMover.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 40));

        btnCalendario.setBackground(new java.awt.Color(204, 204, 204));
        btnCalendario.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btnCalendario.setForeground(new java.awt.Color(102, 102, 102));
        btnCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-añadir-calendario-24.png"))); // NOI18N
        btnCalendario.setText("Calendario");
        btnCalendario.setActionCommand(" Calendario");
        btnCalendario.setBorder(null);
        btnCalendario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioActionPerformed(evt);
            }
        });
        pnlMover.add(btnCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 40));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CATEGORIAS");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, -1));

        pnlMover.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 130, -1));

        btnPerfil.setBackground(new java.awt.Color(204, 204, 204));
        btnPerfil.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(102, 102, 102));
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-24 (1).png"))); // NOI18N
        btnPerfil.setText("Perfil");
        btnPerfil.setBorder(null);
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMover.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 130, 40));

        btnAjustes.setBackground(new java.awt.Color(204, 204, 204));
        btnAjustes.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btnAjustes.setForeground(new java.awt.Color(102, 102, 102));
        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-acerca-de-24.png"))); // NOI18N
        btnAjustes.setText("Acerca de");
        btnAjustes.setBorder(null);
        btnAjustes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMover.add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 130, 40));

        getContentPane().add(pnlMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 380));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(pnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverActionPerformed

       int posicion =this.pnlMover.getX();
       if(posicion > -1){
           Animacion.Animacion.mover_izquierda(0, -188, 2, 2, pnlMover);
}else{
           Animacion.Animacion.mover_derecha(-188, 0, 2, 2, pnlMover);
       }
        
    }//GEN-LAST:event_btnMoverActionPerformed

    private void btnCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioActionPerformed
        // TODO add your handling code here:
        //frmc
        
    }//GEN-LAST:event_btnCalendarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnCalendario;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnMover;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlMover;
    // End of variables declaration//GEN-END:variables
}
