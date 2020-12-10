package Practica3;

public class Ejercicio1 {

    public static void main(String args[]){
        //Escribir un método que reciba un número y retorne su doble
        int número = retornarDoble(12);
        System.out.println("El doble del nro es: " + número);

    }

    public static int retornarDoble(int num){

        return(num*2);
    }
}

