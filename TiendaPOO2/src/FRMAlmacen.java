import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FRMAlmacen extends JFrame implements ActionListener {
    //todo############-Atributos-############
    static JLabel llPrNal,llPrImp,llNombreNal, llCodNal, llReDIAN,llNombreImp,llCodImp,llLicImp, llNoti;
    static JTextField txNombreNal, txCodNal, txReDIAN,txNombreImp,txCodImp,txLicImp;
    static JButton btnGuardar;
    static ArrayList<Producto> prdctsNac=new ArrayList<>();
    static ArrayList<Producto> prdctImp=new ArrayList<>();
    static boolean nalEncontrado=false, impEncontrado=false;

    @Override
    public void actionPerformed(ActionEvent e) {
        //Evento
        if (e.getSource().equals(btnGuardar)){
            String nombreN=txNombreNal.getText();
            int codN=Integer.parseInt(txCodNal.getText());
            String ReDIAN=txReDIAN.getText();
            prdctsNac.add(new Nacional(nombreN,codN,ReDIAN));

            String nombreI=txNombreImp.getText();
            int codI=Integer.parseInt(txCodImp.getText());
            String licI=txLicImp.getText();
            prdctImp.add(new Importado(nombreI,codI,licI));

            llNoti.setText("¡Datos guardados correctamente!");
        }
    }

    //Constructor
    public FRMAlmacen(){
        //Creación de cosas
        llPrNal=new JLabel("Productos nacionales");
        llPrNal.setBounds(20,10, 150, 30);
        llNombreNal=new JLabel("Nombre");
        llNombreNal.setBounds(20,40,50,30);
        llCodNal=new JLabel("Código");
        llCodNal.setBounds(150,40,50,30);
        llReDIAN=new JLabel("Registro DIAN");
        llReDIAN.setBounds(280,40,100,30);
        txNombreNal=new JTextField();
        txNombreNal.setBounds(20,70,100,30);
        txCodNal=new JTextField();
        txCodNal.setBounds(150,70,100,30);
        txReDIAN=new JTextField();
        txReDIAN.setBounds(280,70,100,30);

        llPrImp=new JLabel("Productos importados");
        llPrImp.setBounds(20,110,150,30);
        llNombreImp=new JLabel("Nombre");
        llNombreImp.setBounds(20,140,100,30);
        llCodImp=new JLabel("Código");
        llCodImp.setBounds(150,140,100,30);
        llLicImp=new JLabel("Lic.Import.");
        llLicImp.setBounds(280,140,100,30);
        txNombreImp=new JTextField();
        txNombreImp.setBounds(20,170,100,30);
        txCodImp=new JTextField();
        txCodImp.setBounds(150,170,100,30);
        txLicImp=new JTextField();
        txLicImp.setBounds(280,170,100,30);

        btnGuardar=new JButton("Guardar");
        btnGuardar.setBounds(450,110,100,30);
        btnGuardar.setBackground(Color.GREEN);
        btnGuardar.addActionListener(this);

        llNoti=new JLabel("Notificación");
        llNoti.setBounds(20,220,100,30);

        //Añadir elementos
        add(llPrNal);
        add(llNombreNal);
        add(llCodNal);
        add(llReDIAN);
        add(txNombreNal);
        add(txCodNal);
        add(llPrImp);
        add(txReDIAN);
        add(llNombreImp);
        add(llCodImp);
        add(llLicImp);
        add(txNombreImp);
        add(txCodImp);
        add(txLicImp);
        add(btnGuardar);
        add(llNoti);

        //Creación de ventana
        setLayout(null);
        setSize(800,500);
        setTitle("Chamo");
        setResizable(false); //Desactiva botón maximizar
        //setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocation(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        FRMAlmacen ventana=new FRMAlmacen();
        ventana.getContentPane().setBackground(Color.lightGray);
    }
}
