/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author Trabajos
 */
public class Con_Domicilios {
    private String Cedula;
    private String Cod_domicilio;
    private String FechaPedido;
    private String id_compra;
    
    
    public Con_Domicilios() {
    }

    public Con_Domicilios(String Cedula, String Cod_domicilio, String FechaPedido, String id_compra) {
        this.Cedula = Cedula;
        this.Cod_domicilio = Cod_domicilio;
        this.FechaPedido = FechaPedido;
        this.id_compra = id_compra;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCod_domicilio() {
        return Cod_domicilio;
    }

    public void setCod_domicilio(String Cod_domicilio) {
        this.Cod_domicilio = Cod_domicilio;
    }

    public String getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(String FechaPedido) {
        this.FechaPedido = FechaPedido;
    }

    public String getId_compra() {
        return id_compra;
    }

    public void setId_compra(String id_compra) {
        this.id_compra = id_compra;
    }
    
    
}
