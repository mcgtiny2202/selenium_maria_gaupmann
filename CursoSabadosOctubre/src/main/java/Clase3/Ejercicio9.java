package Clase3;

import java.util.Scanner;

public class Ejercicio9 {

    //Crear un método que permita reciba el radio de un círculo, y retorne su área
    //(radio^2)*PI (utilizar una variable estática para el valor de PI)

    public static void main(String args[]){

        int radio = 0;
        final double VALOR_PI = 3.14;
        double area = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo ");
        radio = input.nextInt();

        area = calcularRadioCuadrado(radio) * VALOR_PI;
        System.out.println("El área del circulo es " + area);
    }

    public static int calcularRadioCuadrado(int num){

        return num*num;
    }
}
