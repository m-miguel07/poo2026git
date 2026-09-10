public interface Prestable {
    
    boolean prestar(String socio);
    boolean devolver();
    double multaPorRetraso(int diasDeRetraso);

}
