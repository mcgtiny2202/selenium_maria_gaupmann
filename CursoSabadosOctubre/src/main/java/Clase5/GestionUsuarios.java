package Clase5;

import java.util.Scanner;

public class GestionUsuarios {

    public static void main(String args[]){


        //muestro el cálculo del iva
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        double precio = input.nextDouble();
        System.out.println("El valor del IVA es: " + CalcularImpuestos.calcularIva(precio));

        System.out.println("\n================\n");
        Persona persona1 = new Persona();
        System.out.println(persona1);

        System.out.println("\nIngrese el nombre: ");
        String nom = input.next();
        System.out.println("\nIngrese el apellido: ");
        String ape = input.next();

        Persona persona2 = new Persona(nom,ape);
        String nombrecompleto = Persona.imprimirPersona(nom,ape);

        System.out.println("\nEl nombre completo es: ");
        System.out.println(nombrecompleto);

    }
}
