package Clase5;

import java.util.Scanner;

public class Automotor {

    public static void main(String args[]){

        System.out.println("Constructor sin parámetros: ");
        Camion c1 = new Camion();
        System.out.println("Camion: \n"+ c1);

        System.out.println("\nConstructor con un parámetro: ");
        Camion c2 = new Camion("Celeste");
        System.out.println("Camion2: \n" + c2);

        System.out.println("\nConstructor con dos parámetros: ");
        Camion c3 = new Camion(3456,"Amarillo",1980);
        System.out.println("Camion3: \n" + c3);


        //Pedir los datos de un camión al usuario
        Scanner input = new Scanner(System.in);

        System.out.println("\nEl usuario ingresa los datos: ");
        System.out.println("\nIngrese el color del camión: ");
        String unColor = input.next();

        System.out.println("\nIngrese la chapa: ");
        int unaChapa = input.nextInt();

        System.out.println("\nIngrese el año de compra: ");
        int añoCompra = input.nextInt();

        Camion c4 = new Camion(unaChapa, unColor, añoCompra);
        System.out.println("\nCamion4: " + c4);

        //Impresión del metodo booleano

     //   System.out.println(c4.leTocaRevision());

        boolean mismoColor = c4.tieneMismoColor(c3);

        if(mismoColor ==true){
            System.out.println("Tienen el mismo color");
        }else{
            System.out.println("Tienen colores diferentes");
        }


    }
}
