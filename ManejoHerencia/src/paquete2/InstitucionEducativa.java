package paquete2;

/**
 *
 * @author sofiv
 */
public class InstitucionEducativa {

    protected String nombre;
    protected String siglas;

    public InstitucionEducativa(String n, String sig) {
        this.nombre = n;
        this.siglas = sig;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }

}
