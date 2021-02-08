/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porsiacaso;

import porsiacaso.contenido;
import porsiacaso.USUARIOS;
import javax.swing.JOptionPane;

/**
 *
 * @author 50496
 */
public class primerusuario extends USUARIOS {

    public String tipo1 = "", nombre1 = "", user1 = "", password1 = "";
    public int edad1 = 0;

    public primerusuario(String tipo, String nombre, String user, String password, int edad) {
        super(tipo, nombre, user, password, edad);
    }

    @Override
    public void agregar(String tipo, String nombre, String user, String password, int edad) {
        boolean nocreo = false;
        if (buscar("admin", "supersecreto") == false) {

            tipo = "ADMINISTRADOR";
            nombre = "ELKYN AGUSTIN SANTOS";
            user = "admin";
            password = "supersecreto";
            edad = 21;
            primerusuario op = new primerusuario(tipo, nombre, user, password, edad);
            administradores.add(op);

        } else {

            
                primerusuario op = new primerusuario(tipo, nombre, user, password, edad);
                administradores.add(op);
            
        }
    }

    @Override
    public boolean buscar(String user, String password) {

        for (int i = 0; i < administradores.size(); i++) {

            if (user.equals(administradores.get(i).getUser()) && password.equals(administradores.get(i).getPassword())) {
                if (userin.size() <= 0) {
                    userin.add(administradores.get(i));
                }
                return true;
            }

        }

        return false;
    }

    public boolean comprobar() {

        int i = 0;
        if (userin.get(i).getTipo().equals("ADMINISTRADOR")) {

            return true;
        }

        return false;
    }

    @Override
    public void salir() {

        userin.clear();

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
    public boolean mostrar(String user) {

        for (int i = 0; i < administradores.size(); i++) {

            if (user.equals(administradores.get(i).getUser())) {

                tipo1 = administradores.get(i).getTipo();
                nombre1 = administradores.get(i).getNombre();
                user1 = administradores.get(i).getUser();
                password1 = administradores.get(i).getPassword();
                edad1 = (administradores.get(i).getEdad());

                return true;
            }

        }

        return false;
    }

    @Override
    public boolean cambio(String tipo, String user, String user2, String password, String nombre, int edad) {

        for (int i = 0; i < administradores.size(); i++) {

            if (user.equals(administradores.get(i).getUser()) && administradores.get(i).getTipo().equals("ADMINISTRADOR") && tipo.equals("ADMINISTRADOR")) {

                administradores.get(i).setNombre(nombre);
                administradores.get(i).setUser(user2);
                administradores.get(i).setPassword(password);
                administradores.get(i).setEdad(edad);
                return true;
            }
             if (user.equals(administradores.get(i).getUser()) && administradores.get(i).getTipo().equals("ADMINISTRADOR") && tipo.equals("CONTENIDO")) {
                administradores.remove(i);
                contenido con=new contenido(tipo,user2,password,nombre,edad);
                con.agregar(tipo, nombre, user, password, edad);
                              
                return true;
            }

            if (user.equals(administradores.get(i).getUser()) && administradores.get(i).getTipo().equals("ADMINISTRADOR") && tipo.equals("LIMITADO")) {
                administradores.remove(i);
                agregar(tipo, user2, password, nombre, edad);
                limitado lim=new limitado(tipo,user2,password,nombre,edad);
                lim.agregar(tipo, nombre, user2, password, edad);
                
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String nombre, String user, String password) {
        for (int i = 0; i < administradores.size(); i++) {

            if (user.equals(administradores.get(i).getUser()) && administradores.get(i).getTipo().equals("ADMINISTRADOR")) {
                administradores.remove(i);
                return true;
            }

        }

        return false;
    }

}
