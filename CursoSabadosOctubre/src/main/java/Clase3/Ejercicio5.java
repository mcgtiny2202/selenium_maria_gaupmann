package Clase3;

import java.util.Scanner;

public class Ejercicio5 {

    //Método que reciba un número entero y un número double, y retorne su
    //multiplicación

    public static void main (String args[]){

        int numero1 = 0;
        double numero2 = 0;

        Scanner input = new Scanner(System.in);

        //ingreso los nros
        System.out.println("Ingrese el primer nro: ");
        numero1 = input.nextInt();
        System.out.println("Ingrese el segundo nro: ");
        numero2 = input.nextDouble();

        //llamo al método
        double resultado = multiplicaNros(numero1, numero2);

        //muestro el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);


    }

    public static double multiplicaNros(int num1, double num2){

        return(num1*num2);
    }
}
