public class Importado extends Producto {
    //Atributos
    public String licImportacion;
    //Constructor
    public Importado(String nombre, int codigo,String licImportacion) {
        super(nombre, codigo);
        this.licImportacion=licImportacion;
    }
    //Métodos
    //Get and set
    public String getLicImportacion() {
        return licImportacion;
    }
}
