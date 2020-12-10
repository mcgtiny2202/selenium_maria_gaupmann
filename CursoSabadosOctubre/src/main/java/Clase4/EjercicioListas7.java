package Clase4;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioListas7 {

    //Método que reciba una lista de enteros, y retorne el promedio de los mismos.

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

        System.out.println("Ingrese un nro: ");
        int pos4 = input.nextInt();
        valores.add(pos4);

        double totalPromedio = promedioNros(valores);

        System.out.println("El promedio de los nros es: " + totalPromedio);
    }

    public static double promedioNros(ArrayList<Integer> listaNros){

        int contador = 0;
        int suma = 0;
        double promedio = 0;

        for(int i= 0; i<listaNros.size();i++){
            contador++;
            suma = suma+listaNros.get(i);
        }

        promedio = suma / contador;

        return promedio;
    }

}
