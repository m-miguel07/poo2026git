package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VistaConversor {

    private final JFrame     ventana;
    private final JTextField campoPesos;
    private final JLabel     etiquetaResultado;
    private final JButton    botonConvertir;

    public VistaConversor(){
        this.ventana = new JFrame("Conversor de moneda");

        ventana.setSize(360, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        ventana.setLayout(null); 

        JLabel etiquetaPesos = new JLabel("Monto en pesos:");
        this.campoPesos = new JTextField();
        this.botonConvertir = new JButton("Convertir a dolares");
        this.etiquetaResultado = new JLabel("Resultado: ...");

        etiquetaPesos.setBounds(20, 20, 120, 25);

        this.campoPesos.setBounds(150, 20, 170,25);
        this.botonConvertir.setBounds(90, 65, 180, 30);
        this.etiquetaResultado.setBounds(20, 115, 300, 25);

        ventana.add(etiquetaPesos);
        ventana.add(this.campoPesos);
        ventana.add(this.botonConvertir);
        ventana.add(this.etiquetaResultado);
    }

    //Comportamientos 
    public void mostrar(){
        this.ventana.setVisible(true);
    }

    public JButton getBotonConvertir(){
        return this.botonConvertir;
    }

    public JTextField getCampoPesos(){
        return this.campoPesos;
    }

    public void mostrarResultado(double texto){
        
        this.etiquetaResultado.setText(String.format("Resultado: %.2f USD", texto));
    }

    public void mostrarError(String mensaje){
        JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

}
