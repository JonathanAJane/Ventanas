/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Jonathan Jané
 */
public class Login {
    
    
    private String contraseña;
    private String correo;
    
    Conexion conBD= new Conexion("localhost", "root", "", "bdreserv");

    public Login(String contraseña, String correo) {
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setConBD(Conexion conBD) {
        this.conBD = conBD;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public Conexion getConBD() {
        return conBD;
    }
    
    
   
    
}
