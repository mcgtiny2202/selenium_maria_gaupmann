package Clase3;

import java.util.Scanner;

public class Ejercicio22 {

    //Crear un método llamado esMayorDeEdad, que retorne verdadero si y sólo si, el
    //valor recibido por parámetro es mayor a 18.

    public static void main(String args[]){

        int edad = 0;
        boolean esMayor = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        edad = input.nextInt();

        if(edad >= 18) {
            esMayor = esMayorDeEdad(edad);
            System.out.println("Es maypr de edad? : " + esMayor);
        }else{
            System.out.println("Ingrese edad valida ");
        }

    }

    public static boolean esMayorDeEdad(int num) {

        if (num > 18) {
        }
        return true;
    }

}
