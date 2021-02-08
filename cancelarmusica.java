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
public class cancelarmusica extends musica {
    
    public cancelarmusica(String tipoEve, String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado, String tipomusica, String nombresorq) {
        super(tipoEve, user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado, tipomusica, nombresorq);
    }
    
      public void cancelar(String codigo) {

 
        Calendar actual = Calendar.getInstance();
        long ini = actual.getTimeInMillis();

        for (int i = 0; i < religioso.size(); i++) {

            if (codigo.equals(religioso.get(i).getCodigo())) {

                religioso.get(i).setEstado("CANCELADO");
                long event = religioso.get(i).getFecha().getTimeInMillis();

                int dias = (int) ((Math.abs(event - ini)) / (1000 * 60 * 60 * 24)) + 1;

                if (dias <= 1) {
                    double monto = religioso.get(i).getMonto();

                    double calculo = monto * 0.5;

                    religioso.get(i).setTotalid(calculo);

                }
            }

        }

    }
    
}
