// Archivo: Alimento.java
// Los alimentos de la canasta basica tributan un IVA reducido: 10,5%.

public class Alimento extends Producto implements Descontable {

    // TODO 5: declarar el IVA reducido (0.105) e implementar
    //         getPrecioFinal().

    private static final double IVA = 0.105;

    // TODO 9: un alimento se liquida cuando se acerca el vencimiento. Agregar
    //         implements Descontable, el atributo del porcentaje y los dos
    //         metodos del contrato, y borrar la constante DESCUENTO y la linea
    //         del precio de oferta, que pasan a ser parte del contrato.

    private final String fechaVencimiento;
    private int porcentaje;

    public Alimento(String codigo, String nombre, double precio, String fechaVencimiento) {
        super(codigo, nombre, precio);
        if (fechaVencimiento == null || fechaVencimiento.isBlank()) {
            throw new IllegalArgumentException("La fecha de vencimiento es obligatoria");
        }
        this.fechaVencimiento = fechaVencimiento;
    }


    @Override
    public double getPrecioFinal(){
        return this.getPrecio() - (this.getPrecio() * IVA);
    }

    @Override
    public Boolean aplicarDescuento(int porcentaje){
        if (porcentaje * 100 > DESCUENTO_MAXIMO){
            return false;
        }
        this.porcentaje = porcentaje;
        
        return true;
    }

    @Override
    public double getPrecioConDescuento(){
        return this.getPrecio() - (this.getPrecio() * (this.porcentaje / 100));
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Vence: " + this.fechaVencimiento);
    }
}
