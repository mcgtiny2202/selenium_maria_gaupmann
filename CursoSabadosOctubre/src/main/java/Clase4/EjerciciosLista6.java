package Clase4;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosLista6 {

    //Método que reciba una lista de enteros, y retorne la suma

    public static void main(String args[]){

        ArrayList<Integer> valores = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        int pos1 = input.nextInt();
        valores.add(pos1);

        System.out.println("Ingrese un nro: ");
        int pos2 = input.nextInt();
        valores.add(pos2);

        System.out.println("Ingrese un nro: ");
        int pos3 = input.nextInt();
        valores.add(pos3);

        int total = sumarNros(valores);

        System.out.println("La suma de los nros es: " + total);

    }


    public static int sumarNros(ArrayList<Integer> numeros){

        int suma = 0;
        for(int i=0; i<numeros.size();i++){
            suma = suma+numeros.get(i);
        }
        return suma;
    }
}
