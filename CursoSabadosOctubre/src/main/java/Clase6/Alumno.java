package Clase6;

public class Alumno extends Persona{

    private int nroEstudiante;
    private String grupo;
    private boolean tienePrevia;

    public Alumno(String unNombre, int unDni){
        super(unNombre, unDni);
        this.grupo = "1A";
    }

    public Alumno(String unNombre, int unDni,int nroEstu, String unGrupo){
        super(unNombre, unDni);
        this.nroEstudiante = nroEstu;
        this.grupo = unGrupo;
    }

    public void setNroEstudiante(int nroEstu){
        this.nroEstudiante = nroEstu;
    }

    public int getNroEstudiante(){
        return this.nroEstudiante;
    }

    public void setGrupo(String unGrupo){
        this.grupo = unGrupo;
    }

    public String getGrupo(){
        return this.grupo;
    }

    public void setTienePrevia(boolean esPrevia){
        this.tienePrevia = esPrevia;
    }

    public boolean getTienePrevia(){
        return this.tienePrevia;
    }

    public String toString(){
        return super.toString() + " Nro estudiante " + this.nroEstudiante + " Grupo " + this.grupo;
    }
}
