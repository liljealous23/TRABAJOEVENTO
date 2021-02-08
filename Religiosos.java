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
public class Religiosos extends EVENTOS {

    private int convertidas = 0;

    public Religiosos(String tipoEve, String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado, int convertidas) {
        super(tipoEve, user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado);

        this.convertidas = convertidas;
    }

    public void agregar(String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid) {
        String tipoEve = "RELIGIOSO";

        int convertidas = 0;
        String Estado = "ACTIVO";
        Religiosos reli = new Religiosos(tipoEve,user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado, convertidas);
        religioso.add(reli);

    }

    public int getConvertidas() {
        return convertidas;
    }

    public void setConvertidas(int convertidas) {
        this.convertidas = convertidas;
    }

}
