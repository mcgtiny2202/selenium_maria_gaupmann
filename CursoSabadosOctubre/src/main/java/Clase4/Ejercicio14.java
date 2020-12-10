package Clase4;

import java.util.Scanner;

public class Ejercicio14 {

    //Crear un método que reciba una arreglo de floats, y retorne el promedio de los mismos.

    public static void main(String args[]){

        float[] numeros = new float[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los nros del array: ");
        for(int i=0; i<numeros.length;i++){
            System.out.println("Ingrese un nro: ");
            numeros[i] = input.nextFloat();
        }

        float total = promedioFloat(numeros);

        System.out.println("El promedio de los nros es: " + total);

    }

    public static float promedioFloat (float[] nros){

        int contador = 0;
        float suma = 0;

        for( int i = 0; i<nros.length; i++){
            contador++;
            suma = suma+nros[i];
        }
        return suma / nros.length;
    }


}
