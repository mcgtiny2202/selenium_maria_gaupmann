package Clase3;

import java.util.Scanner;

public class Ejercicio20 {

    //Realizar 4 métodos que reciba dos parámetros cada uno y retornen un número
    //float. Los métodos tendrán los siguientes nombres: calcularSuma, calcularResta,
    //calcularDivision, calcularMutiplicacion .

    public static void main (String args[]){

        int num1 = 0;
        int num2 = 0;

        int suma = 0;
        int resta = 0;
        int producto = 0;
        int division = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();

        //mostrar resultados
        suma = calcularSuma(num1,num2);
        resta = calcularResta(num1, num2);
        producto = calcularMultiplicacion(num1, num2);
        division = calcularDivision(num1, num2);

        System.out.println("La suma de los nros ingresados es: " + suma);
        System.out.println("La resta de los nros ingresados es: " + resta);
        System.out.println("La multiplicacion de los nros ingresados es: " + producto);

        if(num1> num2) {
            System.out.println("La division de los nros ingresados es: " + division);
        }else{
            System.out.println("No puede realizarse la division");
        }
    }


    public static int calcularSuma(int num1, int num2){

        return num1+num2;
    }


    public static int calcularResta(int num1, int num2){

        return num1-num2;
    }


    public static int calcularMultiplicacion(int num1, int num2){

        return num1*num2;
    }

    public static int calcularDivision(int num1, int num2){

        int div=0;

        if (num1>num2) {
            div = num1 / num2;
        }
        return div;
    }
}
