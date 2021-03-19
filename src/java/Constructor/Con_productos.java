
package Constructor;


public class Con_productos {
    private String cod_pro;
    private String descripcion;
    private int disponibles;
    private String marca;
    private String nombre_pro;
    private String precio;
    private String img;
    
    
    public Con_productos(String cod_pro, String descripcion, int disponibles, String marca, String nombre_pro, String precio) {
        this.cod_pro = cod_pro;
        this.descripcion = descripcion;
        this.disponibles = disponibles;
        this.marca = marca;
        this.nombre_pro = nombre_pro;
        this.precio = precio;
    }

    public Con_productos(String cod_pro, String descripcion, int disponibles, String marca, String nombre_pro, String precio, String img) {
        this.cod_pro = cod_pro;
        this.descripcion = descripcion;
        this.disponibles = disponibles;
        this.marca = marca;
        this.nombre_pro = nombre_pro;
        this.precio = precio;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    public Con_productos() {
    }

    public Con_productos(String cod_pro) {
        this.cod_pro = cod_pro;
    }
    
    

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
