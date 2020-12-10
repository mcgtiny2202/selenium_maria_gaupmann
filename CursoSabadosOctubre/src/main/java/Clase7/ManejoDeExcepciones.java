package Clase7;

import java.util.Scanner;

public class ManejoDeExcepciones {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona: ");

        try {
            int edad = input.nextInt();
            System.out.println("La edad es: " + edad);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error " + ex.getMessage());
        }

        System.out.println("El programa finalizó");

        System.out.println("\nComienza el ejercicio siguiente ");
        //Definir un arreglo de 3 posiciones y mostrar la posición 3

        System.out.println("\nEstos son los numeros del vector ");
        int[] vector = new int[5];

        //agrego valores al vector;
        vector[0] = 3;
        vector[2] = 5;
        vector[4] = 7;

        //recorro el vector
        try {
            for (int i = 0; i <= vector.length; i++) {
                System.out.println(vector[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\nEl programa ha finalizado");

        System.out.println("\nComienza el siguiente ejercicio");
        //Definir una variable double llamada promedio y realizar la siguiente operación: 3/0


        double promedio = 0;
        int suma = 3;
        int contador = 0;

        System.out.println("\nCalcular el promedio: ");

        try{
            promedio = suma / contador;
            System.out.println("El promedio es: " + promedio);
        }catch(ArithmeticException ex){
            System.out.println("No se puede dividir por 0");
        }

        System.out.println("\nEl programa ha finalizado!!!");
    }
}
