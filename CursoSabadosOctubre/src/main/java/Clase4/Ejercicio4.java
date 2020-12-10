package Clase4;

public class Ejercicio4 {

    //Definir un arreglo de Booleanos con 9 posiciones. Imprimir todos los valores del arreglo.

    public static void main(String args[]){

            boolean [] estados = new boolean[9];

            estados[0] = false;
            estados[1] = true;

            //imprimir los valores del arreglo

        System.out.println("Los valores del array son los siguientes: ");

        for(int i = 0; i<estados.length; i++){
            System.out.println("El valor en la posición " + i + " es " + estados[i]);
        }
    }
}
