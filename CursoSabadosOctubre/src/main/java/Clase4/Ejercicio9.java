package Clase4;

import java.util.Scanner;

public class Ejercicio9 {

    //Crear un método que reciba un arreglo, y retorne la cantidad de elementos de la misma.

    public static void main(String args[]){

        int[] elementos = new int[10];

        int valores = pasarElementos(elementos);

        System.out.println("La cantidad de elementos del array es " + valores);

    }

    public static int pasarElementos (int[] elementos){
        return elementos.length;
    }


}
