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
public class Con_usuarios {
    private String Cedula;
    private String Nombre_usu;
    private String Contraseña;
    private String Rol;
    private String Sexo;

    public Con_usuarios() {
    }

    public Con_usuarios(String Cedula, String Nombre_usu, String Contraseña, String Rol, String Sexo) {
        this.Cedula = Cedula;
        this.Nombre_usu = Nombre_usu;
        this.Contraseña = Contraseña;
        this.Rol = Rol;
        this.Sexo = Sexo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre_usu() {
        return Nombre_usu;
    }

    public void setNombre_usu(String Nombre_usu) {
        this.Nombre_usu = Nombre_usu;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
    
}
