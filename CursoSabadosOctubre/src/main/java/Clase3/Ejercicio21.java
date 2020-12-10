package Clase3;

import java.util.Scanner;

public class Ejercicio21 {

    //Realizar un método llamado calcularPromedio , que solicite el ingreso de números
    //hasta que se ingrese 0, y que calcule el promedio de los mismos. Se debe utilizar el
    //método ingresarNumero.

    public static void main(String args[]){

        double promedio = 0;
        int num = 0;

        promedio = calcularPromedio(num);
        System.out.println("El promedio es: " + promedio);
    }

    public static double calcularPromedio(int numero){

        int contador = 0;
        int suma = 0;
        double promedio = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        numero = input.nextInt();

        while(numero !=0){
            contador = contador+1;
            suma = suma+numero;
            numero = input.nextInt();
        }
        promedio = suma / contador;

        return promedio;
    }
}
