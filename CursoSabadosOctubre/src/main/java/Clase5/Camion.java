package Clase5;

public class Camion {

    //atributos de clase camion
    private int chapa;
    private String color;
    private int añoCompra;

    //constructor sin parámetros
    public Camion(){
        this.chapa = 444;
        this.color = "verde";
        this.añoCompra = 1980;
    }

    //constructor con un parámetro
    public Camion(String unColor){
        this.chapa = 444;
        this.color = unColor;
        this.añoCompra = 1980;
    }

    //constructor con dos parámetros
    public Camion(int unaChapa, String unColor, int unAño){
        this.chapa = unaChapa;
        this.color = unColor;
        this.añoCompra = unAño;
    }

    //Agregar su setter, getter y agregarlo al constructor

    public void setChapa (int unaChapa){
        this.chapa = unaChapa;
    }

    public int getChapa (){
        return this.chapa;
    }

    public void setcolor (String unColor){
        this.color = unColor;
    }

    public String getcolor (){
        return this.color;
    }

    public void setAñoCompra (int unAño){
        this.añoCompra = unAño;
    }

    public int getAñoCompra (){
        return this.añoCompra;
    }


    // Agregar un método a la clase Camión, llamado leTocaRevision que retorne true
    //si el año de compra es menor a 2015

    public boolean leTocaRevision(){
        if(this.añoCompra <2015){
            return true;
        }else {
            return false;
        }
    }

  //  public String toString(){

   //     return "Camion de color " + this.color + " y chapa " + this.chapa + " .  El año de compra es " + this.añoCompra;
   // }

    //tengo que separar el this del retorno en partes mas pequeñas

    //Crear un método llamado tieneMismoColor, que reciba un Camión como
    //parámetro, y retorne verdadero si dos camiones tienen el mismo color

    public boolean tieneMismoColor(Camion unCamion){
        if(this.getcolor().equals(unCamion.getcolor())){
            return true;
        }else{
            return false;
        }
    }


    public String toString(){

        String ret = "Camion de color " + this.color;
        ret += " y chapa " + this.chapa;
        ret += ". El año de compra es " + this.añoCompra;

        if(this.leTocaRevision() == true){
            ret+= ". Debe hacerle revisar ";
        }else{
            ret+= ". No le toca revisar ";
        }
        return ret;
    }

}
