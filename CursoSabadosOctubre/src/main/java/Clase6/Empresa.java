package Clase6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    public static void main(String args[]) {


        List<Persona> listaPersonas = new ArrayList<>();
        //creo las personas
        Persona persona1 = new Persona("Veronica", 22689910);
        Persona persona2 = new Persona("Maria", 25143242);
        Persona persona3 = new Persona("Gabriela", 26243769, 42);

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        System.out.println(listaPersonas);


        //imprimir lista de personas

        System.out.println("\nImprimir lista de personas");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        //Crear un menú con las siguientes opciones:
        //1- Agregar Persona
        //2- Ver personas
        //3- Salir

        int opcion = 0;
        Scanner input = new Scanner(System.in);

        while (opcion != 3) {
            System.out.println("***Bienvenido***");
            System.out.println("1 - Agregar Persona");
            System.out.println("2 - Ver Persona");
            System.out.println("3 - Salir");


            opcion = input.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese el nombre: ");
                String nombre = input.next();
                System.out.println("Ingrese el dni: ");
                int dni = input.nextInt();
                System.out.println("Ingrese la edad: ");
                int edad = input.nextInt();

                Persona personaNueva = new Persona(nombre, dni, edad);
                listaPersonas.add(personaNueva);

            } else if (opcion == 2) {

                for (Persona pers : listaPersonas) {
                    System.out.println(pers);
                }

            } else if (opcion == 3) {
                System.out.println("Saliendo...");
            }
        }
    }

}
