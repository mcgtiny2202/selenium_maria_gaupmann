package Clase6;

public class Manager extends Empleado{

    private String area;

    public Manager(String unNombre, int unTelefono, int unSueldo){
        super(unNombre,unTelefono,unSueldo);
        this.area = "Management";
    }

    public String toString(){
        return super.toString() + " además trabaja en el área " + this.area;
    }
}
