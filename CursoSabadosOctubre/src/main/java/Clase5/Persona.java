package Clase5;

public class Persona {

    private String Nombre;
    private String Apellido;


    public Persona(){
        this.Nombre = "Graciela";
        this.Apellido = "Hernandez";
    }

    public Persona(String unNombre, String unApellido){
        this.Nombre = unNombre;
        this.Apellido = unApellido;
    }

    public void setNombre (String unNombre){
        this.Nombre = unNombre;
    }

    public String getNobre(){
        return this.Nombre;
    }

    public void setApellido (String unApellido){
        this.Apellido = unApellido;
    }

    public String getApellido (){
        return this.Apellido;
    }

    public static String imprimirPersona(String nom, String ape){

        return nom + " " + ape;
    }


    public String toString(){

        return "El nombre es " + this.Nombre + " y el Apellido es " + this.Apellido;
    }
}
