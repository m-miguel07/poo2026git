import vista.VentanaCombate;
import modelo.Combate;
import controlador.Controlador;

public class Programa {
	public static void main(String[] args) {
       
        Combate combate = new Combate();
        VentanaCombate ventana = new VentanaCombate();
        Controlador controlador = new Controlador(ventana,combate);
        ventana.setVisible(true);
	}
}
