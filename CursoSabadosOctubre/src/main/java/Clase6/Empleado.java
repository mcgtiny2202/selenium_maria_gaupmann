package Clase6;

public class Empleado {

    private String nombre;
    private int telefono;
    private int sueldo;

    //constructor sin parametros
    public Empleado(){
        this.nombre = "María";
        this.telefono = 47425555;
        this.sueldo = 40000;
    }

    //Constructor con parametros
    public Empleado(String unNombre, int unTelefono, int unSueldo){
        this.nombre = unNombre;
        this.telefono = unTelefono;
        this.sueldo = unSueldo;
    }

    //setters y getters
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String getNombre (){
        return this.nombre;
    }

    public void setTelefono(int unTelefono){
        this.telefono = unTelefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setSueldo(int unSueldo){
        this.sueldo = unSueldo;
    }

    public int getSueldo(){
        return this.sueldo;
    }

    //metodo toString()
    public String toString(){
        return this.nombre + " cuyo telefono es " + this.telefono + " y el sueldo es " + this.sueldo;
    }
}
