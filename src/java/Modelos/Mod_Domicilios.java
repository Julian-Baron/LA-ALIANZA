/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.Conexion;
import Constructor.Con_Domicilios;
import Constructor.Con_productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Mod_Domicilios {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
  
    PreparedStatement ps=null;
    ResultSet rs=null;
    public ArrayList<Con_Domicilios> Consultar_Domicilios(){
     ArrayList <Con_Domicilios> lista=new ArrayList<>();
     
    try {
        
        ps=cnn.prepareStatement("SELECT*FROM domicilio");
        
        rs=ps.executeQuery();
        
        while(rs.next()){
             Con_Domicilios us=new Con_Domicilios(rs.getString(4), rs.getString(1), rs.getString(2), rs.getString(3));
            lista.add(us);
        }
    } 
    
    catch (SQLException ex) {
        Logger.getLogger(Modelo_Productos.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return lista;
    }

    public boolean insertar_domicilio(Con_Domicilios us){
    boolean dat=false;
    int x;
    
        try {
            ps=cnn.prepareStatement("INSERT INTO domicilio  VALUES  (?,?,?,?)");
            ps.setString(1,us.getCod_domicilio());
            ps.setString(2,us.getFechaPedido());
            ps.setString(3, us.getId_compra());
            ps.setString(4,us.getCedula());
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
    public boolean modificar_domicilio(Con_Domicilios us){
        boolean dat=false;
        int x;

            try {
                ps=cnn.prepareStatement("update domicilio"
                        + "SET "
                        + " fecha_pedido='"+us.getFechaPedido()+"',"
                                + "id_compra='"+us.getId_compra()+"',"
                                        + "cedula='"+us.getCedula()+"'"
                                                + "WHERE cod_domicilio='"+us.getCod_domicilio()+"'");
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
    
    public boolean eliminar_domiciliov(Con_Domicilios us){
        boolean dat=false;
        int x;

            try {
                ps=cnn.prepareStatement("delete domicilio "
                        + "where cod_domicilio='"+us.getCod_domicilio()+"'");
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
