
package consultorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.ButtonModel;



public class ingreso_usuario extends javax.swing.JFrame {

String cadena;



    public ingreso_usuario() {
        initComponents();
        alista();
    }

 
    
public void alista(){
validaCedula.setVisible(false);
validaNombre.setVisible(false);
validaApellido.setVisible(false);
}    
    
public int validar(){
    int resultado=0;
    if(int_cedula.getText().equals("")){
    
        validaCedula.setVisible(true);
        resultado=1;
    }
    else{
    validaCedula.setVisible(false);
    resultado=0;
    
    }
    
    
  if(text_nombre.getText().equals("")){
    
        validaNombre.setVisible(true);
        
        resultado=1;
    }
  else{
  validaNombre.setVisible(false);
   resultado=0;
  
  }
  
    if(text_apellido.getText().equals("")){
    
        validaApellido.setVisible(true);
        resultado=1;
    }
    else{
    
    
    validaApellido.setVisible(false);
     resultado=0;
    
    }
    return resultado;
}    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        text_sanguineo = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        int_cedula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        text_sexo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        int_edad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_apellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_nacimiento = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        text_rh = new javax.swing.JComboBox();
        boton_positivo = new javax.swing.JRadioButton();
        boton_negativo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        text_eps = new javax.swing.JComboBox();
        validaCedula = new javax.swing.JLabel();
        validaNombre = new javax.swing.JLabel();
        validaApellido = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CONSULTORIO ORTOPEDICO DR. ESTEBAN RIOS");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Registro de Pacientes");

        jLabel2.setText("Cedula:");

        int_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_cedulaActionPerformed(evt);
            }
        });

        jLabel9.setText("Sexo:");

        text_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----", "Masculino", "Femenino" }));

        jLabel3.setText("Nombre:");

        jLabel7.setText("Edad:");

        int_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_edadActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido:");

        text_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_apellidoActionPerformed(evt);
            }
        });

        jLabel11.setText("EPS:");

        jLabel6.setText("Fecha Nacimiento: ");

        text_nacimiento.setDateFormatString("dd/MMM/yyyy");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("RH:");

        text_rh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NONE", "A", "B", "AB", "O" }));
        text_rh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_rhActionPerformed(evt);
            }
        });

        text_sanguineo.add(boton_positivo);
        boton_positivo.setText("Positivo");
        boton_positivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_positivoMouseClicked(evt);
            }
        });
        boton_positivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_positivoActionPerformed(evt);
            }
        });

        text_sanguineo.add(boton_negativo);
        boton_negativo.setText("Negativo");
        boton_negativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_negativoMouseClicked(evt);
            }
        });

        jLabel8.setText("Tipo Sanguineo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_rh, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_positivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_negativo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel8)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(text_rh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_positivo)
                    .addComponent(boton_negativo))
                .addContainerGap())
        );

        text_eps.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----", "Nueva Eps", "Aliansalud", "CafeSalud", "Sanitas", "Colmedica", "Famisanar", "SaludTotal", "Compensar" }));

        validaCedula.setForeground(new java.awt.Color(255, 0, 0));
        validaCedula.setText("*");

        validaNombre.setForeground(new java.awt.Color(255, 0, 0));
        validaNombre.setText("*");

        validaApellido.setForeground(new java.awt.Color(255, 0, 0));
        validaApellido.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(139, 139, 139))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(text_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(int_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(validaCedula))
                                    .addComponent(text_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                        .addComponent(validaNombre)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(validaApellido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(int_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_eps, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(text_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(validaCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(int_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(validaNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(text_eps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validaApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void int_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_int_cedulaActionPerformed

    private void text_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_apellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //metodos para la limpieza de los campoos del formulario
        int_cedula.setText("");
        text_nombre.setText("");
        text_apellido.setText("");
        text_nacimiento.setDate(null);
        int_edad.setText("");
        alista();
        //text_sexo.setToolTipText(null);   
        //text_eps.setModel(null);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //insercion de datos a base de datos
        paciente nuevo=new paciente(0,"","","",0,"","","");
                
        conectar con=new conectar();
        Connection reg= con.conexion();
        String conversion1;
        String conversion2;
        Date conversion3;
        
        String sql;
       
             
        
        int x=0;
        x=validar();
        
        if (x==0){
            
        conversion1=int_cedula.getText(); // convierte text field en entero
        nuevo.cedula=Integer.parseInt(conversion1); //asigna valor a cedula;
        
        nuevo.nombre=text_nombre.getText();
        
        nuevo.apellido=text_apellido.getText();
        
       //convertimos el formato de la fecha y luego lo asigamos a el atributo de la clase
        // fuente http://stackoverflow.com/questions/13195462/how-can-i-parse-the-output-from-a-jdatechooser-field-into-something-useful
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String startDateString = dateFormat.format(text_nacimiento.getDate());
        nuevo.fechanacimiento=startDateString;
             
         
        conversion2=int_edad.getText(); // convierte text field en entero
        nuevo.edad=Integer.parseInt(conversion2); //asigna valor a edad;
        
        nuevo.sexo=(String) text_sexo.getSelectedItem();
        
        nuevo.eps=(String) text_eps.getSelectedItem();
          
        nuevo.gruposanguineo=(text_rh.getSelectedItem())+" "+cadena;    
            
            
        sql="INSERT INTO  paciente (cedula,nombre,apellido,nacimiento,edad,sexo,eps,sanguineo)VALUES(?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setInt(1,nuevo.cedula);
            pst.setString(2,nuevo.nombre);
            pst.setString(3,nuevo.apellido);
            pst.setString(4,nuevo.fechanacimiento);
            pst.setInt(5,nuevo.edad);
            pst.setString(6,nuevo.sexo);
            pst.setString(7,nuevo.eps);
            pst.setString(8,nuevo.gruposanguineo);
            int n=pst.executeUpdate();
            if(n>0){
             JOptionPane.showMessageDialog(null,"Registrado con exito");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ingreso_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       else
        {
        JOptionPane.showMessageDialog(null,"hay campos sin diligenciar");
        
        }
            
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void int_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_int_edadActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void boton_positivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_positivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_positivoActionPerformed

    private void text_rhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_rhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_rhActionPerformed

    private void boton_positivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_positivoMouseClicked
        // TODO add your handling code here:
        cadena=boton_positivo.getLabel();
        
    }//GEN-LAST:event_boton_positivoMouseClicked

    private void boton_negativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_negativoMouseClicked
        // TODO add your handling code here:
        cadena=boton_negativo.getLabel();
       
    }//GEN-LAST:event_boton_negativoMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boton_negativo;
    private javax.swing.JRadioButton boton_positivo;
    private javax.swing.JTextField int_cedula;
    private javax.swing.JTextField int_edad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField text_apellido;
    private javax.swing.JComboBox text_eps;
    private com.toedter.calendar.JDateChooser text_nacimiento;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JComboBox text_rh;
    public static javax.swing.ButtonGroup text_sanguineo;
    private javax.swing.JComboBox text_sexo;
    private javax.swing.JLabel validaApellido;
    private javax.swing.JLabel validaCedula;
    private javax.swing.JLabel validaNombre;
    // End of variables declaration//GEN-END:variables
}
