/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import eventos.EVENTOS;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 50496
 */
public class deportivo extends EVENTOS {

    private String equipo1;
    private String equipo2;
    private String tipod;
    private String nombres1 = "";
    private String nombres2 = "";

    public deportivo(String tipoEve,String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado, String tipod, String equipo1, String equipo2, String nombres1, String nombres2) {
        super(tipoEve,user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado);

        this.tipod = tipod;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.nombres1 = nombres1;
        this.nombres2 = nombres2;
    }

    public void agregar(String user, String codigo, String titulo, String descripcion, Calendar fecha, String tipod, int personas, double monto, double totalid, String equipo1, String equipo2) {
        String tipoEve="DEPORTES";
        String nombres1 = "";
        String nombres2 = "";
        String Estado = "ACTIVO";
        deportivo op = new deportivo(tipoEve,user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado, tipod, equipo1, equipo2, nombres1, nombres2);

        deporte.add(op);

    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getTipod() {
        return tipod;
    }

    public void setTipod(String tipod) {
        this.tipod = tipod;
    }

    public String getNombres1() {
        return nombres1;
    }

    public void setNombres1(String nombres1) {
        this.nombres1 = nombres1;
    }

    public String getNombres2() {
        return nombres2;
    }

    public void setNombres2(String nombres2) {
        this.nombres2 = nombres2;
    }

}
