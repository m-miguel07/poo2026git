public class Heroe extends Personaje{

    //ATRIBUTOS

    private Integer puntosMana;
    private Integer nivel;

    //CONSTRUCTOR
    public Heroe (String nombre){
        super(nombre);

        this.puntosMana = 50;
        this.nivel = 1;
        
    }

    public Heroe(String nombre, Integer puntosVida, Integer puntosMana,  Integer danioBase, Integer nivel){
     
        super(nombre,puntosVida,danioBase);

        if (puntosMana <= 0){
            throw new IllegalArgumentException("Los puntos de mana asignados deben ser positivos");
        }

        if (nivel < 1){
            throw new IllegalArgumentException("El nivel no puede ser menor a 1");
        }

        this.puntosMana = puntosMana;
        this.nivel = nivel;
    }

    //GETTERS
    
    public Integer getPuntosMana(){
        return this.puntosMana;
    }

    public Integer getNivel(){
        return this.nivel;
    }

    //SETTERS

    public Boolean setPuntosMana (Integer puntosMana){
        if (puntosMana < 0) {
            return false;
        } else {
            this.puntosMana = puntosMana;
            return true;
        }
    }

    public Boolean setNivel (Integer nivel){
        if (nivel < 1){
            return false;
        } else {
            this.nivel = nivel;
            return true;
        }
    }

    //MÉTODOS
    public void lanzarHechizo(Enemigo enemigo){
        if (getPuntosMana() < 10){
            System.out.println("Mana insuficiente");
            return;
        }
        setPuntosMana((puntosMana - 10));
        
        enemigo.setPuntosVida(enemigo.getPuntosVida() - this.getDanioBase());
    }
    
    @Override
    public void presentarse(){
        System.out.println("¡Soy el heroe " + this.getNombre() + " y lucharé por la justicia! (Vida: " + this.getPuntosVida() + ")");
    }

    @Override
    public void atacar(Personaje objetivo){
        double danio = this.nivel * 5; 

        objetivo.setPuntosVida(this.getPuntosVida() - danio); 

    }

    public void atacar(Personaje objetivo, double multiplicadorFuerza){
        double danio = (this.nivel * 5) * multiplicadorFuerza;

        objetivo.setPuntosVida(this.getPuntosVida() - danio);

    }

    @Override
    public void recibirDanio(double danio){
        this.setPuntosVida(this.getPuntosVida() - danio);
    }

    @Override
    public String toString(){
        super.toString();
        return ("PM: " + this.getPuntosMana() + "\n NV: " + this.getNivel());
    }
}
