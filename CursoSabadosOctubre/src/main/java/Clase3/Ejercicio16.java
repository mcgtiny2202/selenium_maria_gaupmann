package Clase3;

import java.util.Scanner;

public class Ejercicio16 {

    //Crear un método llamado tipoTriangulo, que dado 3 valores enteros recibidos por
    //parámetro, imprima en pantalla si es escaleno, si es equilátero o isósceles.

    public static void main(String args[]){

        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer lado del triángulo");
        lado1 = input.nextInt();
        System.out.println("Ingrese el segundo lado del triángulo");
        lado2 = input.nextInt();
        System.out.println("Ingrese el tercer lado del triángulo");
        lado3 = input.nextInt();

        tipoTriangulo(lado1,lado2,lado3);
    }

    public static void tipoTriangulo(int lado1, int lado2, int lado3){

        if(lado1 == lado2 && lado2 ==lado3){
            System.out.println("El triángulo es Equilátero");
        }
        if(lado1 == lado2 && lado2 != lado3){
            System.out.println("El triángulo es Isósceles");
        }
        if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("El triángjulo es Escaleno");
        }
    }
}
