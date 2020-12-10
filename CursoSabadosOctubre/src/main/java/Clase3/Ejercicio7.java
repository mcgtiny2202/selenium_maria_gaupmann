package Clase3;

import java.util.Scanner;

public class Ejercicio7 {

    //Crear un método que reciba un número entero n, y muestre en pantalla la suma
    //desde 1 hasta ese número n. Ej. Si n es 4, se debe mostrar en pantalla 10.

    public static void main(String args[]){

        int num1 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        num1 = input.nextInt();

        int total =  sumarNros (num1);

        System.out.println("La suma total es " + total);

    }

    public static int sumarNros (int n) {
        int suma = 0;
        for(int i =1;i<n;i++){
            suma = suma + i;
           // System.out.println ("i Vale: "+i);
        }
        return n+suma;
    }
}
