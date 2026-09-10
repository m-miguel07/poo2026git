public class Guerrero extends Heroe {
    private double escudo;

    public Guerrero (String nombre, Integer puntosVida, Integer puntosMana,  Integer danioBase, Integer nivel, double escudo){
        super(nombre,puntosVida,puntosMana,danioBase,nivel);

        if (escudo < 0){
            throw new IllegalArgumentException("El escudo no puede ser negativo");
        }

        this.escudo = escudo;
    }

    //Getters
    public double getEscudo(){
        return this.escudo;
    }

    //Setter
    public Boolean setEscudo(double escudo){
        if (escudo < 0){
            return false;
        }
        this.escudo = escudo;
        return true;
    }

    //Comportamientos
    @Override
    public void recibirDanio(double cantidad){
        this.setPuntosVida(this.getPuntosVida() - (cantidad - (cantidad * escudo)));
        if (this.getPuntosVida() <= 0){
            System.out.println("El guerrero " + this.getNombre() + " Ha sido derrotado");
            this.setDerrotado();

        }
    }
}
