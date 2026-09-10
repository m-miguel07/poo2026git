package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaConversor;
import modelo.Conversor;

public class ControladorConversor implements ActionListener {
    
    private VistaConversor vistaConversor;
    private Conversor modeloConversor;

    public ControladorConversor(VistaConversor vista, Conversor modelo){
        if (vista == null || modelo == null){
            throw new IllegalArgumentException("La vista y/o modelo son obligatorios");
        }
        this.vistaConversor = vista;
        this.modeloConversor = modelo;

        this.vistaConversor.getBotonConvertir().addActionListener(this);
    }

    @Override 
    public void actionPerformed(ActionEvent evento){
        String texto = vistaConversor.getCampoPesos().getText();
        try {
            double pesos = Double.parseDouble(texto);
            double dolares = modeloConversor.aDolares(pesos);

            this.vistaConversor.mostrarResultado(dolares);

        } catch (NumberFormatException ex) {
            this.vistaConversor.mostrarError("Ingrese un número");
        }
    }
}
