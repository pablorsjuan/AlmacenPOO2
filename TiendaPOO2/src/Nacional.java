public class Nacional extends Producto{

    //Atributos
    private String registroDIAN;
    //Constructor
    public Nacional(String nombre, int codigo,String registroDIAN) {
        super(nombre, codigo);
        this.registroDIAN =registroDIAN;
    }
    //Métodos
    //Get and set
    public String getRegistroDIAN() {
        return registroDIAN;
    }
}
