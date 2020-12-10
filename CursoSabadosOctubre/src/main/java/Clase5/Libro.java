package Clase5;

public class Libro {

    private int ISBN;
    private String Título;
    private String Autor;
    private int nroPáginas;


    //constructor sin parámetros
    public Libro(){
        this.ISBN = 4455;
        this.Título = "Sin Titulo";
        this.Autor = "Desconocido";
        this.nroPáginas = 0;
    }

    //constructor con parámetros
    public Libro(int unISBN, String unTítulo, String unAutor, int unNroPáginas){
        this.ISBN = unISBN;
        this.Título = unTítulo;
        this.Autor = unAutor;
        this.nroPáginas = unNroPáginas;
    }

    //setters y getters

    public void setISBN(int unISBN){
        this.ISBN = unISBN;
    }

    public int getISBN(){
        return this.ISBN;
    }

    public void setTítulo(String unTitulo){
        this.Título = unTitulo;
    }

    public String getTítulo(){
        return this.Título;
    }

    public void setAutor(String unAutor){
            this.Autor = unAutor;
    }

    public String getAutor(){
        return this.Autor;
    }

    public void setNroPáginas(int unNroPáginas){
        this.nroPáginas = unNroPáginas;
    }

    public String toString(){

        String ret = "El libro con ISBN " + this.ISBN;
        ret+= " creado por el autor " + this.getAutor();
        ret+= " tiene " + this.nroPáginas + " páginas. ";

        return ret;
    }
}
