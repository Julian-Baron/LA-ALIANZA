/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.Conexion;
import Constructor.Con_login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Mod_login {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public ArrayList<Constructor.Con_login> loginusu (Con_login log){
      ArrayList<Con_login> datos=new ArrayList<>();
        try {
            ps=cnn.prepareStatement("SELECT usuarios.cedula, usuarios.nombre_usu, usuarios.contraseña, usuarios.rol, usuarios.sexo, clientes.nombre_cli "
                    + "FROM usuarios inner join clientes on usuarios.cedula=clientes.cedula "
                    + "WHERE (nombre_usu='"+log.getNombre_usu()+"' AND contraseña='"+log.getContraseña()+"');");
            rs=ps.executeQuery();
            while(rs.next()){
                Con_login logusu=new Con_login(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                datos.add(logusu);        
            }      
        }
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);      
        }   
      return datos;   
    } 
    
}
