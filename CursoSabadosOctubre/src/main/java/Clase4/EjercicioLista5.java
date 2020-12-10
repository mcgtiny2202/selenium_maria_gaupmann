package Clase4;

import java.util.ArrayList;

public class EjercicioLista5 {

    //Método que reciba una lista de enteros, y retorne la verdadero si y sólo si la lista está
    //vacía.

    public static void main(String args[]){

        ArrayList<Integer> ListaEnteros = new ArrayList<Integer>();

        ListaEnteros.add(2);
        ListaEnteros.add(3);
        ListaEnteros.add(5);
        ListaEnteros.add(7);

        System.out.println("Elementos de la lista: ");
        for(int i=0; i<ListaEnteros.size();i++){
            System.out.println(ListaEnteros.get(i));
        }

        System.out.println("Esta vacia la lista? " + estaVacia(ListaEnteros));


    }

    public static boolean estaVacia (ArrayList<Integer> listaEnteros){

        if(listaEnteros.isEmpty() == true){
            return true;
        }else{
            return false;
        }
    }


}
