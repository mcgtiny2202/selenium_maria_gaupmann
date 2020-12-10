package Clase2;

import java.util.Scanner;

public class Ejercicio4 {

    //Pedir el ingreso de un dato, e indicar si es menor o mayor a 0

    public static void main(String args[]){

        int num = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro ");
        num = input.nextInt();

        if(num >0){
            System.out.println("El número ingresado es mayor que cero");
        }
        if(num <0){
            System.out.println("El número ingresado es menor a cero");
        }
    }
}
