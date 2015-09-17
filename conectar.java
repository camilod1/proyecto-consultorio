package consultorio;

import java.sql.*;
import javax.swing.JOptionPane;

public class conectar {
       
    Connection con=null;
    public Connection conexion(){
    
        try {
    //metodo para cargar el driver de conexion
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_pacientes","root","");
            System.out.println("Se ha establecido la conexion");
         //   JOptionPane.showMessageDialog(null,"Conexion establecida");
        
        }
    
     //catch para capturar mensajes o errores   
        catch (ClassNotFoundException| SQLException e)
    {
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null,"error de conexion "+e);
                
    }
    return con;
    }
    
}
