// Archivo: Libro.java
// Los libros estan exentos de IVA.

public class Libro extends Producto implements Descontable {

    // TODO 3: declarar el IVA que le corresponde a un libro (esta exento,
    //         asi que es 0.0) e implementar getPrecioFinal().

    private static final double IVA = 0.0;

    // TODO 8: un libro se liquida cuando la editorial saca una edicion nueva.
    //         Agregar implements Descontable, el atributo del porcentaje y los
    //         dos metodos del contrato.

    private int porcentaje;

    private final String autor;
    private final String isbn;
    

    public Libro(String codigo, String nombre, double precio, String autor, String isbn) {
        super(codigo, nombre, precio);
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("El autor es obligatorio");
        }
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("El ISBN es obligatorio");
        }
        this.autor = autor;
        this.isbn = isbn;
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
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
    }
}
