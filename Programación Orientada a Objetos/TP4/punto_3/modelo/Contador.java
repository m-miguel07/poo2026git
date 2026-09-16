package modelo;

public class Contador {
    private int valor;

    //Constructor
    public Contador(){
        this.valor = 0;
    }

    //Getter
    public int getValor(){
        return this.valor;
    }

    //Comportamientos
    public void reiniciar(){
        this.valor = 0;
    }
    public void incrementar(){
        this.valor++;
    }

    public void decrementar(){
        this.valor--;
    }
}
