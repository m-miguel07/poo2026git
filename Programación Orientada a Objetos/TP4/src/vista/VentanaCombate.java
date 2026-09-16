package vista;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class VentanaCombate extends JFrame {
    
    private final JButton botonSaludo;
    private final JButton botonReiniciar;
    private final JButton botonSalir;

    public VentanaCombate(){
        super("Ventana de combate");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setResizable(false);
        this.setLayout(new BorderLayout(10,10));
        this.setLocationRelativeTo(null);

        this.botonSaludo = new JButton("Saludar");
        this.botonReiniciar = new JButton("Reiniciar");
        this.botonSalir = new JButton("Salir");

        JPanel panelCentro = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelCentro.add(botonSaludo);
        panelCentro.add(botonReiniciar);
        panelCentro.add(botonSalir);
        this.add(panelCentro,BorderLayout.CENTER);
    }

    public JButton getBotonSaludo(){
        return this.botonSaludo;
    }

    public JButton getBotonReiniciar(){
        return this.botonReiniciar;
    }

    public JButton getBotonSalir(){
        return this.botonSalir;
    }
    
}