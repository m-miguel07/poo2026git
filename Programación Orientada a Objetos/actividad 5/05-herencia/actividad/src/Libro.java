// Archivo: Libro.java
// Completa y funcionando. Es la clase mas vieja del catalogo.

public class Libro extends Producto {

    // TODO 5: heredar de Producto con extends, borrar lo que quedo duplicado,
    //         llamar a super(...) como primera instruccion del constructor y
    //         sobrescribir mostrarDetalle() reutilizando super.mostrarDetalle()
    //         para el encabezado y agregando el autor y el ISBN.

    private final String autor;
    private final String isbn;

    //El metodo es identico hasta precio, autor e isbn varian.
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

    public void mostrarDetalle(){
        super.mostrarDetalle();

        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
    }
}


