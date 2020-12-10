package Clase4;

import java.util.Scanner;

public class Ejercicio3 {

    //Definir un arreglo de Double de 16 posiciones. Imprimir todos los valores del mismo.

    public static void main(String args[]){

        double[] valores = new double[16];

        Scanner input = new Scanner(System.in);


        //ingreso los datos al array
        for(int i = 0; i<valores.length;i++){
            System.out.println("Ingrese un valor: ");
            valores[i]=input.nextDouble();
        }

        System.out.println("Los valores ingresados son: ");

        for(int i = 0; i<valores.length; i++){
            System.out.println("El valor en la posición "+ i + " es " + valores[i]);
        }

    }
}
