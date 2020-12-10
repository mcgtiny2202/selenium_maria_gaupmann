package Clase6;

public class Developer extends Empleado {

    private String lenguaje;

    public Developer(String unNombre, int unTelefono, int unSueldo, String unLenguaje){
        super(unNombre,unTelefono,unSueldo);
        this.lenguaje = unLenguaje;
    }

    public String toString(){
        return super.toString() + " además programa en lenguaje: " + this.lenguaje;
    }
}
