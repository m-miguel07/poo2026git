package controlador;

import vista.VentanaCombate;
import modelo.Combate;

public class Controlador {
    
    private final VentanaCombate vista;
    private final Combate modelo;

    public Controlador(VentanaCombate vista, Combate modelo){
        this.vista = vista;
        this.modelo = modelo;

        this.vista.getBotonSaludo().addActionListener(evento -> saludo());
        this.vista.getBotonReiniciar().addActionListener(evento -> reiniciar());
        this.vista.getBotonSalir().addActionListener(evento -> salir());
    }

    public void saludo(){
        this.modelo.mostrarSaludo();
    }

    public void reiniciar(){
        this.modelo.mostrarReiniciar();
    }
    
    public void salir(){
        this.vista.dispose();
    }
}
