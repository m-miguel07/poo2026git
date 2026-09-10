public class Alimento extends Producto{

    private static final double DESCUENTO = 0.20;

    private final String fechaVencimiento;

    public Alimento(String codigo, String nombre, double precio, String fechaVencimiento){
        super(codigo,nombre,precio);

        if (fechaVencimiento == null || fechaVencimiento.isEmpty()){
            throw new IllegalArgumentException("La fecha de vencimiento es obligatoria.");
        }

        this.fechaVencimiento = fechaVencimiento;
    }

    public void mostrarDetalle(){
        super.mostrarDetalle();

        System.out.println("Fecha de vencimiento: " + this.fechaVencimiento);
        System.out.println("Precio oferta: " +  (this.getPrecio() - (this.getPrecio() * DESCUENTO)));
    }
}
