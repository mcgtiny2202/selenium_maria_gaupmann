

package Clase4;


public class Ejercicio5 {

    //Crear un array de números de 100 posiciones, que contendrá los números del 1 al 100.
    //Obtener la suma de todos ellos y el promedio.

    public static void main (String args[]){

        int[] numeros = new int[100];

        //asignar los valores al array
        for(int i=0;i<numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100+1);
        }

        //imprimir los valores del array
        System.out.println("Los valores ingresados al array son: \n");
        for(int i=0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

        //obtener la suma y el promedio

        int suma = 0;
        int contador = 0;

        for(int i=0; i< numeros.length; i++){
            contador ++;
            suma = suma+numeros[i];
        }

        //mostrar la suma
        System.out.println("La suma de los numeros es " + suma);


        //calcular pronedio
        int promedio = suma / numeros.length;

        //mostrar el promedio
        System.out.println("El promedio de los nros es " + promedio);
    }
}
