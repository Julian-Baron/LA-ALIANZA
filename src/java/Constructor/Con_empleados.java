/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author Personal
 */
public class Con_empleados {
    private String Cedula;
    private String Nombre_emp;
    private String Apellido_emp;
    private String Telefono_emp;
    private String Correo_emp;
    private String Cod_emp;

    public Con_empleados() {
    }

    public Con_empleados(String Cedula, String Nombre_emp, String Apellido_emp, String Telefono_emp, String Correo_emp, String Cod_emp) {
        this.Cedula = Cedula;
        this.Nombre_emp = Nombre_emp;
        this.Apellido_emp = Apellido_emp;
        this.Telefono_emp = Telefono_emp;
        this.Correo_emp = Correo_emp;
        this.Cod_emp = Cod_emp;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre_emp() {
        return Nombre_emp;
    }

    public void setNombre_emp(String Nombre_emp) {
        this.Nombre_emp = Nombre_emp;
    }

    public String getApellido_emp() {
        return Apellido_emp;
    }

    public void setApellido_emp(String Apellido_emp) {
        this.Apellido_emp = Apellido_emp;
    }

    public String getTelefono_emp() {
        return Telefono_emp;
    }

    public void setTelefono_emp(String Telefono_emp) {
        this.Telefono_emp = Telefono_emp;
    }

    public String getCorreo_emp() {
        return Correo_emp;
    }

    public void setCorreo_emp(String Correo_emp) {
        this.Correo_emp = Correo_emp;
    }

    public String getCod_emp() {
        return Cod_emp;
    }

    public void setCod_emp(String Cod_emp) {
        this.Cod_emp = Cod_emp;
    }
    
    
}
