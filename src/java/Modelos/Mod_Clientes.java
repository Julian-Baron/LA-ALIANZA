/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.Conexion;
import Constructor.Con_clientes;
import Constructor.Con_productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Mod_Clientes {
    Conexion con=new Conexion();
Connection cnn=con.conexionbd();
  
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public ArrayList<Con_clientes> consultar_clientes(){
        
    ArrayList <Con_clientes> lista=new ArrayList<>();
     
    try {
       
        
        ps=cnn.prepareStatement("SELECT*FROM clientes");
        
        rs=ps.executeQuery();
        
        while(rs.next()){
             Con_clientes us=new Con_clientes(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            lista.add(us);
        }
    } 
    
    catch (SQLException ex) {
        Logger.getLogger(Modelo_Productos.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error "+ex);
    }
    
    return lista;
    }

    public boolean insertar_Clientes(Con_clientes us){
    boolean dat=false;
    int x;
    
        try {
            ps=cnn.prepareStatement("INSERT INTO clientes  VALUES  (?,?,?,?,?,?)");
            ps.setString(1,us.getCedula());
            ps.setString(2,us.getNombre());
            ps.setString(3, us.getApellido());
             ps.setString(4, us.getCorreo());
            ps.setString(5,us.getDireccion());
            ps.setString(6, us.getTelefono());
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
    public boolean modificar_producto(Con_clientes us){
        boolean dat=false;
        int x;

            try {
                ps=cnn.prepareStatement("update clientes SET "
                        + "telefono_cli='"+us.getTelefono()+"',"
                        + "nombre_cli='"+us.getNombre()+"',"
                        + "apellido_cli='"+us.getApellido()+"',"
                        + "correo_cli='"+us.getCorreo()+"',"
                        + "direccion_cli='"+us.getDireccion()+"'"
                        + "WHERE cedula='"+us.getCedula()+"'");
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
    
    public boolean eliminar_producto(Con_clientes us){
        boolean dat=false;
        int x;

            try {
                ps=cnn.prepareStatement("delete from clientes where cedula='"+us.getCedula()+"'");
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
