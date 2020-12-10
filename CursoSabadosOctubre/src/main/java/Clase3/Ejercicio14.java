package Clase3;

import java.util.Scanner;

public class Ejercicio14 {

    //Método llamado convertirAMillas , que reciba un entero llamado kilómetros y
    //retorne el equivalente a las millas. Se debe imprimir el valor en millas en
    //pantalla. (1 milla = 1.6 kms)


    public static void main(String args[]){

        int kilometros;
        final double VALOR_MILLA = 1.6;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor en kilometros ");
        kilometros = input.nextInt();

        double calculo = convertirAMillas(kilometros,VALOR_MILLA);

        System.out.println("El valor de las millas para los kms ingresadoes es de: " + calculo);
    }

    public static double convertirAMillas(int km, double VALOR_MILLA){

        return km / VALOR_MILLA;
    }
}
