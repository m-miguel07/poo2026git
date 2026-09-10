// Archivo: Electronico.java
// Nacio como copia de Libro.java. El que hizo la copia adapto casi todo.

public class Electronico extends Producto {

    // TODO 6: lo mismo que el TODO 5, pero para esta clase. Al terminar,
    //         el autor fantasma desaparece solo.

    private final String fabricante;
    private final int mesesGarantia;

     //El metodo es identico hasta precio, fabricante y mesesGarantia varian
    public Electronico(String codigo, String nombre, double precio, String fabricante, int mesesGarantia) {
        
        super(codigo, nombre, precio);

        if (fabricante == null || fabricante.isBlank()) {
            throw new IllegalArgumentException("El fabricante es obligatorio");
        }
        if (mesesGarantia < 0) {
            throw new IllegalArgumentException("La garantia no puede ser negativa");
        }

        this.fabricante = fabricante;
        this.mesesGarantia = mesesGarantia;
    }

    //Mostrar detalle es identico hasta la parte de precio
    public void mostrarDetalle() {
        super.mostrarDetalle();

        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Garantia: " + this.mesesGarantia + " meses");
    }
}
