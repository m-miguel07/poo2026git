package vista;
import javax.swing.JFrame; 
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class VentanaContador extends JFrame {

    private JButton botonMas; 
    private JButton botonMenos;
    private JButton botonReiniciar;
    private JLabel  etiquetaValor;

    public VentanaContador(){
        super("Contador");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,100);
        this.setResizable(true);
        this.setLayout(new BorderLayout(10,10));
        this.setLocationRelativeTo(null);

        this.botonMas = new JButton("+");
        this.botonMenos = new JButton("-");
        this.botonReiniciar = new JButton("Reiniciar");
        this.etiquetaValor = new JLabel("Valor actual: 0");

        JPanel contenedorResultado = new JPanel(new BorderLayout(10,10));
        JPanel contenedorBotones = new JPanel(new BorderLayout(10,10));

        JPanel panelResultado = new JPanel(new FlowLayout());
        panelResultado.add(etiquetaValor);

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(botonMas);
        panelBotones.add(botonMenos);
        panelBotones.add(botonReiniciar);

        contenedorBotones.add(panelBotones,BorderLayout.CENTER);
        contenedorResultado.add(panelResultado,BorderLayout.CENTER);

        this.add(contenedorBotones,BorderLayout.SOUTH);
        this.add(contenedorResultado,BorderLayout.NORTH);
    }   

    //Getters
    public JButton getBotonMas(){
        return this.botonMas;
    }

    public JButton getBotonMenos(){
        return this.botonMenos;
    }

    public JButton getBotonReiniciar(){
        return this.botonReiniciar;
    }

    //Comportamientos
    public void mostrarResultado(String texto) {
        this.etiquetaValor.setText("Valor actual: " + texto);
    }
    
    public void mostrar(){
        this.setVisible(true);
    }
    
}
