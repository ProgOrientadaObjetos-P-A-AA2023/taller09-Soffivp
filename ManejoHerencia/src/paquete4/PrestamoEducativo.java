package paquete4;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    String nivelEstudio;
    InstitucionEducativa centro;
    double valorCarrera;
    double pagoMes;

    public PrestamoEducativo(Persona b, int n, String c, String nivelEst,
            InstitucionEducativa centroEd, double vCarrera) {
        super(b, n, c.toUpperCase());
        nivelEstudio = nivelEst;
        centro = centroEd;
        valorCarrera = vCarrera;

    }

    public void establecerNivel(String nivelEst) {
        nivelEstudio = nivelEst;
    }

    public void establecerCentro(InstitucionEducativa centroEd) {
        centro = centroEd;
    }

    public void establecerValorCarrera(double vCarrera) {
        valorCarrera = vCarrera;
    }

    public void establecerPagoMes() {
        double total = valorCarrera / nMeses;
        pagoMes = ((total) - ((total * 10) / 100));
    }

    public String obtenerNivel() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentro() {
        return centro;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerPagoMes() {

        return pagoMes;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n", super.toString());
        cadena = String.format("%sDatos del Préstamo Estudiantil\n"
                + "Nivel de Estudio: %s\n"
                + "Institución Educativa: %s, Siglas: %s\n"
                + "Valor Total de la Carrera: %.2f\n"
                + "Valor de las Mensualidades: %.2f\n", cadena, nivelEstudio,
                centro.obtenerNombre(),centro.obtenerSiglas(), valorCarrera, pagoMes);
        return cadena;
    }
}
