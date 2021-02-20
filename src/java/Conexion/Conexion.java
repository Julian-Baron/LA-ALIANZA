package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    
    Connection cnn;
    public Connection conexionbd(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
            try {
                cnn=DriverManager.getConnection("jdbc:mysql://localhost/proyecto_final","root","");
                System.out.println("Conexion.Conexion.conexionbd() "+cnn);
            } catch (Exception e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (Exception e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        return cnn;
    }
    public static void main (String[]args){
        Conexion con=new Conexion();
        con.conexionbd();
        
    }
}
