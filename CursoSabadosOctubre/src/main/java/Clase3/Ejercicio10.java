package Clase3;

import java.util.Scanner;

public class Ejercicio10 {

    //Crear un método que permita recibir el alto y ancho de un paralelogramo tipo, y
    //retorne su área.

    public static void main (String args[]){

        int base = 0;
        int altura = 0;
        int area = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base del paralelogramo: ");
        base = input.nextInt();
        System.out.println("Ingrese la altura del paralelogramo: ");
        altura = input.nextInt();

        area = calcularArea(base,altura);

        System.out.println("El area del paralelogramo es: " + area);

    }

    public static int calcularArea(int basep, int alturap){

        return basep*alturap;
    }
}
