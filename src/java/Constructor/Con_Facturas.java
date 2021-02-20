package Constructor;


public class Con_Facturas {
    private int id_factura;
    private String fecha_fac;
    private String Cedula;  
    private String id_compra;
    private String cod_domicilio;

    public Con_Facturas() {
    }

    public Con_Facturas(int id_factura, String fecha_fac, String Cedula, String id_compra, String cod_domicilio) {
        this.id_factura = id_factura;
        this.fecha_fac = fecha_fac;
        this.Cedula = Cedula;
        this.id_compra = id_compra;
        this.cod_domicilio = cod_domicilio;
    }

    

    public Con_Facturas(String Cedula, String fecha_fac, int id_factura) {
        this.Cedula = Cedula;
        this.fecha_fac = fecha_fac;
        this.id_factura = id_factura;
    }
    
    
    
    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCod_domicilio() {
        return cod_domicilio;
    }

    public void setCod_domicilio(String cod_domicilio) {
        this.cod_domicilio = cod_domicilio;
    }

    public String getFecha_fac() {
        return fecha_fac;
    }

    public void setFecha_fac(String fecha_fac) {
        this.fecha_fac = fecha_fac;
    }

    public String getId_compra() {
        return id_compra;
    }

    public void setId_compra(String id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
    
    
    
    
}
