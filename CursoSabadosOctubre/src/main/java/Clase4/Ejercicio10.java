package Clase4;

public class Ejercicio10 {

    //Crear un método llamado crearArregloBooleano que retorne un arreglo de 10
    //posiciones de tipo booleanos donde todas sus posiciones tengan valor false.

    public static void main(String args[]) {


       Boolean[] elementos = crearArregloBooleano();

        for(int i=0; i< crearArregloBooleano().length;i++){
          System.out.println(elementos[i]);
        }
    }


    public static Boolean[] crearArregloBooleano(){

        Boolean[] elementos = new Boolean[10];

        for(int i= 0;i<elementos.length; i++){
            elementos[i]=false;
        }
        return elementos;

    }
}
