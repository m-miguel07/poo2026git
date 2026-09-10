public abstract class Personaje {

    private String  nombre;
    private double puntosVida;
    private double danioBase;
    private Boolean derrotado = false;


    public Personaje (String nombre){
        if (!setNombre(nombre)){
            throw new IllegalArgumentException("Nombre invalido");
        }

        this.puntosVida = 100;
        this.danioBase = 20;

    }

    public Personaje (String nombre, Integer puntosVida, Integer danioBase){

        if (!setNombre(nombre)){
            throw new IllegalArgumentException("Nombre invalido");
        }

        if (puntosVida <= 0){
            throw new IllegalArgumentException("La vida asignada debe ser positiva");
        }
        this.puntosVida = puntosVida;

        if (danioBase < 1){
            throw new IllegalArgumentException("El daño base no puede ser menor a 1");
        }
        this.danioBase = danioBase;

    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPuntosVida(){
        return this.puntosVida;
    }

    public double getDanioBase(){
        return this.danioBase;
    }

    public Boolean getDerrotado(){
        return this.derrotado;
    }



    public Boolean setNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            return false;
        } else{
            this.nombre = nombre;
        }   return true;
    }

    public Boolean setPuntosVida(double puntosVida) {
        if (puntosVida > 100){
            return false;
        } else {
            if (puntosVida <= 0) {
                System.out.println(this.getNombre() + " ha sido derrotado");
            }
            this.puntosVida = puntosVida;
            return true;
        }
    }

    public Boolean setDerrotado(){
        if (derrotado){
            this.derrotado = false;
            return false;
        } 

        this.derrotado = true;
        return true;
    }

    public abstract void atacar(Personaje objetivo);
    public abstract void recibirDanio(double danio);

    public void presentarse(){
        System.out.println("Soy el personaje " + this.getNombre() + " y estoy listo para la acción");
    }

    @Override
    public String toString(){
        return("N: " + this.getNombre() + "\nPS: " +  this.getPuntosVida() + "\nDB: " + this.getDanioBase());
    }
}