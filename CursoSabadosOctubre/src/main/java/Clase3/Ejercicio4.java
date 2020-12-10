package Clase3;

import java.util.Scanner;

public class Ejercicio4 {

    //Método que reciba dos números y retorne su suma

    public static void main(String args[]){

        int numero1 = 0;
        int numero2 = 0;

        Scanner input = new Scanner(System.in);

        //ingreso los nros
        System.out.println("Ingrese el primer nro");
        numero1 = input.nextInt();
        System.out.println("Ingrese el segundo nro");
        numero2 = input.nextInt();

        //llamo a la función
        int suma = retornarSuma(numero1,numero2);

        //muestro el resultado
        System.out.println("La suma de los dos nros es " + suma);
    }

    public static int retornarSuma(int num1, int num2){

        return(num1+num2);
    }
}
