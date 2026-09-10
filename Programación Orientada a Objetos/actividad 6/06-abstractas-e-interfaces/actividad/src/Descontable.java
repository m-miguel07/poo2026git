public interface Descontable {
    double DESCUENTO_MAXIMO = 0.50;

    Boolean aplicarDescuento(int porcentaje);
    double getPrecioConDescuento();

}
