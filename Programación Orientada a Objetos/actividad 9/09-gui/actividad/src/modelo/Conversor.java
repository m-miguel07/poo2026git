package modelo;

public class Conversor {

    private final double pesosPorDolar;
    private final double pesosPorEuro;

    public Conversor(double pesosPorDolar, double pesosPorEuro){
        if (pesosPorDolar < 0 || pesosPorEuro < 0) {
            throw new IllegalArgumentException("La cotización no puede ser negativa");
        }

            this.pesosPorDolar = pesosPorDolar;
            this.pesosPorEuro = pesosPorEuro;
        }

    public double aDolares(double pesos){
        if (pesos < 0){
            throw new IllegalArgumentException("Los pesos no pueden ser negativos");
        }
        return pesos / this.pesosPorDolar;
    }

    public double aEuros(double pesos){
        if (pesos < 0){
            throw new IllegalArgumentException("Los pesos no pueden ser negativos");
        }
        return pesos / this.pesosPorEuro;
    }
}

