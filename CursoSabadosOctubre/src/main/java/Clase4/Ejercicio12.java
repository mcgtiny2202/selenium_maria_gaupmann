package Clase4;

public class Ejercicio12 {

    //Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos
    //de un array de booleanos el cual es recibido por parámetro.

    public static void main(String args[]){

        boolean[] estados = new boolean[5];

        System.out.println("\nElementos del array de booleanos: \n");
        imprimirArreglo(estados);

    }

    public static void imprimirArreglo (boolean[] estados){

        for(int i = 0; i<estados.length; i++) {
            System.out.println("Elemento de la posicion " + i + " es " + estados[i]);
        }
    }
}
