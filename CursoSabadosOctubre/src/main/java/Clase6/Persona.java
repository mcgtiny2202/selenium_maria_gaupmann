package Clase6;

public class Persona {

    private String nombre;
    private int dni;
    private int edad;

    public Persona(String unNombre, int unDni){
        this.nombre = unNombre;
        this.dni = unDni;
    }

    public Persona(String unNombre, int unDni, int unaEdad){
        this.nombre = unNombre;
        this.dni = unDni;
        this.edad = unaEdad;
    }

    //setters y getters

    public void setNombre (String unNombre){
        this.nombre = unNombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setDni (int unDni){
        this.dni = unDni;
    }

    public int getDni(){
        return this.dni;
    }

    public void setEdad(int unaEdad){
        this.edad = unaEdad;
    }

    public int getEdad(){
        return this.edad;
    }

    public String toString(){

        String desc = this.nombre + " de dni " + this.dni;
        if(edad > 0){
            desc+=" y edad " + this.edad;
        }
        return desc;
    }
}
