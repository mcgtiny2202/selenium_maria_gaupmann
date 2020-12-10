package Clase2;

import java.util.Scanner;

public class Ejercicio11 {

    //Pedir el ingreso de 4 números y retornar su suma en valor absoluto.

    public static void main(String args[]){

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int suma = 0;

        Scanner input = new Scanner(System.in);

        //ingreso los nros
        System.out.println("Ingrese el primer nro ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo nro ");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer nro ");
        num3 = input.nextInt();
        System.out.println("Ingrese el cuarto nro ");
        num4 = input.nextInt();

        suma = num1+num2+num3+num4;

        if(suma <0) {
            suma = suma * (-1);
        }
        System.out.println("El valor absoluto de la suma es: " + suma);
    }
}
