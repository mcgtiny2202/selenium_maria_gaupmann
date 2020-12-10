package Clase6;

public class Profesor extends Persona{

    private String materia;
    private int salario;

    //constructor con parámetros
    public Profesor(String unNombre, int unDni){
        super(unNombre, unDni); //los atributos que vienen en la clase padre
        this.materia = "Matematica";
        this.salario = 20000;
    }

    public Profesor(String unNombre, int unDni, String unaMateria, int unSalario){
        super(unNombre, unDni);//los atributos que vienen en la clase padre
        this.materia = unaMateria;
        this.salario = unSalario;
    }

    //agrego set y get

    public void setMateria(String unaMateria){
        this.materia = unaMateria;
    }

    public String getMateria(){
        return this.materia;
    }

    public void setSalario(int unSalario){
        this.salario = unSalario;
    }

    public int getSalario(){
        return this.salario;
    }


    public String toString(){
        return super.toString() + " la materia es: " + this.materia + " y el salario es: " + this.salario;
    }






}
