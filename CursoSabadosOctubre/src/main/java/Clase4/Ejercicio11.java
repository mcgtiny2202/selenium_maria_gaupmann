package Clase4;

import java.util.Scanner;

public class Ejercicio11 {

    //Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos
    //de un array de enteros el cual es recibido por parámetro

    public static void main(String args[]){

        int[] elementos = new int[5];

        Scanner input = new Scanner(System.in);

        System.out.println("\nIngrese los nros del array: \n");

        for(int i= 0; i<elementos.length;i++){
            System.out.println("Ingrese un nro: ");
            elementos[i] = input.nextInt();
        }

        System.out.println("\nLos valores que componen el array son los siguientes: ");
        imprimirArreglo(elementos);


    }

    public static void imprimirArreglo (int[] numeros){

        for(int i = 0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
