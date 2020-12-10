package Clase2;

import java.util.Scanner;

public class Ejercicio7 {

    //Pedir el ingreso de 3 números e indicar si NO hay repetidos, es decir, si son todos
    //diferentes.

    public static void main(String args[]){

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner input = new Scanner(System.in);

        //ingresar los nros
        System.out.println("Ingrese el primer nro ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo nro ");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer nro ");
        num3 = input.nextInt();

        if(num1!=num2 && num2!=num3 && num1!=num3){
            System.out.println("No hay nros repetidos!!!!");
        }else
            System.out.println("Hay nros repetidos");
    }
}
