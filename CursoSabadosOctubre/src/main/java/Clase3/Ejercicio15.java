package Clase3;

import java.util.Scanner;

public class Ejercicio15 {

    //Crear un método que retorne la suma de los números pares entre 1 y n, siendo n
    //un parámetro

    public static void main(String args[]){

        int num = 0;
        int valorTotal = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        num = input.nextInt();

        valorTotal = sumaPares(num);

        System.out.println("La suma de los nros es: " + valorTotal);
    }

    public static int sumaPares(int n){

        int suma = 0;
        int i = 1;

        while (i<=n){
            suma = suma+i;
            i++;
        }
        return suma;
    }
}
