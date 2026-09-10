public class Heroe {

    //ATRIBUTOS
    private String  nombre;
    private Integer puntosVida;
    private Integer puntosMana;
    private Integer danioBase;
    private Integer nivel;

    //CONSTRUCTOR
    public Heroe (String nombre){
     
        if (!setNombre(nombre)) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        
        this.puntosVida = 100;
        this.puntosMana = 50;
        this.danioBase = 20;
        this.nivel = 1;
        
    }

    public Heroe(String nombre, Integer puntosVida, Integer puntosMana,  Integer danioBase, Integer nivel){
     
        if (!setNombre(nombre)){
            throw new IllegalArgumentException("Nombre invalido");
        }

        if (puntosVida <= 0){
            throw new IllegalArgumentException("La vida asignada debe ser positiva");
        } else {
            this.puntosVida = puntosVida;
        }

        if (puntosMana <= 0){
            throw new IllegalArgumentException("Los puntos de mana asignados deben ser positivos");
        }

        if (nivel < 1){
            throw new IllegalArgumentException("El nivel no puede ser menor a 1");
        }

        if (danioBase < 1){
            throw new IllegalArgumentException("El daño base no puede ser menor a 1");
        }
    }

    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public Integer getPuntosVida(){
        return this.puntosVida;
    }
    public Integer getPuntosMana(){
        return this.puntosMana;
    }

    public Integer getDanioBase(){
        return this.danioBase;
    }

    public Integer getNivel(){
        return this.nivel;
    }

    //SETTERS
    public Boolean setNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            return false;
        } else{
            this.nombre = nombre;
        }   return true;
    }

    public Boolean setPuntosVida(Integer puntosVida) {
        if (puntosVida > 100){
            return false;
        } else {
            if (puntosVida <= 0) {
                System.out.println("El personaje ha sido derrotado");
            }
            this.puntosVida = puntosVida;
            return true;
        }
    }

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
    public void recibirDanio (Integer cantidad){
        setPuntosVida(this.puntosVida - cantidad);
    }

    public void lanzarHechizo(Enemigo enemigo){
        if (getPuntosMana() < 10){
            System.out.println("Mana insuficiente");
            return;
        }
        setPuntosMana((puntosMana - 10));
        
        enemigo.setPuntosVida(enemigo.getPuntosVida() - this.danioBase);
    }

    @Override
    public String toString(){
        return("NH: " + this.getNombre() + "\nPS: " +  this.getPuntosVida() + "\nPM: " + this.getPuntosMana() + "\nNV: " + this.getNivel());
    }
}
