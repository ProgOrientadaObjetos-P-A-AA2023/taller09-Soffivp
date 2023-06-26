package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int nMeses;
    protected String ciudad;

    public Prestamo(Persona b, int n, String c) {
        beneficiario = b;
        nMeses = n;
        ciudad = c;
    }

    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }

    public void establecerMeses(int n) {
        nMeses = n;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerMeses() {
        return nMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = "Datos del préstamo\n";
        cadena = String.format("%sBeneficiario: %s %s\n"
                + "Número de meses: %d\n"
                + "Ciudad del préstamo: %s\n", cadena, beneficiario.nombre,
                beneficiario.apellido, nMeses, ciudad);
        return cadena;
    }

}
