public class Enemigo extends Personaje{


    public Enemigo (String nombre){
        super(nombre);
    }

    //Metodos
    @Override
    public void atacar(Personaje objetivo){
        objetivo.recibirDanio(this.getDanioBase());
        System.out.println(this.getNombre() + " ataca a " + objetivo.getNombre() + " infligiendo " + this.getDanioBase() + " de daño");
    }

    @Override
    public void recibirDanio(double danio){
        this.setPuntosVida(this.getPuntosVida() - danio);
    }
    @Override
    public void presentarse(){
        System.out.println("¡Soy el temible " + this.getNombre() + "y voy a destruirte! (Vida: " + this.getPuntosVida() + ")");
    }

}
