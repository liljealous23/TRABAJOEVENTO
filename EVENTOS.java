/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 50496
 */
public class EVENTOS {

    public static ArrayList<deportivo> deporte = new ArrayList();
    public static ArrayList<musica> musica = new ArrayList();
    public static ArrayList<Religiosos> religioso = new ArrayList();

    private String tipoEve = "";
    private String codigo = "";
    private String titulo = "";
    private String descripcion = "";

    private Calendar fecha;
    private int personas = 0;
    private String user = "";
    private double monto = 0;
    private double totalid = 0;
    private String Estado = "";

    public EVENTOS(String tipoEve, String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado) {
        this.tipoEve = tipoEve;
        this.user = user;
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.personas = personas;
        this.monto = monto;
        this.totalid = totalid;
        this.Estado = Estado;

    }

    public String getTipoEve() {
        return tipoEve;
    }

    public void setTipoEve(String tipoEve) {
        this.tipoEve = tipoEve;
    }

    public double getTotalid() {
        return totalid;
    }

    public void setTotalid(double totalid) {
        this.totalid = totalid;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean comprobar(String codigo) {
        for (int i = 0; i < deporte.size(); i++) {
            if (deporte.get(i).getCodigo().equals(codigo)) {

                return false;
            }

        }
        for (int i = 0; i < musica.size(); i++) {
            if (musica.get(i).getCodigo().equals(codigo)) {

                return false;
            }

        }
        for (int i = 0; i < religioso.size(); i++) {
            if (religioso.get(i).getCodigo().equals(codigo)) {

                return false;
            }

        }

        return true;
    }

}
