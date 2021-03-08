/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.Conexion;
import Constructor.Con_Compras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Mod_Compras {
    Conexion con=new Conexion();
Connection cnn=con.conexionbd();
  
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public ArrayList<Con_Compras> consultarcompras(){
     ArrayList <Con_Compras> lista=new ArrayList<>();
     
    try {
       
        
        ps=cnn.prepareStatement("SELECT*FROM compra");
        
        rs=ps.executeQuery();
        
        while(rs.next()){
             Con_Compras us=new Con_Compras(rs.getString(4), rs.getString(2),  rs.getInt(3), rs.getString(1));
            lista.add(us);
        }
    } 
    
    catch (SQLException ex) {
        Logger.getLogger(Modelo_Productos.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return lista;
    }

    public boolean insertar_compra(Con_Compras us){
    boolean dat=false;
    int x;
    
        try {
            ps=cnn.prepareStatement("INSERT INTO compra  VALUES  (?,?,?,?)");
            ps.setString(1,us.getId_compra());
            ps.setString(2,us.getCod_pro());
            ps.setInt(3, us.getCantidad());
            ps.setString(4, us.getCedula());
            
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
    public boolean Modificar_compra(Con_Compras us){
    boolean dat=false;
    int x;
    
        try {
            ps=cnn.prepareStatement("Update compra set "
                    + "cedula='"+us.getCedula()
                    +"',cod_pro'"+us.getCod_pro()+"',"
                    + "cantidad='"+us.getCantidad()+"'"
                    
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
        public boolean eliminar_compra(Con_Compras us){
    boolean dat=false;
    int x;
    
        try {
            ps=cnn.prepareStatement("delete from compra where id_compra='"+us.getId_compra()+"'");
            
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
