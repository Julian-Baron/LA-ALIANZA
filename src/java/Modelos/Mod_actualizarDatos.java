/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Conexion.Conexion;
import Constructor.Con_actualizarDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Mod_actualizarDatos {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
  
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    public ArrayList<Con_actualizarDatos> consultar_actualizacion(){
        ArrayList<Con_actualizarDatos> data=new ArrayList<>();
        try {
            String consulta="Select clientes.nombre_cli,clientes.apellido_cli,clientes.correo_cli,clientes.direccion_cli,clientes.telefono_cli,usuarios.nombre_usu,usuarios.contraseña,usuarios.sexo,usuarios.cedula FROM usuarios INNER JOIN clientes ON usuarios.cedula=clientes.cedula WHERE usuarios.cedula=";
            ps=cnn.prepareStatement(consulta);
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                Con_actualizarDatos lista=new Con_actualizarDatos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(2), 0, rs.getString(5), rs.getString(6), rs.getString(7), 0);
                data.add(lista);
            }
        
        } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al intentar capatar los datos"+ e);
        }
        return data;
    }
    
    
    public boolean insertar_datos(Con_actualizarDatos us){
        boolean dat=false;
        int x;
        
        try {
            String consulta="UPDATE `clientes` SET `cedula`=[value-1],`nombre_cli`=[value-2],`apellido_cli`=[value-3],`correo_cli`=[value-4],`direccion_cli`=[value-5],`telefono_cli`=[value-6] WHERE 1";
            ps=cnn.prepareStatement(consulta);
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar los datos de usuarios"+e);
        }
        
        
       return dat; 
    }
            
}
