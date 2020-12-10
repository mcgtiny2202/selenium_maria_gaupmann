package Clase3;

import java.util.Scanner;

public class Ejercicio17 {

    //Crear un método llamado factorial que reciba un número y retorne el factorial de
    //ese número.
    //Ej. si el número recibido es 5, se deberá retornar el siguiente valor: 5*4*3*2*1.
    //Sugerencia: utilizar un acumulador.

    public static void main (String args[]){

        int numero = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        numero = input.nextInt();

        factorial(numero);
    }

    public static void factorial(int num){

        int factorial = 1;

        for(int i = 1; i<=num; i++){
            factorial = factorial*i;
           // i++;
        }

        System.out.println("El factorial es: " + factorial);
    }
}
