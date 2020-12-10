package Clase2;

import java.util.Scanner;

public class Ejercicio6 {

    //Pedir el ingreso de 3 números, indicar si hay números repetidos utilizando solo un IF

    public static void main(String args[]){

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer nro: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo nro: ");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer nro: ");
        num3 = input.nextInt();

        if(num1==num2){ System.out.println("Hay nros repetidos! ");}
        if(num2==num3){ System.out.println("Hay nros repetidos! ");}
        if(num1==num3){ System.out.println("Hay nros repetidos! ");}
    }
}
