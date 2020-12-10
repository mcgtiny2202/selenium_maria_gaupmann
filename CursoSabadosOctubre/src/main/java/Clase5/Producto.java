package Clase5;

public class Producto {

    private static int NROPRODUCTO = 100;

    private String Nombre;
    private int código;
    private String nroLote;
    private boolean Importado;
    private int nroProducto;


    //constructor sin parámetros
    public Producto() {
        this.Nombre = "Desconocido";
        this.código = 0;
        this.nroLote = "Desconocido";
        this.Importado = false;
        NROPRODUCTO++;
        this.nroProducto = NROPRODUCTO;
    }

    //constructor con parámetros
    public Producto(String unNombre, int unCódigo, String unNroLote, boolean esImportado) {
        this.Nombre = unNombre;
        this.código = unCódigo;
        this.nroLote = unNroLote;
        this.Importado = esImportado;
        NROPRODUCTO++;
        this.nroProducto = NROPRODUCTO;
    }

    //creo setters y getters para cada atributo
    public void setNombre(String unNombre) {
        this.Nombre = unNombre;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setCódigo(int unCódigo) {
        this.código = unCódigo;
    }

    public int getCódigo() {
        return this.código;
    }

    public void setNroLote(String unNroLote) {
        this.nroLote = unNroLote;
    }

    public String getNroLote() {
        return this.nroLote;
    }

    public void setImportado(boolean esImportado) {
        this.Importado = esImportado;
    }

    public boolean getImportado() {
        return this.Importado;
    }


    //Método
    public boolean esProductoImportado(){

        if(this.getImportado()==true){
            return true;
        }else{
            return false;
        }
    }

    //Método toString
    public String toString() {

        String ret = "Producto Nro: " + this.nroProducto;
        ret += " - Nombre: " + this.Nombre;
        ret += " - Código: " + this.código;
        ret += " - NroLote: " + this.nroLote;

        if(this.getImportado()==true){
            ret+= " - El producto es Importado";
        }else{
            ret+= " - El producto es Nacional";
        }
        return ret;
    }
}

