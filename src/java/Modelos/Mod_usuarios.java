/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.Conexion;
import Constructor.Con_Compras;
import Constructor.Con_usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Mod_usuarios {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
  
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public ArrayList<Con_usuarios> consultar_usuarios(){
     ArrayList <Con_usuarios> lista=new ArrayList<>();
     
    try {
       
        
        ps=cnn.prepareStatement("SELECT*FROM usuarios");
        
        rs=ps.executeQuery();
        
        while(rs.next()){
             Con_usuarios us=new Con_usuarios(rs.getString(1), rs.getString(2),  rs.getString(3), rs.getString(4), rs.getString(5));
            lista.add(us);
        }
    } 
    
    catch (SQLException ex) {
        Logger.getLogger(Modelo_Productos.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return lista;
    }
    
    
     public boolean insertar_usuarios(Con_usuarios us){
    boolean dat=false;
    int x;
    
        try {
            ps=cnn.prepareStatement("INSERT INTO usuarios  VALUES  (?,?,?,?,?)");
            ps.setString(1,us.getCedula());
            ps.setString(2,us.getNombre_usu());
            ps.setString(3, us.getContraseña());
            ps.setString(4, us.getRol());
            ps.setString(5, us.getSexo());
            x=ps.executeUpdate();
            
            if(x>0){
                dat=true;
            }
                
            }
         
         
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
   
    return dat;
    }
    
     
     public boolean Modificar_usuarios(Con_usuarios us){
    boolean dat=false;
    int x;
    
        try {
            ps=cnn.prepareStatement("Update usuarios set "
                    + "nombre_usu='"+us.getNombre_usu()
                    +"',contraseña='"+us.getContraseña()+"',"
                    + "rol='"+us.getRol()+"',"
                    + "sexo='"+us.getSexo()+"'"
                            + "where cedula='"+us.getCedula()+"'");
                       
            x=ps.executeUpdate();
            
            if(x>0){
                dat=true;
            }
                
            }
         
         
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
   
    return dat;
    }
    
     public boolean eliminar_usuarios(Con_usuarios us){
    boolean dat=false;
    int x;
    
        try {
            ps=cnn.prepareStatement("delete from usuarios where cedula='"+us.getCedula()+"'");
           
            
            x=ps.executeUpdate();
            
            if(x>0){
                dat=true;
            }
                
            }
         
         
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
   
    return dat;
    }
    
    
}
