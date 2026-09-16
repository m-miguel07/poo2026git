package controlador;

import vista.VentanaContador;
import modelo.Contador;

public class GestorContador {
    private VentanaContador vista;
    private Contador contador;

    public GestorContador(VentanaContador vista, Contador contador){
        if (vista == null || contador == null){
            throw new IllegalArgumentException("El modelo y la vista son obligatorios");
        }

        this.vista = vista;
        this.contador = contador;

        vista.getBotonMas().addActionListener(evento -> incrementar());
        vista.getBotonMenos().addActionListener(evento -> decrementar());
        vista.getBotonReiniciar().addActionListener(evento -> reiniciar());
        
    }

    private void incrementar(){
        this.contador.incrementar();
        this.vista.mostrarResultado(String.valueOf(contador.getValor()));
    }

    private void decrementar(){
        this.contador.decrementar();
        this.vista.mostrarResultado(String.valueOf(contador.getValor()));
    }

    private void reiniciar(){
        this.contador.reiniciar();
        this.vista.mostrarResultado(String.valueOf(contador.getValor()));
    }
}