import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Inicio {
    //Creación de estáticos
    static ArrayList<Producto> prdctsNac=new ArrayList<>();
    static ArrayList<Producto> prdctImp=new ArrayList<>();
    static boolean nalEncontrado=false, impEncontrado=false;
    public static void main(String[] args) {
        //
        //Scanner
        Scanner scn=new Scanner(System.in);

        //Atributos
        int codigo, numPrdcts=1;
        String nombre, registroDIAN, licImportacion;

        //Número de productos
        System.out.print("Escriba la cantidad de productos a guardar: ");
        numPrdcts=scn.nextInt();

        System.out.println("----------Productos nacionales----------");
        for (int i = 0; i < numPrdcts; i++) {
            System.out.println("\t-----Producto "+(i+1)+"-----");
            System.out.print("\tNombre del producto "+(i+1)+": ");
            nombre= scn.next();
            System.out.print("\tCódigo del producto "+(i+1)+": ");
            codigo= scn.nextInt();
            System.out.print("\tRegistro DIAN del producto "+(i+1)+": ");
            registroDIAN= scn.next();
            prdctsNac.add(new Nacional(nombre,codigo,registroDIAN));
        }
        System.out.println("----------Productos importados----------");
        for (int i = 0; i < numPrdcts; i++) {
            System.out.println("\t-----Producto "+(i+1)+"-----");
            System.out.print("\tNombre del producto "+(i+1)+": ");
            nombre= scn.next();
            System.out.print("\tCódigo del producto "+(i+1)+": ");
            codigo= scn.nextInt();
            System.out.print("\tLicencia de importación del producto "+(i+1)+": ");
            licImportacion= scn.next();
            prdctImp.add(new Importado(nombre,codigo,licImportacion));

            System.out.print("Escriba su producto nacional que busca: ");
            String PrNalBuscado= scn.next();
            bscrNal(PrNalBuscado);

            System.out.print("Escriba su producto importado que busca: ");
            String PrImpBuscado= scn.next();
            bscrImp(PrImpBuscado);
        }
    }
    //Métodos
    public static void bscrNal(String nombre){
        for (int i = 0; i < prdctsNac.size(); i++) {
            if (Objects.equals(prdctsNac.get(i).getNombre(), nombre)){
                nalEncontrado=true;
                break;
            }
        }
        if (nalEncontrado){
            System.out.println("Producto nacional "+nombre+" encontrado");
        } else {
            System.out.println("Producto nacional no disponible");
        }
    }
    public static void bscrImp(String nombre){
        for (int i = 0; i < prdctImp.size(); i++) {
            if (Objects.equals(prdctImp.get(i).getNombre(), nombre)){
                impEncontrado=true;
                break;
            }
        }
        if (impEncontrado){
            System.out.println("Producto importado "+nombre+" encontrado");
        } else {
            System.out.println("Producto importado no disponible");
        }
    }
}