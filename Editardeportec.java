/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import eventos.deportivo;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 50496
 */
public class Editardeportec extends deportivo {

    public String codigoM = "", tituloM = "", descripcionM = "", tipoM = "", equipo1M = "", equipo2M = "", nombres1M = "", nombres2M = "";

    public int personasM = 0;
    public double montoM = 0;
    public double totalidM = 0;
    public Calendar fechaM;

    public Editardeportec(String tipoEve, String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado, String tipod, String equipo1, String equipo2, String nombres1, String nombres2) {
        super(tipoEve, user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado, tipod, equipo1, equipo2, nombres1, nombres2);
    }

    public boolean mostrar(String codigo, String user) {
        for (int i = 0; i < deporte.size(); i++) {
            if (deporte.get(i).getCodigo().equals(codigo) && deporte.get(i).getUser().equals(user)) {
                codigoM = deporte.get(i).getCodigo();
                tituloM = deporte.get(i).getTitulo();
                descripcionM = deporte.get(i).getDescripcion();
                personasM = deporte.get(i).getPersonas();
                fechaM = deporte.get(i).getFecha();
                tipoM = deporte.get(i).getTipod();
                montoM = deporte.get(i).getMonto();
                totalidM = deporte.get(i).getTotalid();
                equipo1M = deporte.get(i).getEquipo1();
                equipo2M = deporte.get(i).getEquipo2();
                nombres1M = deporte.get(i).getNombres1();
                nombres2M = deporte.get(i).getNombres2();

                return true;
            }

        }

        return false;
    }

    public boolean editar(String user, String codigoviejo, String codigonuevo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String tipod, String equipo1, String equipo2, String nombres1, String nombres2) {
        for (int i = 0; i < deporte.size(); i++) {

            if (codigoviejo.equals(deporte.get(i).getCodigo())) {

                deporte.get(i).setCodigo(codigonuevo);
                deporte.get(i).setTitulo(titulo);
                deporte.get(i).setDescripcion(descripcion);
                deporte.get(i).setFecha(fecha);
                deporte.get(i).setPersonas(personas);
                deporte.get(i).setMonto(monto);
                deporte.get(i).setTipod(tipod);
                deporte.get(i).setEquipo1(equipo1);
                deporte.get(i).setEquipo2(equipo2);
                deporte.get(i).setNombres1(nombres1);
                deporte.get(i).setNombres2(nombres2);

                return true;

            }

        }
        return false;
    }

}
