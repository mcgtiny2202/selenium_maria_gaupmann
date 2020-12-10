package Clase3;

import java.util.Scanner;

public class Ejercicio2 {

    //Método que reciba un número entero e imprima en pantalla en caso de ser
    //mayor a 20, “Es mayor a 20”. De lo contrario, imprimir “No es mayor a 20”.

    public static void main(String args[]){

        int nro = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        nro = input.nextInt();

        esMayor(nro);
    }

    public static void esMayor(int num){
        if(num>20){
            System.out.println("El número ingresado es mayor a 20");
        }else{
            System.out.println("El número ingresado no es mayor a 20");
        }
    }
}
