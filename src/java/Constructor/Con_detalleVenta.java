
package Constructor;
import java.sql.Timestamp;

public class Con_detalleVenta {
    private int id_factura;
    private Timestamp fecha_fac;
    private String cedula;
    private String id_compra;
    private String cod_domicilio;

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Timestamp getFecha_fac() {
        return fecha_fac;
    }

    public void setFecha_fac(Timestamp fecha_fac) {
        this.fecha_fac = fecha_fac;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getId_compra() {
        return id_compra;
    }

    public void setId_compra(String id_compra) {
        this.id_compra = id_compra;
    }

    public String getCod_domicilio() {
        return cod_domicilio;
    }

    public void setCod_domicilio(String cod_domicilio) {
        this.cod_domicilio = cod_domicilio;
    }
    
    
}
