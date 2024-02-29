public class Producto {
    //Atributos
    String nombre;
    private int codigo;
    // Constructor
    public Producto(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    // Métodos
    // Get and set
    public String getNombre(){return nombre;}
    public int getCodigo() {return codigo;}
}
