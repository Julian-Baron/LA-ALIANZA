/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Constructor.Con_productos;
import Modelos.Modelo_Productos;

/**
 *
 * @author Personal
 */
public class ControladorProducto {
    
    public String getProductos(){
        Modelos.Modelo_Productos mp=new Modelo_Productos();
        String  htmlcode ="";
        
        for(Con_productos con: mp.consultarusuarios()){
            htmlcode  +="<div class=\"card\" style=\"\">\n" +
"                                <img src=\""+con.getImg()+"\" class=\"card-img-top\" alt=\"...\">\n" +
"                                <h1 class=\"card-header\">"+con.getNombre_pro()+"</h1>\n" +
"                                    <div class=\"card-body text-center\">\n" +
"                                      <p class=\"card-text\">Precio <b>"+con.getPrecio()+"</b></p>\n" +
"                                      <p class=\"card-footer\">"+con.getDescripcion()+"</p>\n" +
"                                      <div>\n" +
"                                          <a href=\"producto-detalles.jsp?id="+con.getCod_pro()+"\" class=\"btn btn-outline-info\">Ver detalles</a>\n" +
"                                      </div>\n" +
"                                      \n" +
"                         </div>\n";                                                          
        }
        
        return htmlcode;
    }
    
    public Con_productos getproducto(String id){
        
        return new Modelos.Modelo_Productos().listar(id);
        
    }
}
