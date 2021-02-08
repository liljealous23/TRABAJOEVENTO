/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porsiacaso;

import java.util.ArrayList;

/**
 *
 * @author 50496
 */
public abstract class USUARIOS {

    private String tipo = "";
    private String nombre = "";
    private String User = "";
    private String password = "";
    private int edad = 0;
    public static ArrayList<USUARIOS> administradores = new ArrayList();
    public static ArrayList<USUARIOS> limitados = new ArrayList();
    public static ArrayList<USUARIOS> contenido = new ArrayList(); 
    public static ArrayList<USUARIOS> userin = new ArrayList();

    public USUARIOS(String tipo, String nombre, String user, String password, int edad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.User = user;
        this.password = password;
        this.edad = edad;

    }

    public abstract void agregar(String tipo, String nombre, String user, String password, int edad);

    public abstract boolean buscar(String user, String password);

    public abstract void salir();

    public abstract boolean mostrar(String user);

    public abstract boolean cambio(String tipo, String nombre, String user, String user2, String password, int edad);
    
    
    public abstract boolean eliminar (String nombre, String user, String password);

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUser() {
        return User;
    }

    public String getPassword() {
        return password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
