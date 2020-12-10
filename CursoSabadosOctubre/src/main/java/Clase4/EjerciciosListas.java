package Clase4;

import java.util.ArrayList;

public class EjerciciosListas {

    public static void main(String args[]){

        ArrayList<String> nombres = new ArrayList<String>();

        //insertar elementos en la lista

        System.out.println("\nLos elementos de la lista son los siguientes: \n");
        nombres.add("Veronica");
        nombres.add("Maria");
        nombres.add("Gabriela");
        nombres.add("Juanma");
        nombres.add("Juampi");
        nombres.add("Agustin");

        //Imprimir los valores de la lista

        for( int i=0; i< nombres.size();i++){
            System.out.println(nombres.get(i));
        }

        //remover un elemento de la lista
        System.out.println("\nSe removerá un elemento de la lista \n");
        nombres.remove(2);

        //imprimir la lista luego de remover un elemento
        for(int i=0; i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }

        //Tamaño de la lista
        System.out.println("\nDevolver el tamaño de la lista: \n" + nombres.size());


        //obtener un elemento de la lista por el indice
        System.out.println("\nMostrar un elemento de la lista: \n" + nombres.get(3));


        System.out.println("Mostrar la posición de un elemento: " + nombres.indexOf("Juampi"));

        //borrar los elementos de la lista
        System.out.println("Remover los elementos de la lista" );
        nombres.clear();

        //mostrar los elementos de la lista
        System.out.println("Mostrar nuevamente la lista ");
        for(int i=0; i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }
    }

}
