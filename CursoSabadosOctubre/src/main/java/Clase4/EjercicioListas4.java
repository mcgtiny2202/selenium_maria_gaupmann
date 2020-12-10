package Clase4;

import java.util.ArrayList;

public class EjercicioListas4 {

    //Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma.

    public static void main(String args[]){

        ArrayList<Integer> valores = new ArrayList<Integer>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);

        int nros = cantidadElementos(valores);

        System.out.println("La cantidad de elementos de la lista es: " + nros);
    }

    public static int cantidadElementos(ArrayList<Integer> elementos){

        return elementos.size();
    }
}
