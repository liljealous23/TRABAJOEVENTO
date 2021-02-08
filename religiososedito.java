/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 50496
 */
public class religiososedito extends Religiosos {

    public String codigoM = "", tituloM = "", descripcionM = "";
    public Calendar fechaM;
    public int personasM = 0, convertidasM = 0;
    public double montoM = 0, totalidM = 0;

    public religiososedito(String tipoEve, String user, String codigo, String titulo, String descripcion, Calendar fecha, int personas, double monto, double totalid, String Estado, int convertidas) {
        super(tipoEve, user, codigo, titulo, descripcion, fecha, personas, monto, totalid, Estado, convertidas);
    }

    public boolean mostrar(String codigo, String user) {

        for (int i = 0; i < religioso.size(); i++) {
            if (religioso.get(i).getCodigo().equals(codigo) && religioso.get(i).getUser().equals(user)) {
                codigoM = religioso.get(i).getCodigo();
                tituloM = religioso.get(i).getTitulo();
                descripcionM = religioso.get(i).getDescripcion();
                personasM = religioso.get(i).getPersonas();
                fechaM = religioso.get(i).getFecha();
                personasM = religioso.get(i).getPersonas();
                montoM = religioso.get(i).getPersonas();
                convertidasM = religioso.get(i).getConvertidas();

                totalidM = religioso.get(i).getTotalid();
                return true;
            }

        }

        return false;
    }

    public boolean editar(String user, String codigoviejo, String codigonuevo, String titulo, String descripcion,Calendar fecha, int personas, double monto, double totalid, int convertidas) {
        for (int i = 0; i < religioso.size(); i++) {

            if (codigoviejo.equals(religioso.get(i).getCodigo())) {

                religioso.get(i).setCodigo(codigonuevo);
                religioso.get(i).setTitulo(titulo);
                religioso.get(i).setDescripcion(descripcion);
                religioso.get(i).setFecha(fecha);
                religioso.get(i).setPersonas(personas);
                religioso.get(i).setMonto(monto);
                religioso.get(i).setConvertidas(convertidas);

                return true;

            }

        }
        return false;
    }

}
