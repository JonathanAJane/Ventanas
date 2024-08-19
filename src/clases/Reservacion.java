/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.sql.Time;

/**
 *
 * @author Jonathan Jané
 */
public class Reservacion {
    
    
    
    private int id_reservacion;
    private String descripcion;
    private String conferencista;
    private int visitantes;
    private Date fecha;
    private Time hora_inicio;
    private Time hora_fin;
    private int id_aula;
    private int id_organizador;
    
    
    
    
    public Reservacion(){
        this.id_reservacion=0;
        this.descripcion="";
        this.conferencista="";
        this.visitantes=0;
        this.fecha=null;
        this.hora_inicio=null;
        this.hora_fin=null;
        this.id_aula=0;
        this.id_organizador=0;
    }

    public Reservacion(int id_reservacion, String descripcion, String conferencista, int visitantes, Date fecha, Time hora_inicio, Time hora_fin, int id_aula, int id_organizador) {
        this.id_reservacion = id_reservacion;
        this.descripcion = descripcion;
        this.conferencista = conferencista;
        this.visitantes = visitantes;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.id_aula = id_aula;
        this.id_organizador = id_organizador;
    }

    public void setId_reservacion(int id_reservacion) {
        this.id_reservacion = id_reservacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public void setVisitantes(int visitantes) {
        this.visitantes = visitantes;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setHora_fin(Time hora_fin) {
        this.hora_fin = hora_fin;
    }

    public void setId_aula(int id_aula) {
        this.id_aula = id_aula;
    }

    public void setId_organizador(String Organizador) {
        this.id_organizador = id_organizador;
    }

    public void setConBD(Conexion conBD) {
        this.conBD = conBD;
    }

    public int getId_reservacion() {
        return id_reservacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getConferencista() {
        return conferencista;
    }

    public int getVisitantes() {
        return visitantes;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }

    public int getId_aula() {
        return id_aula;
    }

    public int getId_organizador() {
        return id_organizador;
    }

    public Conexion getConBD() {
        return conBD;
    }
    
    
    
    
    
    Conexion conBD= new Conexion("localhost", "root", "", "bdreserv");
    
    
    
    public ResultSet buscarFecha(Date fecha) throws SQLException {
        String query;
        conBD.conectar();
        Statement sql=conBD.smtSQL();
        ResultSet rs=null;
        query = "SELECT * FROM reservacion WHERE fecha ='" + fecha + "'";
       
        //System.out.println(query);
        try{
            rs=sql.executeQuery(query);
            return rs;
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       
        conBD.desconectar();
        return rs;

    }
    //(boton de atras)//
    
    
}
