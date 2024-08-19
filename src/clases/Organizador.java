/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Jonathan Jané
 */
public class Organizador {
    
    private int id_organizador;
    private String nombre;
    private String apellido;
    private String password;
    private String correo;
    private String telefono;
    
    Conexion conBD= new Conexion("localhost", "root", "", "bdreserv");
    
    //Constructor por defecto
    public Organizador(){
        this.id_organizador=0;
        this.nombre="";
        this.apellido="";
        this.password="";
        this.correo="";
        this.telefono="";
        
    //Constrluctor que recibe parametros 
        
        
    }
    public Organizador(int id_usuario, String nombre, String apellido, String password, String correo, String telefono) {
        this.id_organizador = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void setId_organizador(int id_organizador) {
        this.id_organizador = id_organizador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContraseña(String password) {
        this.password = password;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setConBD(Conexion conBD) {
        this.conBD = conBD;
    }

    public int getId_organizador() {
        return id_organizador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContraseña() {
        return password;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Conexion getConBD() {
        return conBD;
    }
    
}
