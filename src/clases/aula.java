/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jonathan Jané
 */
public class aula {
    private int id_aula;
    private String Nombre;
    private int Capacidad;
    private String Encargado;
    private String Descripcion;
    private String Area;
    
    Conexion conBD= new Conexion("localhost", "root", "", "bdreserv");
    

    public aula(int id_aula, String Nombre, int Capacidad, String Encargado, String Descripcion, String Area) {
        this.id_aula = id_aula;
        this.Nombre = Nombre;
        this.Capacidad = Capacidad;
        this.Encargado = Encargado;
        this.Descripcion = Descripcion;
        this.Area = Area;
    }

    public void setId_aula(int id_aula) {
        this.id_aula = id_aula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public void setEncargado(String Encargado) {
        this.Encargado = Encargado;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getId_aula() {
        return id_aula;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public String getEncargado() {
        return Encargado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getArea() {
        return Area;
    }
    
    
    
    
    
    
    
    
    
}


