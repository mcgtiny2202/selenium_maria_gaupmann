package Clase6;

public class Tester extends Empleado{

    private boolean Manual;
    private boolean Automatizador;

    public Tester(String unNombre, int unTelefono, int unSueldo, boolean esManual, boolean esAutomatizador){
        super(unNombre, unTelefono, unSueldo);
        this.Manual = esManual;
        this.Automatizador = esAutomatizador;
    }

    public void setManual(boolean esManual){
        this.Manual = esManual;
    }

    public boolean getManual(){
        return this.Manual;
    }

    public void setAutomatizador(boolean esAutomatizador){
        this.Automatizador = esAutomatizador;
    }

    public boolean getAutomatizador(){
        return this.Automatizador;
    }

    public String toString(){
        String desc="";
        desc+=super.toString();

        if(this.Automatizador ==true){
            desc+=" además es tester Automatizador y ";
        }else{
            desc+=" no es Tester Automatizador y ";
        }

        if(this.Manual ==true){
            desc+="es tester Manual";
        }else{
            desc+="no es Tester Manual";
        }
        return desc;
    }



}
