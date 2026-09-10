public class Enemigo {
    private String nombre;
    private Integer puntosVida;
    private Integer danioBase; 
    private Boolean derrotado = false;

    public Enemigo (String nombre){
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("Nombre invalido.");
        } 

        this.nombre = nombre;

        this.puntosVida = 100;
        this.danioBase = 10;
    }

    //Setters

    public Boolean setPuntosVida(Integer puntosVida){
        if (puntosVida < 0 || puntosVida > 100){
            return false;
        } 

        this.puntosVida = puntosVida;
        return true;
    }

    public Boolean setDanioBase(Integer danioBase){
        if (danioBase <= 0){
            return false;
        }

        this.danioBase = danioBase;
        return true;
    }

    public Boolean setDerrotado(){
        if (derrotado){
            this.derrotado = false;
            return false;
        } 

        this.derrotado = true;
        return true;
    }

    //Getters
    public String getNombre(){
        return this.nombre;
    }

    public Integer getPuntosVida(){
        return this.puntosVida;
    }

    public Integer getDanioBase(){
        return this.danioBase;
    }
    
    public Boolean getDerrotado(){
        return this.derrotado;
    }

    //Metodos
    public void atacar(Heroe objetivo){
        objetivo.setPuntosVida(objetivo.getPuntosVida() - this.getDanioBase());
        System.out.println(this.getNombre() + " ataca a " + objetivo.getNombre() + " infligiendo " + this.getDanioBase() + " de daño");
    }

}
