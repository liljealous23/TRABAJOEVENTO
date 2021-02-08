/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import eventos.EVENTOS;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 50496
 */
public class musica extends EVENTOS {

    private String tipomusica = "";
    private String nombresorq = "";

    public musica(String tipoEve, String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado, String tipomusica, String nombresorq) {
        super(tipoEve, user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado);
    }

    public void agregar(String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String tipomusica) {

        String tipoEve = "MUSICA";
        String nombresorq = "";
        String Estado = "ACTIVO";
        musica musi = new musica(tipoEve, user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado, tipomusica, nombresorq);

        musica.add(musi);

    }

    public String getTipomusica() {
        return tipomusica;
    }

    public void setTipomusica(String tipomusica) {
        this.tipomusica = tipomusica;
    }

    public String getNombresorq() {
        return nombresorq;
    }

    public void setNombresorq(String nombresorq) {
        this.nombresorq = nombresorq;
    }

}
