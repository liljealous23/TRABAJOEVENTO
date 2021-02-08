/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porsiacaso;

import porsiacaso.USUARIOS;
import static porsiacaso.USUARIOS.userin;
import javax.swing.JOptionPane;

/**
 *
 * @author 50496
 */
public class contenido extends USUARIOS {

    public String tipo2 = "", nombre2 = "", user2 = "", password2 = "";
    public int edad2 = 0;

    public contenido(String tipo, String nombre, String user, String password, int edad) {
        super(tipo, nombre, user, password, edad);
    }

    @Override
    public void agregar(String tipo, String nombre, String user, String password, int edad) {

        contenido con = new contenido(tipo, nombre, user, password, edad);
        contenido.add(con);

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
        for (int i = 0; i < contenido.size(); i++) {
            if (users.equals(contenido.get(i).getUser()) && passwords.equals(contenido.get(i).getPassword())) {
                if (userin.size() <= 0) {
                    userin.add(contenido.get(i));
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

        for (int i = 0; i < contenido.size(); i++) {

            if (user.equals(contenido.get(i).getUser())) {

                tipo2 = contenido.get(i).getTipo();
                nombre2 = contenido.get(i).getNombre();
                user2 = contenido.get(i).getUser();
                password2 = contenido.get(i).getPassword();
                edad2 = contenido.get(i).getEdad();

                return true;
            }

        }

        return false;
    }

    public boolean cambio(String tipo, String user, String user2, String password, String nombre, int edad) {
        for (int i = 0; i < contenido.size(); i++) {

            if (user.equals(contenido.get(i).getUser()) && contenido.get(i).getTipo().equals("CONTENIDO") && tipo.equals("CONTENIDO")) {

                contenido.get(i).setNombre(nombre);
                contenido.get(i).setUser(user2);
                contenido.get(i).setPassword(password);

                contenido.get(i).setEdad(edad);

                return true;
            }

            if (user.equals(contenido.get(i).getUser()) && contenido.get(i).getTipo().equals("CONTENIDO") && tipo.equals("ADMINISTRADOR")) {
                contenido.remove(i);

                primerusuario ad = new primerusuario(tipo, user2, password, nombre, edad);
                ad.agregar(tipo, nombre, user2, password, edad);

                return true;
            }

            if (user.equals(contenido.get(i).getUser()) && contenido.get(i).getTipo().equals("CONTENIDO") && tipo.equals("LIMITADO")) {
                contenido.remove(i);
                limitado lim = new limitado(tipo, user2, password, nombre, edad);
                lim.agregar(tipo, nombre, user2, password, edad);
                return true;
            }
        }

        return false;
    }

    public boolean eliminar(String nombre, String user, String password) {
        for (int i = 0; i < contenido.size(); i++) {

            if (user.equals(contenido.get(i).getUser()) && contenido.get(i).getTipo().equals("CONTENIDO")) {
                contenido.remove(i);

                return true;
            }

        }

        return false;
    }

}
