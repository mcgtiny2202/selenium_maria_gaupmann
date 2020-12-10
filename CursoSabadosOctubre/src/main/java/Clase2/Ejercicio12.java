package Clase2;

import java.util.Scanner;

public class Ejercicio12 {

    //Pedir el ingreso de números hasta que se ingrese un 0

    public static void main(String args[]){

        int num = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        num = input.nextInt();

        while(num!=0){
            System.out.println("Numero: " + num);
            num = input.nextInt();
        }

        System.out.println("El programa ha finalizado!");
    }
}
