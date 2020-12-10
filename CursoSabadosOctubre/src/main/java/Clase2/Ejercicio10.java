package Clase2;

import java.util.Scanner;

public class Ejercicio10 {

    //Programa Java que lea dos números y muestre los números entre ellos.

    public static void main(String args[]){

        int num1 = 0;
        int num2 = 0;

        Scanner input = new Scanner(System.in);

        //ingreso los nros
        System.out.println("Ingrese el primer nro: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo nro: ");
        num2 = input.nextInt();

        if(num1<num2) {
            for (int i = num1; i < num2; i++) System.out.println("Nro a mostrar: " + i);
        }else {
            for (int i = num2; i < num1; i++) System.out.println("Nro a mostrar: " + i);
        }
    }
}
