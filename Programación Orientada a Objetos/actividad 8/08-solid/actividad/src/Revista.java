public class Revista extends Publicacion {

    private final int numero;

    public Revista (String titulo, String autor, int anio, int numero){
        super(titulo,autor,anio);

        this.numero = numero;
    }

    @Override
    public void mostrarDetalle(){
        super.mostrarDetalle();

        System.out.println("Número: " + this.numero);
    }

}
