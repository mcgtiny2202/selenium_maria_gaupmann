package Clase5;

import java.util.Scanner;

public class Librería {

    public static void main(String args[]){

        Libro libro1 = new Libro();
        System.out.println(libro1);

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el ISBN");
        int unISBN = input.nextInt();
        System.out.println("Ingrese el Título");
        String unTitulo = input.next();
        System.out.println("Ingrese el Autor");
        String unAutor = input.next();
        System.out.println("Ingrese el nro de páginas");
        Integer nroPaginas = input.nextInt();

        Libro libro2 = new Libro(unISBN, unTitulo, unAutor, nroPaginas);
        System.out.println(libro2);


        }

    }

