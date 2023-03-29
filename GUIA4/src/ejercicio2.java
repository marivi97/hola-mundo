
import java.util.Scanner;

/*
*Diseñe una función que pida el nombre y la edad de N personas e 
*imprima los datos de las personas ingresadas por teclado e indique 
*si son mayores o menores de edad. Después de cada persona, el programa
*debe preguntarle al usuario si quiere seguir mostrando personas y frenar
*cuando el usuario ingrese la palabra “No”.

 */

/**
 *
 * @author javiermiranda
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String resp,nombre;
        int edad;
        do {
            System.out.println("\nIngrese un Nombre");
            nombre = leer.next();            
            System.out.println("\nIngrese la edad ");
             edad = leer.nextInt();
            respuesta(nombre, edad);
            System.out.println("Desea ingresas otra persona? S(si)/N(no)");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));

       
    }

    public static void respuesta(String nombre, int edad) {
        if (edad < 18) {
            System.out.println(nombre + " es menor de edad ");

        } else {
            System.out.println(nombre + " es mayor de edad ");
        }
    }
}
