package Clase4;

public class Ejercicio6 {

    //Llenar un array con números aleatorios. Imprimir todos los números en pantalla.

    public static void main(String args[]){

        int[] numeros = new int[20];

        //ingreso los nros al array

        System.out.println("Ingreso de nros aleatorios: \n");
        for(int i = 0; i<numeros.length; i++){
            numeros[i]=(int) (Math.random()*20+1);
        }

        //imprimir el array con los nros aleatorios
        System.out.println("Se ingresaron los siguientes nros: ");
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
