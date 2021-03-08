/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;


public class Con_login {
    private String cedula;
    private String nombre_usu;
    private String contraseña;
    private String rol;
    private String sexo;
    
    /*
    Variables de la tabla usuarios
    */
    private String nombre_cliente;
    /*
    Constructores
    */
    public Con_login() {
    }

    public Con_login(String nombre_usu, String contraseña) {
        this.nombre_usu = nombre_usu;
        this.contraseña = contraseña;
    }

    public Con_login(String Cedula, String nombre_usu, String contraseña, String rol, String sexo, String nombre_cliente) {
        this.cedula = Cedula;
        this.nombre_usu = nombre_usu;
        this.contraseña = contraseña;
        this.rol = rol;
        this.sexo = sexo;
        this.nombre_cliente = nombre_cliente;
    }
    
    
    
    /*
    Getters an Setters
    */

    public String getCedula() {
        return cedula;
    }
    
    public void setCedula(String Cedula) {
        this.cedula = Cedula;
    }

    public String getNombre_usu() {
        return nombre_usu;
    }

    public void setNombre_usu(String nombre_usu) {
        this.nombre_usu = nombre_usu;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
    
    
    
    
}
