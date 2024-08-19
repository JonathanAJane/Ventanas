/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author Jonathan Jané
 */
public class Sesion {
    private static Sesion instance;
    private HashMap<String, Object> sessionVariables;

    private Sesion() {
        sessionVariables = new HashMap<>();
    }

    public static Sesion getInstance() {
        if (instance == null) {
            instance = new Sesion();
        }
        return instance;
    }

    public void setAttribute(String key, Object value) {
        sessionVariables.put(key, value);
    }

    public Object getAttribute(String key) {
        return sessionVariables.get(key);
    }

    
    
}



