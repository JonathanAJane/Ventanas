/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testventanas;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Denisse
 */
public class frmCalendario extends javax.swing.JFrame {

    /**
     * Creates new form frmCalendario
     */
    public frmCalendario() {
        initComponents();
        
        jcFecha.setMinSelectableDate(new Date());
        
        cargarAgenda();
        
    }
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public void cargarAgenda(){
       
          tblAgenda.setModel(modelo);
          ResultSet rs = null;

          int cantidadColumnas = 12;
          int cantidadFilas = 7;
          
          

          // SE AGREAN LOS NOMBRES DE COLUMNAS O ENCABEZADOS
          modelo.addColumn("");
          modelo.addColumn("08:00 am");
          modelo.addColumn("09:00 am");
          modelo.addColumn("10:00 am");
          modelo.addColumn("11:00 am");
          modelo.addColumn("12:00 pm");
          modelo.addColumn("01:00 pm");
          modelo.addColumn("02:00 pm");
          modelo.addColumn("03:00 pm");
          modelo.addColumn("04:00 pm");
          modelo.addColumn("05:00 pm");
          modelo.addColumn("06:00 pm");

//
//
// |||||||||SE NECESITA AMPLIAR EL ALTO DE LAS CELDAS|||||||||||||
//
//

          //SE DEFINE EL ANCHO DE CADA COLUMNA
         // int[] anchos = {50, 200, 50, 50,50,50};

          //ESTE FOR ASIGNA EL ANCHO A CADA COLUMNA
          for (int i = 0; i < cantidadColumnas; i++) {
              tblAgenda.getColumnModel().getColumn(i).setPreferredWidth(200);
          }

          
          // J = Filas     I = Columnas
          for (int j=0; j < cantidadFilas; j++)
          {
              Object[] filas = new Object[cantidadColumnas];
              for (int i = 0; i < cantidadColumnas; i++) 
              {
                  if (i==0&&j==0)
                    filas[i] = "Aditorio";
                  else if (i==0&&j==1) 
                    filas[i] = "Laboratorio Computo A";
                  else if (i==0&&j==2) 
                    filas[i] = "Laboratorio Computo B";
                  else if (i==0&&j==3) 
                    filas[i] = "Laboratorio Computo C";
                  else if (i==0&&j==4) 
                    filas[i] = "Laboratorio Computo Diseño";
                  else if (i==0&&j==5) 
                    filas[i] = "Laboratorio Computo Comunicación";
                      
                  /*switch(j)
                      {
                        case 0:                                  
                            filas[i] = "Aditorio";
                        case 1:
                            filas[i] = "Laboratorio Computo A";
                        case 2:
                            filas[i] = "Laboratorio Computo B";
                        case 3:
                            filas[i] = "Laboratorio Computo C";
                        case 4:
                            filas[i] = "Laboratorio Diseño";
                        case 5:
                            filas[i] = "Laboratorio Comunicación";                                  
                      }*/
              
             // filas[0] = "Auditorio";
              }
              //filas[0] = "Auditorio";
              
              
               modelo.addRow(filas);
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

        jcFecha = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        btnBuscar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcFechaMouseClicked(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAgenda);

        btnBuscar2.setText("Buscar2");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnBuscar)
                .addGap(34, 34, 34)
                .addComponent(btnBuscar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnBuscar2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcFechaMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jcFechaMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formato=new SimpleDateFormat("yyyy-mm-dd");
        Date fecha=null;
        try {
             fecha=formato.parse(jcFecha.getJCalendar().toString());
        } catch (ParseException ex) {
            Logger.getLogger(frmCalendario.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(rootPane, fecha.toString());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        // TODO add your handling code here:
        
        //Leer la fecha de jCalendar chosser
        Date jc_fecha=jcFecha.getDate();
        //Para convertir la fecha en tipo long para posteriormnete convertirlo en formato reconcocible por MYSQL
        long fecha=jc_fecha.getTime();
        //Convertimos la fecha de tipo long a MySQL
        java.sql.Date fecha_sql=new java.sql.Date(fecha);
        //Mostramos la fecha
        JOptionPane.showMessageDialog(null, fecha_sql);
    }//GEN-LAST:event_btnBuscar2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jcFecha;
    private javax.swing.JTable tblAgenda;
    // End of variables declaration//GEN-END:variables
}
