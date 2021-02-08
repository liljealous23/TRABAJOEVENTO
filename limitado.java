/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porsiacaso;

import porsiacaso.primerusuario;
import porsiacaso.contenido;
import porsiacaso.USUARIOS;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 50496
 */
public class limitado extends USUARIOS {

    public String tipo3 = "", nombre3 = "", user3 = "", password3 = "";
    public int edad3 = 0;

    public limitado(String tipo, String nombre, String user, String password, int edad) {
        super(tipo, nombre, user, password, edad);
    }

    @Override

    public void agregar(String tipo, String nombre, String user, String password, int edad) {

        limitado lim = new limitado(tipo, nombre, user, password, edad);
        limitados.add(lim);

    }

    public boolean userunico(String user) {
        for (int i = 0; i < contenido.size(); i++) {
            if (user.equals(contenido.get(i).getUser())) {

                return false;
            }

        }
        for (int i = 0; i < limitados.size(); i++) {
            if (user.equals(limitados.get(i).getUser())) {

                return false;
            }
        }
        for (int i = 0; i < administradores.size(); i++) {
            if (user.equals(administradores.get(i).getUser())) {

                return false;
            }
        }
        return true;
    }

    @Override
    public boolean buscar(String users, String passwords) {
        for (int i = 0; i < limitados.size(); i++) {
            if (users.equals(limitados.get(i).getUser()) && passwords.equals(limitados.get(i).getPassword())) {

                if (userin.size() <= 0) {
                    userin.add(limitados.get(i));
                }

                return true;
            }

        }

        return false;
    }

    public void salir() {

        userin.clear();

    }

    public boolean mostrar(String user) {

        for (int i = 0; i < limitados.size(); i++) {

            if (user.equals(limitados.get(i).getUser())) {

                tipo3 = limitados.get(i).getTipo();
                nombre3 = limitados.get(i).getNombre();
                user3 = limitados.get(i).getUser();
                password3 = limitados.get(i).getPassword();
                edad3 = limitados.get(i).getEdad();
               

                return true;
            }

        }

        return false;
    }

    public boolean cambio(String tipo, String user, String user2, String password, String nombre, int edad) {
        for (int i = 0; i < limitados.size(); i++) {

            if (user.equals(limitados.get(i).getUser()) && limitados.get(i).getTipo().equals("LIMITADO") && tipo.equals("ADMINISTRADOR") && tipo.equals("ADMINISTRADOR")) {

                limitados.remove(i);
                limitados.get(i).setNombre(user2);
                limitados.get(i).setUser(user2);
                limitados.get(i).setPassword(password);

                limitados.get(i).setEdad(edad);

                return true;
            }
            if (user.equals(contenido.get(i).getUser()) && contenido.get(i).getTipo().equals("ADMINISTRADOR") && tipo.equals("CONTENIDO")) {
                limitados.remove(i);

                contenido con = new contenido(tipo, user2, password, nombre, edad);
                con.agregar(tipo, nombre, user2, password, edad);
                return true;
            }
            if (user.equals(contenido.get(i).getUser()) && contenido.get(i).getTipo().equals("ADMINISTRADOR") && tipo.equals("ADMINISTRADOR")) {
                limitados.remove(i);
                primerusuario ad = new primerusuario(tipo, user2, password, nombre, edad);
                ad.agregar(tipo, nombre, user2, password, edad);

                return true;
            }
        }

        return false;
    }

    public boolean eliminar(String nombre, String user, String password) {
        for (int i = 0; i < limitados.size(); i++) {

            if (user.equals(limitados.get(i).getUser()) && limitados.get(i).getTipo().equals("LIMITADO")) {
                limitados.remove(i);
                return true;
            }

        }

        return false;
    }
}
