package Clase3;

import java.util.Scanner;

public class Ejercicio19 {

    //Crear un método llamado valorAbsoluto, que reciba un número y retorne el valor
    //absoluto del mismo. Ej. si se recibe un -4, el método debe retornar 4.

    public static void main (String args[]){

        int num = 0;
        int valor = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro");
        num = input.nextInt();

        valor = valorAbsoluto(num);

        System.out.println("El valor absoluto del nro ingresado es: " + valor);

    }

    public static int valorAbsoluto(int numero) {

        if (numero < 0) {
            numero = numero *(-1);
        }
        return numero;
    }
}
