// Archivo: Publicacion.java
// Primera version del catalogo de la biblioteca. Una sola clase representa
// cualquier publicacion, y el atributo tipo dice cual es.
//
// TODO 1: convertir esta clase en abstracta, sin tipo, paginas ni numero.
//         Se queda con titulo, autor y anio, sus getters y un mostrarDetalle()
//         concreto con la parte comun. prestar(), devolver(), multaPorRetraso()
//         y exportarJson() se van de aca.
// TODO 2: escribir Libro.java (con paginas) y Revista.java (con numero), las
//         dos extends Publicacion. Cada una sobrescribe mostrarDetalle()
//         llamando a super.mostrarDetalle() y agregando lo suyo.
// TODO 3: escribir la interfaz Prestable.java con prestar(String socio),
//         devolver() y multaPorRetraso(int diasDeRetraso). La implementa
//         Libro, con el atributo prestadoA adentro. Revista no la implementa.

public abstract class Publicacion {

    private final String titulo;
    private final String autor;
    private final int anio;


    public Publicacion(String titulo, String autor, int anio) {
        
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo es obligatorio");
        }
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("El autor es obligatorio");
        }
        if (anio < 1450) {
            throw new IllegalArgumentException("El anio no es valido");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnio() {
        return this.anio;
    }

    public void mostrarDetalle() {
        System.out.println(this.titulo + " (" + this.anio + ")");
        System.out.println("Autor: " + this.autor);
    }

}
