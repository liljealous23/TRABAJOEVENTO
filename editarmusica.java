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
public class editarmusica extends musica {

    public String nombresorqM = "";
    public String codigoM = "", tituloM = "", descripcionM = "", tipoM = "", equipo1M = "";
    public int personasM = 0;
    public double montoM = 0;
    public double totalidM = 0;
    public Calendar fechaM;

    public editarmusica(String tipoEve, String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado, String tipomusica, String nombresorq) {
        super(tipoEve, user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado, tipomusica, nombresorq);
    }

    public boolean mostrar(String codigo, String user) {

        for (int i = 0; i < musica.size(); i++) {
            if (musica.get(i).getCodigo().equals(codigo) && musica.get(i).getUser().equals(user)) {
                codigoM = musica.get(i).getCodigo();
                tituloM = musica.get(i).getTitulo();
                descripcionM = musica.get(i).getDescripcion();
                personasM = musica.get(i).getPersonas();
                fechaM = musica.get(i).getFecha();
                tipoM = musica.get(i).getTipomusica();
                nombresorqM = musica.get(i).getNombresorq();
                montoM = musica.get(i).getMonto();
                totalidM = musica.get(i).getTotalid();
                return true;
            }

        }

        return false;
    }

    public boolean editar(String user, String codigoviejo, String codigonuevo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String tipomusica, String nombresorq) {
        for (int i = 0; i < musica.size(); i++) {

            if (codigoviejo.equals(musica.get(i).getCodigo())) {

                musica.get(i).setCodigo(codigonuevo);
                musica.get(i).setTitulo(titulo);
                musica.get(i).setDescripcion(descripcion);
                musica.get(i).setFecha(fecha);
                musica.get(i).setPersonas(personas);
                musica.get(i).setMonto(monto);
                musica.get(i).setTipomusica(tipomusica);

                musica.get(i).setNombresorq(nombresorq);

                return true;

            }

        }
        return false;
    }

}
