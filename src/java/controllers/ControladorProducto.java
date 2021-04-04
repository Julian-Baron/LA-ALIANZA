package controllers;

import Constructor.Con_productos;
import Modelos.Modelo_Productos;


public class ControladorProducto {
    public String getProductos(){
        String htmdoc="";
        Modelos.Modelo_Productos mod=new Modelo_Productos();
        
        for(Con_productos con: mod.consultarusuarios()){
            htmdoc+="<div class=\"card\" style=\"\">\n" +
"                                <img src=\""+con.getImg()+"\" class=\"card-img-top\" alt=\"...\">\n" +
"                                <h1 class=\"card-header\">"+con.getNombre_pro()+"</h1>\n" +
"                                    <div class=\"card-body text-center\">\n" +
"                                      <p class=\"card-text\">Precio <b>"+con.getPrecio()+"</b></p>\n" +
"                                      <p class=\"card-footer\">"+con.getDescripcion()+"</p>\n" +
"                                      <div>\n" +
"                                          <a href=\"producto-detalles.jsp?id="+con.getCod_pro()+"\" class=\"btn btn-outline-info\">Ver detalles</a>\n" +
"                                      </div>\n" +                 
"                                </div>\n"+
"                                </div>\n";
        }
        
        
        return htmdoc;
    }
    public Con_productos getproducto(String id){
        
        return new Modelos.Modelo_Productos().listar(id);
        
    }
}
