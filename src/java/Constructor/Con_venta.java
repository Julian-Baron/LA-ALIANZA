/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author jyopa
 */
public class Con_venta {
    
    private String id_compra;
    private String cod_pro;
    private String nombre;
    private String Descripcion;
    private int cantidad;
    private String cedula;
    private String precio;

    public Con_venta(String id_compra, String cod_pro, int cantidad, String cedula) {
        this.id_compra = id_compra;
        this.cod_pro = cod_pro;
        this.cantidad = cantidad;
        this.cedula = cedula;
    }

    public Con_venta(String id_compra, String cod_pro, String nombre, String Descripcion, int cantidad, String cedula, String precio) {
        this.id_compra = id_compra;
        this.cod_pro = cod_pro;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.cantidad = cantidad;
        this.cedula = cedula;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    public Con_venta(){
        
    }

    public String getId_compra() {
        return id_compra;
    }

    public void setId_compra(String id_compra) {
        this.id_compra = id_compra;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
