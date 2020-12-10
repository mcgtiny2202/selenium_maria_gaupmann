package Clase4;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosLista3 {

    //Crear un método imprimirListaStrings que reciba una lista de Strings, y los imprima en
    //pantalla.

    public static void main(String args[]){

        ArrayList<String> names = new ArrayList<String>();

        names.add("Veronica");
        names.add("Gabriela");
        names.add("Maria");
        names.add("Graciela");

        System.out.println("Estos son los elementos de la lista: ");

        imprimirListaStrings(names);

    }

    public static void imprimirListaStrings(ArrayList<String> nombres){

        for(int i = 0; i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }
    }
}
