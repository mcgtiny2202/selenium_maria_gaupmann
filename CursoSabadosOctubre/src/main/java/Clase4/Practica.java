package Clase4;

public class Practica {

    public static void main(String args[]){

        int[] horas = new int[10];

        //asigno valores
        horas[2] = 4;
        horas[3] = 7;

        //imprimir el largo del arreglo
        System.out.println(horas.length);

        //imprimir el valor almacenado en la posicion 3
        System.out.println(horas[3]);

        //imprimir lo almacenado en las posiciones pares

        for(int i=0; i<horas.length;i++){
            if(i%2 ==0) {
                  System.out.println(horas[i]);
            }
        }
    }
}
