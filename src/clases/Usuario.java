/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Jané
 */
public class Usuario {
    
    private int id_usuario;
    private String nombre;
    private String apellido;
    private String password;
    private String correo;
    private String telefono;
    
       
    Conexion conBD= new Conexion("localhost", "root", "", "bdreserv");
    
    //Constructor por defecto
    public Usuario(){
        this.id_usuario=0;
        this.nombre="";
        this.apellido="";
        this.password="";
        this.correo="";
        this.telefono="";
        
    //Constrluctor que recibe parametros 
        
        
    }
    public Usuario(int id_usuario, String nombre, String apellido, String password, String correo, String telefono) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public int getId_usuario() {
        return id_usuario;
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
    
     //METODO INSERTAR
    public boolean insertarUsuario() throws SQLException{
        String query;
        boolean respuesta=false;
        conBD.conectar();
        Statement sql=conBD.smtSQL();
       
        query="insert into usuarios (nombre,apellido,password,email,telefono) "
                + "values('"+getNombre()+"','"+getApellido()+"','"+getContraseña()+"','"+getCorreo()+"','"+getTelefono()+"');";
       
        //EJECUTAR LA CONSULTA
        if (sql.executeUpdate(query)>0) {
            respuesta= true;
        }
        conBD.desconectar();
        return respuesta;
    }
     
    
    //Metodo para buscar un registro
     public String[] buscarUsuario(int id_usuario) throws SQLException {
        String query;
        conBD.conectar();
        Statement sql=conBD.smtSQL();
        ResultSet rs=null;
        String[] registro = new String[6];
        query = "SELECT * FROM usuarios WHERE idUsuario ='" + id_usuario + "'";
       
        //System.out.println(query);
        try{
            rs=sql.executeQuery(query);
            if (rs.next()) {
                registro[0] = rs.getString("idUsuario");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("password");
                registro[4] = rs.getString("correo");
                registro[5] = rs.getString("etelefono");
            }
           
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        conBD.desconectar();
        return registro;

    }
     
     //Metodo para buscar un registrodevuelve un resulset
     public ResultSet buscarUsuarioRS(int id_usuario) throws SQLException {
        String query;
        conBD.conectar();
        Statement sql=conBD.smtSQL();
        ResultSet rs=null;
        query = "SELECT * FROM usuarios WHERE idUsuario ='" + id_usuario + "'";
       
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
     
     //Metodo para actualizar un usuario
    public boolean actualizarUsuario() throws SQLException{
        String query;
        boolean respuesta=false;
        conBD.conectar();
        Statement sql=conBD.smtSQL();
        query="UPDATE usuarios\n" +
                " SET nombre='"+getNombre()+"'," +
                " apellido='"+getApellido()+"'," +
                " password='"+getContraseña()+"'," +
                " correo='"+getCorreo()+"'," +
                " telefono='"+getTelefono()+"'," +
                " WHERE id_usuario="+getId_usuario()+";";
       
         try{
            sql.execute(query);
            respuesta = true;
        }catch (SQLException e) {
            respuesta=false;
            System.out.println(e.getMessage());
        }
        conBD.desconectar();
        return respuesta;
    }
    
    //Metodo para eliminar un usuario
    public boolean eliminarUsuario(int id_usuario) throws SQLException{
        boolean respuesta;
        conBD.conectar();
        Statement sql=conBD.smtSQL();
       
        String query="DELETE FROM usuarios WHERE idUsuario="+id_usuario+";";
       
        try{            
            sql.execute(query);
            respuesta=true;
            autonumericoIdUsuario();
        }catch (SQLException e) {
            respuesta=false;
            System.out.println(e.getMessage());
        }
        conBD.desconectar();
        return respuesta;
    }
    
    //Metodo para inicializar a id_usuario
    public boolean autonumericoIdUsuario() throws SQLException{
        boolean respuesta;
        conBD.conectar();
        Statement sql=conBD.smtSQL();
       
        String query="ALTER TABLE usuarios AUTO_INCREMENT=1;";
        //System.out.println(query);
        try{            
            sql.execute(query);
            respuesta=true;
        }catch (SQLException e) {
            respuesta=false;
            System.out.println(e.getMessage());
        }
        conBD.desconectar();
        return respuesta;
    }
    
    //Metodo para mostrar registros
    private List<String[]> consultarUsuarios() {
        List<String[]> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";
        conBD.conectar();
        Statement sql=conBD.smtSQL(); //variable que permitira ejecutar una consulta
       
         try {
            ResultSet rs = sql.executeQuery(query); //resulset es para variables que almaceanaran un conjunto de registros
            while (rs.next()) {
                String[] registros = new String[6];
                registros[0] = rs.getString("idUsuario");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellido");
                registros[3] = rs.getString("password");
                registros[4] = rs.getString("correo");
                registros[5] = rs.getString("telefono");
                usuarios.add(registros);
            }
            return usuarios;  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
   
    public ResultSet consultarUsuariosRS() {
        String query = "SELECT * FROM usuarios";
        conBD.conectar();
        Statement sql=conBD.smtSQL(); //variable que permitira ejecutar una consulta
       
         try {
            ResultSet rs = sql.executeQuery(query); //resulset es para variables que almaceanaran un conjunto de registros
            
            return rs;  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
    
    
    public String[] BuscarDatos(String usuario)// throws SQLException
    {
        String password="";
        conBD.conectar();
        Statement sql=conBD.smtSQL();
        ResultSet rs=null;
        String[] registros = new String[6];
        String query="SELECT * FROM usuarios WHERE email ='"+usuario+"'";
        System.out.println(query);
         
        //JOptionPane.showMessageDialog(parentComponent, query);
        try
        {
            System.out.println("-----------------"+password);
            rs=sql.executeQuery(query);
           
            if(rs.next()) {
                registros[0] = rs.getString("idUsuarios");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellido");
                registros[3] = rs.getString("password");
                registros[4] = rs.getString("email");
                registros[5] = rs.getString("telefono");
                
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        return registros;     
        
    }
    
    //METODO MOSTRAR TABLA DE USUARIOS
    public void mostrarUsuarios() {                                                  
        List<String[]> usuarios = consultarUsuarios();
        for (String[] data : usuarios) {
             System.out.print(data[0] + " , " + data[1]+ " , " + data[2]+ " , " + data[3]+ " , " + data[4]+ " , " + data[5]+"\n");
        }  
       
    }
     
    }
