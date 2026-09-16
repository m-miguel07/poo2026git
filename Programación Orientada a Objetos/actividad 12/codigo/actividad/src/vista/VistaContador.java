package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.ObservadorConversor;
import modelo.Conversor;

import java.awt.BorderLayout;

public class VistaContador implements ObservadorConversor {

    private final JFrame ventana; 
    private final JLabel etiquetaContador;
    private int contador;

    public VistaContador() {
        this.ventana = new JFrame("Contador");
        this.etiquetaContador = new JLabel("Conversiones: 0");
        this.contador = 0;

        this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ventana.setResizable(false);
        this.ventana.setLayout(new BorderLayout(10,10));

        JPanel contenedorEtiqueta = new JPanel(new BorderLayout(10,10));
        contenedorEtiqueta.add(etiquetaContador,BorderLayout.CENTER);

        this.ventana.add(contenedorEtiqueta,BorderLayout.CENTER);
        this.ventana.pack();
    }

    @Override 
    public void conversorCambio(Conversor conversor){
        this.incrementar();
        this.etiquetaContador.setText("Conversiones: " + this.contador);
    }

    private void incrementar(){
        this.contador++;
    }

    public void mostrar(){
        this.ventana.setVisible(true);
    }
}
