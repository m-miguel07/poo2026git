package controlador;

import vista.VentanaCombate;
import modelo.Combate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    
    private final VentanaCombate vista;
    private final Combate modelo;

    public Controlador(VentanaCombate vista, Combate modelo){
        this.vista = vista;
        this.modelo = modelo;

        this.vista.getBotonSaludo().addActionListener(evento -> this.mostrarMensaje());

    }

    private void mostrarMensaje(){
        System.out.println("¡Hola, arena de combate!");
    }
}
