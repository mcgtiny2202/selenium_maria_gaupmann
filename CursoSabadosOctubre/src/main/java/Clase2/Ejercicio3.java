package Clase2;

import java.util.Scanner;

public class Ejercicio3 {

    //Pedir el ingreso de 3 números y mostrar la suma de ellos.

    public static void main (String args[]) {

        //declaro variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int suma = 0;

        Scanner input = new Scanner(System.in);

        //ingreso los nros
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = input.nextInt();

        //calculo la suma
        suma = num1+num2+num3;

        //muestro el resultado
        System.out.println("La suma de los nros ingresados es " + suma);

        //Fin de programa
        System.out.println("Programa finalizado!!!");
    }
}
