
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
public class ejercicio1 {
    public static void main(String [] args){
    Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        //int retorno = sumar(num1, num2);
        //retorno = restar(num1, num2);
        //retorno = multi(num1, num2);
        //float retorno2 = div(num1, num2);
        System.out.println("El total de la suma es :" + sumar(num1,num2));
        System.out.println("El total de la resta es :" + restar(num1,num2));
        System.out.println("El total de la multiplicacion es :" + multi(num1,num2));
        System.out.println("El total de la division es :" + div(num1,num2));
    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
        
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }    

    public static float div(int num1, int num2) {       
        if (num2 == 0) {
            System.out.println("Error"); 
            return 000000;
            
        }else{ 
           return num1 / num2;
        } 
            
        
    } 

    }
