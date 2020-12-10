package Clase5;

import java.util.Scanner;

public class GestionarProductos {

    public static void main (String args[]) {

        Producto prod1 = new Producto();
        System.out.println("El primer producto es: " + prod1);

        Producto prod2 = new Producto("Plato", 2222, "ABDD", true);
        System.out.println("El segundo producto es: " + prod2);

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto: ");
        String unNombre = input.next();
        System.out.println("Ingrese un código: ");
        int unCódigo = input.nextInt();
        System.out.println("Ingrese un nro de Lote: ");
        String unNroLote = input.next();
        System.out.println("Ingrese si el nro es importado o no: ");
        boolean esImportado = input.nextBoolean();

        Producto prod3 = new Producto(unNombre, unCódigo, unNroLote, esImportado);
        System.out.println("El tercer producto es: " + prod3);
    }
}
