
package consultorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Consulta_Historia extends javax.swing.JFrame {

    
         
    public Consulta_Historia() {
        initComponents();
        cargarcomboCedula();
        campo_nombre.setVisible(false);
        campo_sexo.setVisible(false);
        campo_eps.setVisible(false);
        campo_edad.setVisible(false);
        campo_sanguineo.setVisible(false);
        campo_consulta.setVisible(false);
        campo_diagnostico.setVisible(false);
        campo_tratamiento.setVisible(false);
        label_nombre.setVisible(false);
        label_sexo.setVisible(false);
        label_eps.setVisible(false);
        label_edad.setVisible(false);
        label_sanguineo.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        tabla_tratamientos.setVisible(false);
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


private void cargatabla()
{
 String titulos[]={"fecha","Medico","Consulta","Diagnostico","Tratamiento"};
 int c=0;
 DefaultTableModel m =new DefaultTableModel(null, titulos);
 String fila[]=new String[5];
 
 try
 {
 
        conectar con=new conectar();
        Connection reg= con.conexion();
        String sql; 
        sql=("SELECT * FROM `consulta` WHERE `paciente_id`= '" + id_paciente.getText() + "'");
        PreparedStatement pst=reg.prepareStatement(sql);
        ResultSet n=pst.executeQuery(sql);
        while(n.next())
            {
                fila[0]= n.getString("fecha");
                fila[1]= n.getString("medico_id");
                fila[2]= n.getString("consulta");
                fila[3]= n.getString("diagnostico");
                fila[4]= n.getString("tratamiento");
                m.addRow(fila);
            }
      tabla_tratamientos.setModel(m);
      this.tabla_tratamientos.setModel(m);
 }    
  catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }


}
        
private void verdetalle()
{
        int selectedRow = tabla_tratamientos.getSelectedRow();
        JOptionPane.showMessageDialog(null,selectedRow);
       



}
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        combo_cedula = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        label_nombre = new javax.swing.JLabel();
        label_sexo = new javax.swing.JLabel();
        campo_sexo = new javax.swing.JTextField();
        campo_edad = new javax.swing.JTextField();
        label_eps = new javax.swing.JLabel();
        campo_sanguineo = new javax.swing.JTextField();
        campo_eps = new javax.swing.JTextField();
        label_edad = new javax.swing.JLabel();
        label_sanguineo = new javax.swing.JLabel();
        id_paciente = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_tratamientos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_diagnostico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo_tratamiento = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        campo_consulta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel5.setText("CONSULTORIO ORTOPEDICO DR. ESTEBAN RIOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jLabel1.setText("Cedula:");

        campo_nombre.setEditable(false);
        campo_nombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_nombre.setEnabled(false);
        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        label_nombre.setText("Nombre:");

        label_sexo.setText("Sexo:");

        campo_sexo.setEditable(false);
        campo_sexo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_sexo.setEnabled(false);
        campo_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_sexoActionPerformed(evt);
            }
        });

        campo_edad.setEditable(false);
        campo_edad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_edad.setEnabled(false);
        campo_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_edadActionPerformed(evt);
            }
        });

        label_eps.setText("EPS");

        campo_sanguineo.setEditable(false);
        campo_sanguineo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_sanguineo.setEnabled(false);
        campo_sanguineo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_sanguineoActionPerformed(evt);
            }
        });

        campo_eps.setEditable(false);
        campo_eps.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_eps.setEnabled(false);
        campo_eps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_epsActionPerformed(evt);
            }
        });

        label_edad.setText("Edad:");

        label_sanguineo.setText("Grupo Sanguineo: ");

        tabla_tratamientos.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_tratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_tratamientosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabla_tratamientos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_eps)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(label_nombre))
                    .addComponent(label_sexo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(campo_eps))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_edad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_sanguineo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_sanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(combo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_paciente)
                        .addGap(92, 92, 92))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(id_paciente))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_sexo)
                    .addComponent(campo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_edad))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_eps)
                    .addComponent(campo_sanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_eps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_sanguineo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informacion General ", jPanel3);

        campo_diagnostico.setEditable(false);
        campo_diagnostico.setColumns(20);
        campo_diagnostico.setRows(5);
        campo_diagnostico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(campo_diagnostico);

        campo_tratamiento.setEditable(false);
        campo_tratamiento.setColumns(20);
        campo_tratamiento.setRows(5);
        campo_tratamiento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(campo_tratamiento);

        campo_consulta.setEditable(false);
        campo_consulta.setColumns(20);
        campo_consulta.setRows(5);
        campo_consulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(campo_consulta);

        jLabel2.setText("Consulta:");

        jLabel3.setText("Diagnostico:");

        jLabel4.setText("Tratamiento:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Anamnesis", jPanel4);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo_epsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_epsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_epsActionPerformed

    private void campo_sanguineoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_sanguineoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_sanguineoActionPerformed

    private void campo_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_edadActionPerformed

    private void campo_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_sexoActionPerformed

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void combo_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_cedulaActionPerformed

        campo_nombre.setText("");
        campo_sexo.setText("");
        campo_eps.setText("");
        campo_edad.setText("");
        campo_sanguineo.setText("");
        campo_consulta.setText("");
        campo_diagnostico.setText("");
        campo_tratamiento.setText("");

        try{

            conectar con=new conectar();
            Connection reg= con.conexion();
            String sql;
            sql=("SELECT * FROM `paciente` WHERE `cedula`= '" + (combo_cedula.getSelectedItem()) + "'");
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);
            n.next();
            this.id_paciente.setText(n.getString("id"));

        }

        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{

            conectar con=new conectar();
            Connection reg= con.conexion();
            String sql;
            sql=("SELECT * FROM `paciente` WHERE `cedula`= '" + (combo_cedula.getSelectedItem()) + "'");
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);
            n.next();
            this.campo_nombre.setText(n.getString("nombre")+" "+n.getString("apellido"));
            campo_nombre.setVisible(true);
            label_nombre.setVisible(true);
        }

        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{

            conectar con=new conectar();
            Connection reg= con.conexion();
            String sql;
            sql=("SELECT * FROM `paciente` WHERE `cedula`= '" + (combo_cedula.getSelectedItem()) + "'");
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);
            n.next();
            this.campo_sexo.setText(n.getString("sexo"));
            campo_sexo.setVisible(true);
            label_sexo.setVisible(true);
        }

        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{

            conectar con=new conectar();
            Connection reg= con.conexion();
            String sql;
            sql=("SELECT * FROM `paciente` WHERE `cedula`= '" + (combo_cedula.getSelectedItem()) + "'");
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);
            n.next();
            this.campo_eps.setText(n.getString("eps"));
            campo_eps.setVisible(true);
            label_eps.setVisible(true);
        }

        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{

            conectar con=new conectar();
            Connection reg= con.conexion();
            String sql;
            sql=("SELECT * FROM `paciente` WHERE `cedula`= '" + (combo_cedula.getSelectedItem()) + "'");
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);
            n.next();
            this.campo_edad.setText(n.getString("edad"));
            campo_edad.setVisible(true);
            label_edad.setVisible(true);
        }

        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{

            conectar con=new conectar();
            Connection reg= con.conexion();
            String sql;
            sql=("SELECT * FROM `paciente` WHERE `cedula`= '" + (combo_cedula.getSelectedItem()) + "'");
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);
            n.next();
            this.campo_sanguineo.setText(n.getString("sanguineo"));
            campo_sanguineo.setVisible(true);
            label_sanguineo.setVisible(true);
        }

        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        cargatabla();
        tabla_tratamientos.setVisible(true);
        
        
       

    /*    try{

            conectar con=new conectar();
            Connection reg= con.conexion();
            String sql;
            sql=("SELECT * FROM `consulta` WHERE `fecha`= '" + (combo_cedula.getSelectedItem()) + "'");
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);
            n.next();
            this.campo_consulta.setText(n.getString("consulta"));
            campo_consulta.setVisible(true);
            jLabel2.setVisible(true);
        }
        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{

            conectar con=new conectar();
            Connection reg= con.conexion();
            String sql;
            sql=("SELECT * FROM `tratamiento` WHERE `cedula`= '" + (combo_cedula.getSelectedItem()) + "'");
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);
            n.next();
            this.campo_diagnostico.setText(n.getString("diagnostico"));
            campo_diagnostico.setVisible(true);
            jLabel3.setVisible(true);
        }
        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{

            conectar con=new conectar();
            Connection reg= con.conexion();
            String sql;
            sql=("SELECT * FROM `tratamiento` WHERE `cedula`= '" + (combo_cedula.getSelectedItem()) + "'");
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet n=pst.executeQuery(sql);
            n.next();
            this.campo_tratamiento.setText(n.getString("tratamiento"));
            campo_tratamiento.setVisible(true);
            jLabel4.setVisible(true);
        }
        catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        } */
    }//GEN-LAST:event_combo_cedulaActionPerformed

    private void combo_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_cedulaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_cedulaMousePressed

    private void combo_cedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_cedulaMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_combo_cedulaMouseClicked

    private void tabla_tratamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_tratamientosMouseClicked
        

         verdetalle();



// TODO add your handling code here:
    }//GEN-LAST:event_tabla_tratamientosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campo_consulta;
    private javax.swing.JTextArea campo_diagnostico;
    private javax.swing.JTextField campo_edad;
    private javax.swing.JTextField campo_eps;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_sanguineo;
    private javax.swing.JTextField campo_sexo;
    private javax.swing.JTextArea campo_tratamiento;
    private javax.swing.JComboBox combo_cedula;
    private javax.swing.JLabel id_paciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_edad;
    private javax.swing.JLabel label_eps;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_sanguineo;
    private javax.swing.JLabel label_sexo;
    private javax.swing.JTable tabla_tratamientos;
    // End of variables declaration//GEN-END:variables

 
}
