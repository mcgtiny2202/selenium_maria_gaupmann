package Clase4;

import java.util.Scanner;

public class Ejercicio8 {

    //Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros.
    //Mostrar la cantidad de números positivos, negativos y ceros: Ej. “Se ingresaron 2
    //números positivos, 1 número negativo y 1 cero”

    public static void main(String args[]){

        int [] numeros = new int[5];

        Scanner input = new Scanner(System.in);

        //ingreso los nros

        System.out.println("Ingrese los elementos del array \n");

        for(int i = 0; i<numeros.length; i++){
            System.out.println("Ingrese un nro: ");
            numeros[i] = input.nextInt();
        }

        int contadorPos = 0;
        int contadorNeg = 0;
        int contadorCero = 0;

        //recorro el array
        for(int i = 0; i<numeros.length; i++) {

            if (numeros[i] > 0) {
               // System.out.println(numeros[i]);
                int positivos = numeros[i];
                System.out.println("Es un nro positivo: " + positivos);
                contadorPos++;
            }
            if (numeros[i] < 0){
                int negativos = numeros[i];
                System.out.println("Es un nro negativo:  " + negativos);
                contadorNeg++;
            }

            if(numeros[i] == 0){
                int cero = numeros[i];
                System.out.println("Es un nro igual a cero:  " + cero);
                contadorCero++;
            }
        }

        System.out.println("\n Cantidad de nros ingresados por grupo: \n");

        System.out.println("positivos: " + contadorPos);
        System.out.println("negativos: " + contadorNeg);
        System.out.println("Ceros: " + contadorCero);
    }
}
