package Constructor;


public class Con_Compras {
    private String Cedula;
    private String cod_pro;
    private int cantidad;
    private String id_compra;

    public Con_Compras() {
    }

    public Con_Compras(String Cedula, String cod_pro, int cantidad, String id_compra) {
        this.Cedula = Cedula;
        this.cod_pro = cod_pro;
        this.cantidad = cantidad;
        this.id_compra = id_compra;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
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

    public String getId_compra() {
        return id_compra;
    }

    public void setId_compra(String id_compra) {
        this.id_compra = id_compra;
    }
    
    
}
