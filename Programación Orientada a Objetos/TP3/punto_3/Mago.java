public class Mago extends Heroe {

    private static final Integer COSTO_HECHIZO = 20;
    private double poderMagico;

    public Mago (String nombre, Integer puntosVida, Integer puntosMana,  Integer danioBase, Integer nivel, double poderMagico){
       
        super(nombre,puntosVida,danioBase,puntosMana, nivel);

        if (nivel < 1){
            throw new IllegalArgumentException("El nivel no puede ser menor a 1");
        }

        this.poderMagico = poderMagico;
    }

    //Getter
    public double getPoderMagico(){
        return this.poderMagico;
    }

    //Setter
    public boolean setPoderMagico(double poderMagico){
        if (poderMagico < 0){
            return false;
        }

        this.poderMagico = poderMagico;
        return true;
    }

    //Comportamientos
    @Override
    public void atacar(Personaje objetivo){
        if (this.getPuntosMana() < COSTO_HECHIZO){
            System.out.println("Cantidad de mana insuficiente.");
        } else {
            this.setPuntosMana(this.getPuntosMana() - COSTO_HECHIZO);
            objetivo.recibirDanio(this.getPoderMagico());
        }
    }

    @Override
    public void recibirDanio(double danio){
        this.setPuntosVida(this.getPuntosVida() - danio);
    }

}
