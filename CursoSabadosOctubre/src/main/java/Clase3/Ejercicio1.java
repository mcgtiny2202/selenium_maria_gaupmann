package Clase3;

public class Ejercicio1 {

    //Escribir un método que reciba un número y retorne su doble

    public static void main(String args[]) {

        int número = retornarDoble(7);
        System.out.println("El doble del nro es: " + número);

    }

    public static int retornarDoble(int num){
            return(num*2);
    }

}
