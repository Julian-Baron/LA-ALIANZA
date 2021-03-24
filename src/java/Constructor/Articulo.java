
package Constructor;

public class Articulo {
    
    private String idProducto;
    private String name;
    private int cantidad;
    private int precio;

    public Articulo() {
    }

    public Articulo(String idProducto, int cantidad) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public Articulo(String idProducto, String name, int cantidad, int precio) {
        this.idProducto = idProducto;
        this.name = name;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
