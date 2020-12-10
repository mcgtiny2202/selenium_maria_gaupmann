package Clase2;

import java.util.Scanner;

public class Ejercicio14 {

    //Pedir el ingreso de números hasta que se ingrese un 0. Mostrar el promedio de ellos.

    public static void main(String args[]){

        int num = 0;
        float promedio = 0;
        int contador = 0;
        int suma = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        num = input.nextInt();

        while (num != 0){
            suma = suma + num;
            contador = contador+1;
            System.out.println("Ingrese un nro: ");
            num = input.nextInt();
        }

        promedio = suma / contador;

        System.out.println("El promedio de los nros es; " + promedio);

    }
}
