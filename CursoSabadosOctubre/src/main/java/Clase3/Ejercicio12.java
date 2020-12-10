package Clase3;

import java.util.Scanner;

public class Ejercicio12 {

    //Realizar un método llamado calcularIva , que calcule el IVA (22%) dado un
    //número float llamado sueldo, recibido por parámetro. Sugerencia: utilizar
    //variables estáticas.

    public static void main(String args[]){

        float sueldo = 0;
        final double VALOR_IVA = 0.22;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el sueldo del empleado: ");
        sueldo = input.nextFloat();

        double calculoTotal = calcularIva(sueldo, VALOR_IVA);

        System.out.println("El cálculo del IVA sobre el valor del sueldo es: "+calculoTotal);
    }

    public static double calcularIva(float sueldo, double VALOR_IVA){

        return sueldo * VALOR_IVA;
    }


}
