package Clase2;

import java.util.Scanner;

public class Ejercicio2 {

    //Pedir el ingreso del nombre y el año de nacimiento. Mostrar el nombre y la edad de la
    //persona

    public static void main(String args[]){

        int año = 0;
        String nombre = "";

        //ingreso del nombre y la edad por el usuario
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre ");
        nombre = input.next();
        System.out.println("Ingrese el año de nacimiento ");
        año = input.nextInt();

        //calcular la edad
        int edad = 2020 - año;

        //mostrar el nombre y la edad
        System.out.println("El nombre es " + nombre +  " y la edad es " + edad);

        //fin de programa
        System.out.println("El programa finalizó con éxito ");
    }
}
