package Clase4;

import java.util.Scanner;

public class Ejercicio7 {

    //Crear un array de booleanos con 10 posiciones llamado asientosLibres y colocar todos
    //sus elementos en true .

    public static void main(String args[]){

        boolean[] asientosLibres = new boolean[10];

        Scanner input = new Scanner(System.in);

        //ingreso los nros
        for(int i= 0; i< asientosLibres.length; i++){
            asientosLibres [i] = true;
        }

        //imprimo el array
        for(int i= 0; i< asientosLibres.length; i++){
            System.out.println("El valor de la posicion " + i + " es " + asientosLibres[i]);
        }
    }
}
