package Clase3;

import java.util.Scanner;

public class Ejercicio6 {

    //Realizar un método que reciba dos números y retorne el mayor ambos

    public static void main(String args[]){

        int numero1 = 0;
        int numero2 = 0;

        Scanner input = new Scanner(System.in);

        //ingreso los nros
        System.out.println("Ingrese el primer número: ");
        numero1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        numero2 = input.nextInt();

        //llamo al método
        retornarMayor(numero1,numero2);

    }

    public static void retornarMayor(int num1, int num2){

        if(num1 > num2){
            System.out.println("El nro " + num1 + " es mayor a " + num2);
        }else{
            System.out.println("El nro " + num2 + " es mayor a " + num1);
        }
    }
}
