public class Libro extends Publicacion implements Prestable {
    
    private static final double MULTA_LIBRO_POR_DIA = 500;

    private final int paginas;
    private String prestadoA;

    public Libro(String titulo, String autor, int anio, int paginas){
        super(titulo, autor, anio);

        if (paginas <= 0) {
            throw new IllegalArgumentException ("La cantidad de paginas no puede ser menor o igual a 0");
        }

        this.paginas = paginas;
    }

    @Override 
    public void mostrarDetalle(){
        super.mostrarDetalle();
        System.out.println("Cantidad de paginas: " + this.paginas);
    }

    @Override
    public boolean prestar(String socio){
        if (socio == null || socio.isBlank() || this.prestadoA != null) {
            return false;
        }
        this.prestadoA = socio;
        return true;
    }

    @Override 
    public boolean devolver(){
        if (this.prestadoA == null) {
            return false;
        }
        this.prestadoA = null;
        return true;
    }

    @Override
    public double multaPorRetraso(int diasDeRetraso){
        if (diasDeRetraso <= 0) {
            return 0;
        }

        return diasDeRetraso * MULTA_LIBRO_POR_DIA;

    }
}
