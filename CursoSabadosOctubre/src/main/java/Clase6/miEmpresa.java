package Clase6;

public class miEmpresa {

    public static void main(String args[]){

        System.out.println("\nEn el área de testing trabaja: ");
        Tester tester1 = new Tester("Jose",47423333,40000,true,true);
        System.out.println(tester1);

        System.out.println("\nEn el área de desarrollo trabajan: ");
        Developer dev1 = new Developer("Juan", 47636755, 90000, "Java");
        System.out.println(dev1);
        Developer dev2 = new Developer("Pedro",47654588, 95000,"Python");
        System.out.println(dev2);

        System.out.println("\nEl manager del proyecto es: ");
        Manager manager1 = new Manager("Andrea",67435544, 100000);
        System.out.println(manager1);
    }
}
