package Clase2;

import java.util.Scanner;

public class Ejercicio8 {

    //Pedir el ingreso de números hasta que aparezca uno negativo.

    public static void main(String args[]){

        int num = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro ");
        num = input.nextInt();

        while(num >=0){
            System.out.println("Ingrese un nro ");
            num = input.nextInt();
        }

        System.out.println("Finalió el programa, se ingresó un nro negativo ");

    }
}
