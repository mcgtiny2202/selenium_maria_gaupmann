package Clase3;

import java.util.Scanner;

public class Ejercicio11 {

    //Crear un método que reciba un entero, y muestre en pantalla la cantidad de
    //dólares y de euros que representa ese número

    public static void main(String args[]){

        double num = 0;
        final double VALOR_DOLAR = 50;
        final double VALOR_EURO = 70;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        num = input.nextDouble();

        calcularValor(num, VALOR_DOLAR, VALOR_EURO);

    }

    public static void calcularValor(double numero, double VALOR_DOLAR, double VALOR_EURO){

        double cotizDolar = VALOR_DOLAR * numero;
        double cotizEuro = VALOR_EURO * numero;

        System.out.println("Valor en dolares: " + cotizDolar);
        System.out.println("Valor en euros: " + cotizEuro);
    }
}
