package Clase4;

import java.util.Scanner;

public class Ejercicio15 {

    //Crear un método que reciba un arreglo, y retorne la suma.

    public static void main(String args[]){

        int[] valores = new int[5];

        Scanner input = new Scanner(System.in);

        for(int i= 0; i<valores.length; i++){
            System.out.println("Ingrese un nro: ");
            valores[i] = input.nextInt();
        }

        int suma = sumarNros(valores);

        System.out.println("La suma de los nros es: " + suma);
    }

    public static int sumarNros(int[] numeros){

        int suma = 0;

        for(int i= 0; i<numeros.length; i++){
            suma = suma+numeros[i];
        }
        return suma;
    }
}
