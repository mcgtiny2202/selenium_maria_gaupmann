package Clase4;

import java.util.Scanner;

public class Ejercicio1 {

    //Calcular la media de una serie de números que se leen por teclado.

    public static void main(String args[]){

        int [] horas = new int[10];

        Scanner input = new Scanner(System.in);

        //Ingreso los nros
        for(int i= 0; i<horas.length; i++){
            System.out.println("Ingrese un nro: ");
            horas[i] = input.nextInt();
        }

        //calculo la suma
        int suma = 0;
        for(int i= 0; i<horas.length; i++){
            suma = suma+horas[i];
        }

        System.out.println("La suma total es: " + suma);

        double promedio = suma / horas.length;

        System.out.println("El promedio total es: " + promedio);


        //imprimir el vector
        for(int i=0;i<=horas.length; i++){
            System.out.println(horas[i]);
        }
    }
}
