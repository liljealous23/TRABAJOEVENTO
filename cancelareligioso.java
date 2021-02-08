/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.util.Calendar;

/**
 *
 * @author 50496
 */
public class cancelareligioso extends Religiosos {

    public cancelareligioso(String tipoEve, String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado, int convertidas) {
        super(tipoEve, user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado, convertidas);
    }

    public void cancelar(String codigo) {

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
