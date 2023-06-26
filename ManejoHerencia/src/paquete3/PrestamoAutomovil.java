package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo {

    private String tipo;
    private String marca;
    private Persona garante1;
    private double valorAuto;
    private double pagoMensual;

    public PrestamoAutomovil( int n,Persona b, String c, String t, String m, Persona gara, double vA) {
        super(b, n, c.toLowerCase());
        tipo = t;
        marca = m;
        garante1 = gara;
        valorAuto = vA;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerGarante(Persona gara) {
        garante1 = gara;
    }

    public void establecerValorAuto(double vA) {
        valorAuto = vA;
    }

    public void establecerPagoMensual() {
        pagoMensual = valorAuto / nMeses;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante() {
        return garante1;
    }

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n", super.toString());
        cadena = String.format("%sDatos del Préstamo del Automovil\n\n"
                + "Tipo de Automovil: %s\n"
                + "Marca del Automovil: %s\n"
                + "Nombre del Garante: %s %s\n"
                + "Valor Total del Automovil: %.1f\n"
                + "Valor de las Mensualidades: %.1f\n\n", cadena, tipo,
                marca, garante1.obtenerNombre(),
                garante1.obtenerApellido(), valorAuto, pagoMensual);
        return cadena;
    }

}
