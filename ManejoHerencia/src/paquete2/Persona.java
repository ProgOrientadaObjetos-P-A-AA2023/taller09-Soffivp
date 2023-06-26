package paquete2;

/**
 *
 * @author sofiv
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String username;

    public Persona(String n, String a, String user) {
        nombre = n;
        apellido = a;
        username = user;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerUsername(String user) {
        username = user;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }

}
