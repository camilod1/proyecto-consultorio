/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CamiloD
 * 
 * fuente: https://www.youtube.com/watch?v=QrcZkB3KiiE
 */
public class ingreso_tratamiento extends javax.swing.JFrame {

    
    public ingreso_tratamiento() {
        initComponents();
        cargarcomboCedula();
        cargarcomboMedico();
   }
    
    private void cargarcomboCedula()
    {
        conectar con=new conectar();
        Connection reg= con.conexion();
        String sql;
        
           try{
            sql="SELECT * from paciente";
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);

            while(n.next())
            {
                String cedula = n.getString("cedula");
                combo_cedula.addItem(cedula);
            }
            
        }
        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
        private void cargarcomboMedico()
    {
        conectar con=new conectar();
        Connection reg= con.conexion();
        String sql;
        
           try{
            sql="SELECT * from medico";
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);

            while(n.next())
            {
                String doctor = n.getString("cedula");
                combo_medico.addItem(doctor);
            }
            
        }
        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        field_consulta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        field_diagnostico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        field_tratamiento = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combo_cedula = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        combo_medico = new javax.swing.JComboBox();
        campo_regmedico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campo_mediconame = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fecha_consulta = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        idpaciente = new javax.swing.JLabel();
        idmedico = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Ingreso Tratamiento");

        field_consulta.setColumns(20);
        field_consulta.setRows(5);
        jScrollPane1.setViewportView(field_consulta);

        jLabel2.setText("Consulta:");

        jLabel3.setText("Diagnostico:");

        jLabel4.setText("Tratamiento:");

        field_diagnostico.setColumns(20);
        field_diagnostico.setRows(5);
        jScrollPane2.setViewportView(field_diagnostico);

        field_tratamiento.setColumns(20);
        field_tratamiento.setRows(5);
        jScrollPane3.setViewportView(field_tratamiento);

        jButton1.setText("Grabar Tratamiento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Cedula Paciente");

        combo_cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_cedulaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combo_cedulaMousePressed(evt);
            }
        });
        combo_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_cedulaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre Paciente:");

        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        jLabel8.setText("Medico Tratante:");

        combo_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_medicoActionPerformed(evt);
            }
        });

        campo_regmedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_regmedicoActionPerformed(evt);
            }
        });

        jLabel9.setText("Registro Medico:");

        campo_mediconame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_mediconameActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre Medico:");

        fecha_consulta.setDateFormatString("dd/MMM/yyyy");

        jLabel11.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(285, 285, 285))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idpaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idmedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campo_mediconame))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(combo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(combo_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(225, 225, 225)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(campo_regmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(fecha_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(combo_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(campo_regmedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_mediconame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(idpaciente)
                    .addComponent(idmedico))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel5.setText("CONSULTORIO ORTOPEDICO DR. ESTEBAN RIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      conectar con=new conectar();
        Connection reg= con.conexion();
        String sql;
        historia_clinica historia=new historia_clinica(0,0,"","","",""); //declaramos un objeto tipo historia clinica
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String startDateString = dateFormat.format(fecha_consulta.getDate());
        
       
        historia.idpaciente=Integer.parseInt(idpaciente.getText());
        historia.idmedico=Integer.parseInt(idmedico.getText());
        historia.fecha=startDateString;        
        historia.consulta=field_consulta.getText();
        historia.diagnostico=field_diagnostico.getText();
        historia.tratamiento=field_tratamiento.getText();
        
       
      sql="INSERT INTO  consulta (paciente_id,medico_id,fecha,consulta,diagnostico,tratamiento)VALUES(?,?,?,?,?,?) ";
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setInt(1,historia.idpaciente);
            pst.setInt(2,historia.idmedico);
            pst.setString(3,historia.fecha);
            pst.setString(4,historia.consulta);
            pst.setString(5,historia.diagnostico);
            pst.setString(6,historia.tratamiento);
            int n=pst.executeUpdate();
            if(n>0){
            JOptionPane.showMessageDialog(null,"Registrado con exito");
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // int_cedula.setText("");
        field_consulta.setText("");
        field_diagnostico.setText("");
        field_tratamiento.setText("");
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void combo_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_cedulaActionPerformed

        try{
            
        conectar con=new conectar();
        Connection reg= con.conexion();
        String sql;
        sql=("SELECT * FROM `paciente` WHERE `cedula`= '" + (combo_cedula.getSelectedItem()) + "'");
        PreparedStatement pst=reg.prepareStatement(sql);
        ResultSet n=pst.executeQuery(sql);
        n.next();
        this.campo_nombre.setText(n.getString("nombre")+" "+n.getString("apellido"));
        String id_paciente = n.getString("id");
        this.idpaciente.setText(id_paciente);
        
        }
    
    catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }



// TODO add your handling code here:
    }//GEN-LAST:event_combo_cedulaActionPerformed

    private void combo_cedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_cedulaMouseClicked

    }//GEN-LAST:event_combo_cedulaMouseClicked

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void combo_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_cedulaMousePressed
       
         // TODO add your handling code here:
    }//GEN-LAST:event_combo_cedulaMousePressed

    private void combo_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_medicoActionPerformed
       try{
            
        conectar con=new conectar();
        Connection reg= con.conexion();
        String sql;
        sql=("SELECT * FROM `medico` WHERE `cedula`= '" + (combo_medico.getSelectedItem()) + "'");
        PreparedStatement pst=reg.prepareStatement(sql);
        ResultSet n=pst.executeQuery(sql);
        n.next();
        String registro_doctor = n.getString("tarjetap");
        this.campo_regmedico.setText(registro_doctor);
        this.campo_mediconame.setText(n.getString("nombre")+" "+n.getString("apellido"));
        String id_doctor = n.getString("id");
        this.idmedico.setText(id_doctor);
        }
    
    catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combo_medicoActionPerformed

    private void campo_regmedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_regmedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_regmedicoActionPerformed

    private void campo_mediconameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_mediconameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_mediconameActionPerformed


    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_mediconame;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_regmedico;
    private javax.swing.JComboBox combo_cedula;
    private javax.swing.JComboBox combo_medico;
    private com.toedter.calendar.JDateChooser fecha_consulta;
    private javax.swing.JTextArea field_consulta;
    private javax.swing.JTextArea field_diagnostico;
    private javax.swing.JTextArea field_tratamiento;
    private javax.swing.JLabel idmedico;
    private javax.swing.JLabel idpaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
