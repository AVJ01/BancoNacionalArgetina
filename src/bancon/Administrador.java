/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancon;

import AServidor.MySQL;
import AServidor.CuentasClientes;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import static java.lang.Math.random;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Random;
import java.security.SecureRandom;
/**
 *
 * @author AVJ
 */
public class Administrador extends javax.swing.JFrame {
    private int NOC;   
    private String nombre;
    private String apellidos;
    private String contraseña;
    private float multa;
    private float Dretirado;
    private float dinero;
 MySQL conex = new MySQL();
   PreparedStatement p=null;
    ResultSet BP;
    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
              cargarTabla();
   this.setLocationRelativeTo(null);
    }

    /**
      
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NOM = new javax.swing.JTextField();
        AP = new javax.swing.JTextField();
        DI = new javax.swing.JTextField();
        CONTRA = new javax.swing.JTextField();
        NC = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        BTNCREAR = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idcliente1 = new javax.swing.JTextField();
        nombre1 = new javax.swing.JTextField();
        apellidos1 = new javax.swing.JTextField();
        dinero1 = new javax.swing.JTextField();
        multas1 = new javax.swing.JTextField();
        dretirado1 = new javax.swing.JTextField();
        contraseña1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(801, 450));

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbclientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cuentas de los clientes", jPanel1);

        jLabel10.setText("Nombre:");

        jLabel11.setText("Inserte datos de cuenta:");

        jLabel12.setText("Apellidos:");

        jLabel13.setText("Dinero a ingresar:");

        jLabel14.setText("Contraseña:");

        jLabel15.setText("Numero de cuenta:");

        NOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMActionPerformed(evt);
            }
        });
        NOM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NOMKeyTyped(evt);
            }
        });

        AP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                APKeyTyped(evt);
            }
        });

        DI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DIKeyTyped(evt);
            }
        });

        CONTRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CONTRAKeyTyped(evt);
            }
        });

        NC.setEditable(false);

        jButton3.setText("Generar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BTNCREAR.setText("CREAR");
        BTNCREAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCREARActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar todo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTNCREAR)
                                    .addComponent(CONTRA)
                                    .addComponent(DI, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AP)
                                    .addComponent(NOM)
                                    .addComponent(NC))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CONTRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(NC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCREAR)
                    .addComponent(jButton4))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear cuenas clientes", jPanel3);

        jLabel1.setText("Para buscar ingrese el numero de cuenta:");

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Id Cliente:");

        jLabel5.setText("Dinero total:");

        jLabel6.setText("Multas:");

        jLabel7.setText("Dinero que ha sido retirado:");

        jLabel8.setText("Contraseña:");

        jLabel9.setText("Para modificar un dato, puede cambiar el valor y guardarlo: ");

        idcliente1.setEditable(false);
        idcliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcliente1ActionPerformed(evt);
            }
        });

        nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre1KeyTyped(evt);
            }
        });

        apellidos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidos1KeyTyped(evt);
            }
        });

        dinero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dinero1KeyTyped(evt);
            }
        });

        multas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                multas1KeyTyped(evt);
            }
        });

        dretirado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dretirado1KeyTyped(evt);
            }
        });

        contraseña1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseña1KeyTyped(evt);
            }
        });

        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        update.setText("MODIFICAR");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("ELIMINAR CUENTA");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton5.setText("Limpiar registros");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(174, 174, 174))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbuscar))
                                .addGap(171, 171, 171))
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(update))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(idcliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(nombre1)
                        .addComponent(apellidos1)
                        .addComponent(dinero1)
                        .addComponent(multas1)
                        .addComponent(dretirado1)
                        .addComponent(contraseña1)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(idcliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dinero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(multas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dretirado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar clientes", jPanel2);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
      
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void idcliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcliente1ActionPerformed

    }//GEN-LAST:event_idcliente1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
             String buscar = txtbuscar.getText();
         
    try {
       p=conex.getConnection().prepareStatement("SELECT * FROM clientes WHERE NoCuenta=?");
            p.setString(1,buscar);
            BP=p.executeQuery();
            if(BP.next()){
                 idcliente1.setText(BP.getString("idclientes"));
                 nombre1.setText(BP.getString("nombre"));
                 apellidos1.setText(BP.getString("apellidos"));
                 dinero1.setText(BP.getString("dinero"));
                 multas1.setText(BP.getString("multa"));
                 dretirado1.setText(BP.getString("Dretirado"));
                 contraseña1.setText(BP.getString("contraseña"));
            }else{
            JOptionPane.showMessageDialog(null,"No esta en el registro");
            }
             BP.close();
    
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);

    }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                 txtbuscar.setText("");
                 idcliente1.setText("");
                 nombre1.setText("");
                 apellidos1.setText("");
                 dinero1.setText("");
                 multas1.setText("");
                 dretirado1.setText("");
                 contraseña1.setText("");
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
            char car=evt.getKeyChar();
        if((car<'0' || car>'9') && (car>'.')&& (car > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
            
        }
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre1KeyTyped
         char c = evt.getKeyChar();
        
        if((c<'a'||c>'z' ) && (c<'A'||c>'Z' )&& (c > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
                    }
    }//GEN-LAST:event_nombre1KeyTyped

    private void apellidos1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidos1KeyTyped
        char c = evt.getKeyChar();
        
        if((c<'a'||c>'z' ) && (c<'A'||c>'Z' )&& (c > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
                    }
    }//GEN-LAST:event_apellidos1KeyTyped

    private void contraseña1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseña1KeyTyped
         char c = evt.getKeyChar();
        
        if((c<'a'||c>'z' ) && (c<'A'||c>'Z' )&& (c<'0' || c>'9') && (c>'.')&& (c > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
                    }
    }//GEN-LAST:event_contraseña1KeyTyped

    private void dinero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dinero1KeyTyped
             char car=evt.getKeyChar();
        if((car<'0' || car>'9') && (car>'.')&& (car > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
            
        }
    }//GEN-LAST:event_dinero1KeyTyped

    private void multas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_multas1KeyTyped
              char car=evt.getKeyChar();
        if((car<'0' || car>'9') && (car>'.')&& (car > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
            
        }
    }//GEN-LAST:event_multas1KeyTyped

    private void dretirado1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dretirado1KeyTyped
             char car=evt.getKeyChar();
        if((car<'0' || car>'9') && (car>'.')&& (car > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
            
        }
    }//GEN-LAST:event_dretirado1KeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
cargarTabla();       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        CuentasClientes delete = new CuentasClientes();
        
            delete.Eliminar(txtbuscar.getText());
                 txtbuscar.setText("");
                 idcliente1.setText("");
                 nombre1.setText("");
                 apellidos1.setText("");
                 dinero1.setText("");
                 multas1.setText("");
                 dretirado1.setText("");
                 contraseña1.setText("");
         //JOptionPane.showMessageDialog(null,"Cuenta del cliente ha sido eliminada");
        cargarTabla();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        CuentasClientes ubdate = new CuentasClientes();
        
        ubdate.Modificar(txtbuscar.getText(),nombre1.getText(),apellidos1.getText(),dinero1.getText(),multas1.getText(),dretirado1.getText(),contraseña1.getText());
        cargarTabla();
    }//GEN-LAST:event_updateActionPerformed

    private void NOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMActionPerformed
  
    }//GEN-LAST:event_NOMActionPerformed

    private void NOMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NOMKeyTyped
char c = evt.getKeyChar();
        
        if((c<'a'||c>'z' ) && (c<'A'||c>'Z' )&& (c > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
                    }       
    }//GEN-LAST:event_NOMKeyTyped

    private void APKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_APKeyTyped
         char c = evt.getKeyChar();
        
        if((c<'a'||c>'z' ) && (c<'A'||c>'Z' )&& (c > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
                    }
    }//GEN-LAST:event_APKeyTyped

    private void CONTRAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CONTRAKeyTyped
        char c = evt.getKeyChar();
        
        if((c<'a'||c>'z' ) && (c<'A'||c>'Z' )&& (c<'0' || c>'9') && (c>'.')&& (c > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
                    }
    }//GEN-LAST:event_CONTRAKeyTyped

    private void DIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DIKeyTyped
            char car=evt.getKeyChar();
        if((car<'0' || car>'9') && (car>'.')&& (car > VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
            
        }
    }//GEN-LAST:event_DIKeyTyped

    private void BTNCREARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCREARActionPerformed
        nombre=NOM.getText();
        apellidos=AP.getText();
        contraseña=CONTRA.getText();
        multa=0;
        dinero=Float.parseFloat(DI.getText());
        Dretirado=0;
        NOC=Integer.parseInt(NC.getText());
        
        
        CuentasClientes save=new CuentasClientes();
         if(NOM.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Campo Vacio, por favor ingrese valores");
            return;
        }else{
        int n = JOptionPane.showConfirmDialog(BTNCREAR, "Confirme si esta seguro de agregar cuenta?","Question",JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION){
             try {
           save.insertar(NOC,nombre,apellidos, dinero,multa,Dretirado,contraseña);
           
           
        } catch (Exception ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    }
        
        
    }//GEN-LAST:event_BTNCREARActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Random aleatorio = new Random(System.currentTimeMillis());
        int entero = aleatorio.nextInt(100000000);
        NC.setText(String.valueOf(entero));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                 NC.setText("");
                 NOM.setText("");
                 AP.setText("");
                 CONTRA.setText("");
                 DI.setText("");       
    }//GEN-LAST:event_jButton4ActionPerformed
public void cargarTabla()
    {
        DefaultTableModel modelo =  new DefaultTableModel(); 
        tbclientes.getModel();
        tbclientes.setModel(modelo);

        CuentasClientes listaP=new CuentasClientes();
        ArrayList<Clientes>miLista=listaP.mostrarClientes();
           try {
                    modelo.addColumn("Id Clientes");
                    modelo.addColumn("No.de Cuenta");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellidos");
                    modelo.addColumn("Dinero");
                    modelo.addColumn("Multas");
                    modelo.addColumn("Dinero Retirado");
                    modelo.addColumn("Contraseña de cuenta");


        for(int i=0;i<miLista.size();i++)
            {
                
               Object []ob = new Object[8];
               ob[0]=miLista.get(i).getIdC();
               ob[1]=miLista.get(i).getNoCuenta();
               ob[2]=miLista.get(i).getNombre();
               ob[3]=miLista.get(i).getApellidos();
               ob[4]=miLista.get(i).getDinero();
               ob[5]=miLista.get(i).getMulta();
               ob[6]=miLista.get(i).getDretirado();
               ob[7]=miLista.get(i).getContraseña();
               System.out.println(ob);
               modelo.addRow(ob);
             }
             }   catch (Exception ex) {
                        System.out.println(ex.getMessage());
             }
    }
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AP;
    private javax.swing.JButton BTNCREAR;
    private javax.swing.JTextField CONTRA;
    private javax.swing.JTextField DI;
    private javax.swing.JTextField NC;
    private javax.swing.JTextField NOM;
    private javax.swing.JTextField apellidos1;
    private javax.swing.JTextField contraseña1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dinero1;
    private javax.swing.JTextField dretirado1;
    private javax.swing.JTextField idcliente1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField multas1;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
