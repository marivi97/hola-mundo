
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javiermiranda
 */
public class ejercicio3 {
    public static void main (String [] args){
    Scanner leer = new Scanner(System.in);
        float euros;
        String opcion,min;
        System.out.println("Ingrese cantidad de euros a convertir");
        euros = leer.nextFloat();
        System.out.println("Ingrese moneda a convertir:");
        opcion = leer.next();
        min=opcion.toLowerCase();
        switch (min) {
            case "libra":
                cambio(euros,min);
                break;
            case "dolar":
                cambio(euros,min);
                break;
            case "yen":
                cambio(euros,min);
                break;
            default:
                System.out.println("Ingrese opcion correcta");
        }
    }

    //FUNCION P´EUROS
    public static void cambio(double euros, String moneda) {
        if (moneda.equalsIgnoreCase("libra")){
            euros=euros*0.86;
        }else if(moneda.equalsIgnoreCase("dolar")){
            euros=euros*1.28611;
        }else{
            euros=euros*129.852;
        }
        System.out.println("su cambio en "+moneda+" es:"+ euros);
    }

}
    
