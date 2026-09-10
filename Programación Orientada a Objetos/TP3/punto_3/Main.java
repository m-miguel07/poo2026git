import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void delay(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e){

        }
    }

    private static int indice_heroe(ArrayList<Personaje> personaje){    
        
        Random random = new Random();

        boolean valido = false;
        int heroe;

            while (!valido) {
                heroe = random.nextInt(0,personaje.size());
                if (personaje.get(heroe).getDerrotado() || (personaje.get(heroe) instanceof Enemigo)){
                    valido = false;
                } else {
                    valido = true;
                }
            }


    }

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        ArrayList<Personaje> personaje = new ArrayList<>();

        Heroe heroe1 = new Heroe ("Aloy");
        Heroe heroe2 = new Heroe ("Geralt");
        Heroe heroe3 = new Heroe ("Kratos");

        personaje.add(heroe1);
        personaje.add(heroe2);
        personaje.add(heroe3);
        
        Enemigo enemigo1 = new Enemigo("A");
        Enemigo enemigo2 = new Enemigo("B");
        Enemigo enemigo3 = new Enemigo("C");

        personaje.add(enemigo1);
        personaje.add(enemigo2);
        personaje.add(enemigo3);
        
        boolean finBatalla = false;
        boolean valido = false;
        int heroe = 0;
        int enemigo = 0;
        int enemigos_derrotados = 0;
        int heroes_derrotados = 0;
        
        
        while (!finBatalla){
           
            valido = false;

            while (!valido) {
                heroe = random.nextInt(0,personaje.size());
                if (personaje.get(heroe).getDerrotado() || (personaje.get(heroe) instanceof Enemigo)){
                    valido = false;
                } else {
                    valido = true;
                }
            }

            valido = false;

            while (!valido) {
                enemigo = random.nextInt(0,personaje.size());
                if (personaje.get(enemigo).getDerrotado() || (personaje.get(enemigo) instanceof Heroe)) {
                    valido = false;
                } else {
                    valido = true;
                }
            }
            
            delay(1500);
            
            
            personaje.get(heroe).atacar(personaje.get(enemigo));

            personaje.get(enemigo).atacar(personaje.get(heroe));
            

        }
        

        teclado.close();
        
    }
}