package Clase3;

import java.util.Scanner;

public class Ejercicio18 {

    //Realizar un método llamado validarNumero , que recibe 4 parametros:
    //a) Un mensaje para mostrar: mensaje
    //b) Un mensaje de error: error
    //c) Un entero llamado: mínimo
    //d) Un entero llamado: máximo
    //Se debe pedir el ingreso de números indicando el mensaje por parámetro para solicitar
    //el número. En caso de que se ingrese un número fuera del rango, mostrar el mensaje
    //de error y pedir que ingrese un número que se encuentre dentro del rango.
    //El método debe retornar un entero que se encuentre dentro del rango comprendido
    //entre el máximo y el mínimo .

    public static void main(String args[]) {

     int numero = 0;
     String valor =" ";
     final String MENSAJE_OK = "Dentro del rango";
     final String MENSAJE_ERROR = "Fuera del rango";
     int maximo = 0;
     int minimo = 0;

     Scanner input = new Scanner(System.in);

     System.out.println("Ingrese el nro");
     numero = input.nextInt();
     System.out.println("Ingrese el minimo");
     minimo = input.nextInt();
     System.out.println("Ingrese el maximo");
     maximo = input.nextInt();

     valor = validarNumero(numero,MENSAJE_OK, MENSAJE_ERROR, maximo, minimo);

     System.out.println("Mostrar el Mensaje: " + valor);
    }

    private static String validarNumero(int num, String MENSAJE_OK, String MENSAJE_ERROR, int maximo, int minimo) {

        if(num > minimo && num < maximo){
            return MENSAJE_OK;
        }else{
            return MENSAJE_ERROR;
        }
    }

}
