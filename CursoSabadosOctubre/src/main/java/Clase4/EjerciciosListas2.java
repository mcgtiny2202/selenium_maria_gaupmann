package Clase4;

import java.util.ArrayList;

public class EjerciciosListas2 {

    //Crear un método imprimirListaEnteros que reciba una lista de enteros, y los imprima
    //en pantalla.

    public static void main(String args[]){

        ArrayList<Integer> Enteros = new ArrayList<Integer>();

        System.out.println("Estos son los elementos de la lista: \n");
        Enteros.add(1);
        Enteros.add(2);
        Enteros.add(3);
        Enteros.add(4);
        Enteros.add(5);

        imprimirListaEnteros(Enteros);

    }

    public static void imprimirListaEnteros(ArrayList<Integer> ListaEnteros){

        for(int i = 0; i<ListaEnteros.size();i++){
            System.out.println(ListaEnteros.get(i));
        }

    }
}
