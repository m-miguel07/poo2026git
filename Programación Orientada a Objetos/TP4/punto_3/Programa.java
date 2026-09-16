
import modelo.Contador;
import vista.VentanaContador;
import controlador.GestorContador;

public class Programa {
    public static void main (String[] args){
        Contador contador = new Contador();
        VentanaContador ventana = new VentanaContador();

        GestorContador gestor = new GestorContador(ventana, contador);
        ventana.mostrar();
    }
}