package Clase6;

public class Colegio {

    public static void main(String args[]){

        Profesor profe1 = new Profesor("Jose",25444444,"matemática",30000);
        System.out.println(profe1);

        System.out.println(profe1.getNombre());
        System.out.println(profe1.getDni());

        Alumno alumno1 = new Alumno("Carlos",24555777);
        System.out.println(alumno1);

        Alumno alumno2 = new Alumno("Pedro",33444445,1,"1B");
        System.out.println(alumno2);

    }
}
