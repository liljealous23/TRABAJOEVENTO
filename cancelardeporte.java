/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author 50496
 */
public class cancelardeporte extends deportivo {

    public cancelardeporte(String tipoEve, String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado, String tipod, String equipo1, String equipo2, String nombres1, String nombres2) {
        super(tipoEve, user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado, tipod, equipo1, equipo2, nombres1, nombres2);
    }

    public void cancelar(String codigo) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar actual = Calendar.getInstance();
        long ini = actual.getTimeInMillis();

        for (int i = 0; i < deporte.size(); i++) {

            if (codigo.equals(deporte.get(i).getCodigo())) {

                deporte.get(i).setEstado("CANCELADO");
                long event = deporte.get(i).getFecha().getTimeInMillis();

                int dias = (int) ((Math.abs(event - ini)) / (1000 * 60 * 60 * 24)) + 1;

                if (dias <= 1) {
                    double monto = deporte.get(i).getMonto();

                    double calculo = monto * 0.5;

                    deporte.get(i).setTotalid(calculo);

                }
            }

        }

    }

}
