
package Modelos;

import Conexion.Conexion;
import Constructor.Con_productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Modelo_Productos {
    Conexion con=new Conexion();
Connection cnn=con.conexionbd();
  
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public ArrayList<Con_productos> consultarusuarios(){
     ArrayList <Con_productos> lista=new ArrayList<>();
     
    try {
       
        
        ps=cnn.prepareStatement("SELECT*FROM producto");
        
        rs=ps.executeQuery();
        
        while(rs.next()){
             Con_productos us=new Con_productos(rs.getString(1), rs.getString(6), rs.getInt(5), rs.getString(3), rs.getString(2), rs.getString(4), rs.getString(7));
            lista.add(us);
        }
    } 
    
    catch (SQLException ex) {
        Logger.getLogger(Modelo_Productos.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return lista;
    }

    public boolean insertar_producto(Con_productos us){
    boolean dat=false;
    int x;
    
        try {
            ps=cnn.prepareStatement("INSERT INTO producto  VALUES  (?,?,?,?,?,?,?)");
            ps.setString(1,us.getCod_pro());
            ps.setString(2,us.getNombre_pro());
            ps.setString(3, us.getMarca());
            ps.setInt(4, us.getDisponibles());
            ps.setString(5,us.getPrecio());
            ps.setString(6, us.getDescripcion());
            ps.setString(7, us.getImg());
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
    public boolean modificar_producto(Con_productos us){
        boolean dat=false;
        int x;

            try {
                ps=cnn.prepareStatement("update producto SET " + "nombre_pro='"+us.getNombre_pro()+"'," + "marca_pro='"+us.getMarca()+"'," + "disponibles='"+us.getDisponibles()+"',"
                        + "precio_pro='"+us.getPrecio()+"'," + "descripcion_pro='"+us.getDescripcion()+"'" + "WHERE cod_pro='"+us.getCod_pro()+"'");
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
    
    public boolean eliminar_producto(Con_productos us){
        boolean dat=false;
        int x;

            try {
                ps=cnn.prepareStatement("delete From producto where cod_pro='"+us.getCod_pro()+"'");
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
