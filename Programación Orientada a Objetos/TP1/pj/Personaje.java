public class Personaje {

    //ATRIBUTOS
    private String  nombre;
    private Integer vida;
    private Integer ataque;
    private Integer fuerza;

    public Integer get_vida(){
        return this.vida;
    }
    //CONSTRUCTOR
    public Personaje(String nombre, Integer vida){
        this.nombre = nombre;
        this.ataque = (int) (Math.random() * 100); //El (int) convierte el dato de tipo doble a entero
    }
       
    //SETTER
    public void set_vida(Integer vida){
        if (vida < 0 && vida > 100){
            System.out.println("Valor de vida invalido");
        } else {
            this.set_vida(vida);
        }
    }

}

