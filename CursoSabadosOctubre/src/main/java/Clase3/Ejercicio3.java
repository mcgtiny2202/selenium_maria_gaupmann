package Clase3;

import java.util.Scanner;

public class Ejercicio3 {

    //Método que reciba dos enteros y retorne la multiplicación de la misma.

    public static void main(String args[]){

        int num1 = 0;
        int num2 = 0;

        Scanner input = new Scanner(System.in);

        //ingreso los nros
        System.out.println("Ingrese el primer nro: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo nro: ");
        num2 = input.nextInt();

        //llamo al método
        int resultado = multiplicarNros(num1,num2);

        //muestro el resultado
        System.out.println("La multiplicación de los dos nros es " + resultado);

    }

    public static int multiplicarNros(int num1, int num2){

        return (num1*num2);
    }
}
