package Clase3;

import java.util.Scanner;

public class Ejercicio13 {

    //Dado un número, un máximo y un mínimo (recibido por parámetro), retorne
    //verdadero si el número está dentro del máximo y el mínimo. Si el número se
    //encuentra dentro del max y min, el método debe mostrar “El numero es valido”
    //sino, se debe retornar, “El numero esta fuera de rango.”

    public static void main(String args[]){

        int numero = 0;
        int max = 0;
        int min = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        numero = input.nextInt();
        System.out.println("Ingrese el maximo: ");
        max = input.nextInt();
        System.out.println("Ingrese el minimo: ");
        min = input.nextInt();

         mensajesDeNro(numero, max, min);


    }

    public static void mensajesDeNro(int num, int max, int min){

        if (num > min && num < max ){
          System.out.println("El nro es valido");
        }
        else{
            System.out.println("El nro esta fuera de rango");
        }
    }
}
