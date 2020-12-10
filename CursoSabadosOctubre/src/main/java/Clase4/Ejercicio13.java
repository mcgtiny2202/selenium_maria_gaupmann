package Clase4;

import java.util.Scanner;

public class Ejercicio13 {

    //Crear un método que muestre en pantalla todos los elementos de un array de float.

    public static void main(String args[]){

        float[] elementos = new float[6];

        Scanner input = new Scanner(System.in);


        System.out.println("\nIngresar los nros del arreglo float: \n");
        for(int i = 0; i<elementos.length; i++){
            System.out.println("Ingrese un nro: ");
            elementos[i]= input.nextFloat();
        }


        System.out.println("nLos nros ingresados en el arreglo son los siguientes: \n");
        imprimirArregloFloat(elementos);
    }



    public static void imprimirArregloFloat(float[] arregloFloat){

        for(int i = 0; i<arregloFloat.length;i++){
            System.out.println("El elemento en la posicion " + i + " es " + arregloFloat[i]);
        }
    }
}
