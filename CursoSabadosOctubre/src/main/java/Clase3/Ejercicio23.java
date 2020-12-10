package Clase3;

import java.util.Scanner;

public class Ejercicio23 {

    //Método que reciba dos números y retorne verdadero si el primer número es mayor
    //que el segundo. De lo contrario, retornar debe retornar falso.

    public static void main(String args[]){

        int numero1 = 0;
        int numero2 = 0;
        boolean esMayor = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        numero1 = input.nextInt();
        System.out.println("Ingrse otro nro: ");
        numero2 = input.nextInt();

        esMayor = validarNros(numero1, numero2);

        System.out.println("Es mayor o menor el nro?:" + esMayor);

    }

    public static boolean validarNros(int num1, int num2){

        if(num1 > num2){
            return true;
        }else{
            return false;
        }
    }
}
