package vista;

import javax.swing.JFrame;
import javax.swing.JButton;

public class VentanaCombate extends JFrame {
    
    private final JButton botonSaludo;

    public VentanaCombate(){
        super("Ventana de combate");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        this.botonSaludo = new JButton("Saludar");
        this.botonSaludo.setBounds(340,300,100,30);
        this.add(botonSaludo);
    }

    public JButton getBotonSaludo(){
        return this.botonSaludo;
    }
    
}