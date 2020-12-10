package Clase3;

import java.util.Scanner;

public class Ejercicio8 {

    //Crear un método que retorne verdadero si y sólo si el número es par, de lo
    //contrario, debe retornar falso.

    public static void main(String args[]) {

        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        num = input.nextInt();

        esNroPar(num);
    }

    public static void esNroPar(int num1) {

        if(num1 % 2 == 0) System.out.println("verdadero");
        if(num1 % 2 == 1) System.out.println("falso");
    }
}
