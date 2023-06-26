/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    /*Generar un menú que permita al usuario decidir si desea ingresar datos por teclado para un préstamo de tipo PrestamoAutomovil o PrestamoEducativo.
El proceso de ingreso de prestamos termina cuando el usuario lo decide.
Al finalizar se debe imprimir la lista de prestamos generado, se puede usar la representación del objeto (toString)
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        String nombre = "";
        String apellido = "";
        String ciudad = "";
        String usuario = "";
        String nombre1 = "";
        String apellido1 = "";
        String ciudad1 = "";
        String usuario1 = "";
        String nivel = "";
        String cEd = "";
        String siglas = "";
        String nombreB = "";
        String apellidoB = "";
        String userB = "";
        String tipo = "";
        String marca = "";
        boolean bandera = true;
        int meses = 0;
        double valorCarr = 0, valor = 0;
        Persona pE;
        Persona p1;

        while (bandera) {
            System.out.println("1. Ingresar préstamo de Automovil\n"
                    + "2. Ingresar préstamo Estudiantil\n");

            opcion = entrada.nextInt();
            if (opcion == 1) {
                entrada.nextLine();
                System.out.println("Ingrese nombre del beneficiario");
                nombre1 = entrada.nextLine();
                System.out.println("Ingrese apellido del beneficiario");
                apellido1 = entrada.nextLine();
                System.out.println("Ingrese ciudad del beneficiario");
                ciudad1 = entrada.nextLine();
                System.out.println("Ingrese usuario del beneficiario");
                usuario1 = entrada.nextLine();
                System.out.println("Ingrese numero de meses del préstamo");
                meses = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese tipo del automovil");
                tipo = entrada.nextLine();
                System.out.println("Ingrese marca del automovil");
                marca = entrada.nextLine();
                System.out.println("Ingrese valor del automovil");
                valor = entrada.nextDouble();
                entrada.nextLine();
                System.out.println("Ingrese nombre del garante");
                nombreB = entrada.nextLine();
                System.out.println("Ingrese apellido del garante");
                apellidoB = entrada.nextLine();
                System.out.println("Ingrese usuario del garante");
                userB = entrada.nextLine();
                //entrada.nextLine();

            } else if (opcion == 2) {
                entrada.nextLine();
                System.out.println("Ingrese nombre del beneficiario");
                nombre = entrada.nextLine();
                System.out.println("Ingrese apellido del beneficiario");
                apellido = entrada.nextLine();
                System.out.println("Ingrese ciudad del beneficiario");
                ciudad = entrada.nextLine();
                System.out.println("Ingrese usuario del beneficiario");
                usuario = entrada.nextLine();
                System.out.println("Ingrese numero de meses del préstamo");
                meses = entrada.nextInt();
                System.out.println("Ingrese nivel de estudios");
                nivel = entrada.nextLine();
                entrada.nextLine();
                System.out.println("Ingrese nombre del centro educativo");
                cEd = entrada.nextLine();
                System.out.println("Ingrese siglas del centro educativo");
                siglas = entrada.nextLine();
                System.out.println("Ingrese valor de la carrera");
                valorCarr = entrada.nextDouble();

            } else {
                System.out.println("Opción no valida");

            }
            entrada.nextLine();
            System.out.println("Si desea salir del proceso presione si");
            String c = entrada.nextLine();
            c.toLowerCase();

            if (c.equals("si")) {
                bandera = false;
                p1 = new Persona(nombre1, apellido1, usuario1);
                pE = new Persona(nombre, apellido, usuario);

                Persona g = new Persona(nombreB, apellidoB, userB);
                PrestamoAutomovil pAuto = new PrestamoAutomovil(meses, p1,
                        ciudad1, tipo, marca, g, valor);

                InstitucionEducativa ed = new InstitucionEducativa(cEd, 
                        siglas);

                PrestamoEducativo pEdu = new PrestamoEducativo(pE, meses,
                        ciudad, nivel, ed, valorCarr);

                pAuto.establecerPagoMensual();
                pEdu.establecerPagoMes();

                System.out.println(pAuto + "\n" + pEdu);
            }

        }

    }

}
