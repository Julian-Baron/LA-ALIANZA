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
public class Con_carrito {
    private int item;
    private String cod_pro;
    private String Nombre;
    private String descripcion;
    private int preciodecompra;
    private int cantidad;
    private double subtotal;

    public Con_carrito() {
    }

    public Con_carrito(int item, String cod_pro, String Nombre, String descripcion, int preciodecompra, int cantidad, double subtotal) {
        this.item = item;
        this.cod_pro = cod_pro;
        this.Nombre = Nombre;
        this.descripcion = descripcion;
        this.preciodecompra = preciodecompra;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

   

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPreciodecompra() {
        return preciodecompra;
    }

    public void setPreciodecompra(int preciodecompra) {
        this.preciodecompra = preciodecompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
