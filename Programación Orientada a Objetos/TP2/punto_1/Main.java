import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void delay(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e){

        }
    }

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Heroe[] arr_heroes = new Heroe[3];
        Enemigo[] arr_enemigos = new Enemigo[3];

        Heroe heroe1 = new Heroe ("Aloy");
        Heroe heroe2 = new Heroe ("Geralt");
        Heroe heroe3 = new Heroe ("Kratos");

        Enemigo enemigo1 = new Enemigo("A");
        Enemigo enemigo2 = new Enemigo("B");
        Enemigo enemigo3 = new Enemigo("C");

        arr_heroes[0] = heroe1;
        arr_heroes[1] = heroe2;
        arr_heroes[2] = heroe3;

        arr_enemigos[0] = enemigo1;
        arr_enemigos[1] = enemigo2;
        arr_enemigos[2] = enemigo3;

        /* 
        System.out.println(heroe1);
        
        System.out.println();

        System.out.println(heroe2);
        
        System.out.println();

        heroe1.setPuntosVida(heroe1.getPuntosVida() - 30);
        System.out.println(heroe1.getNombre() + " - PS: " + heroe1.getPuntosVida());

        heroe2.lanzarHechizo();
        System.out.println(heroe2.getNombre() + " - PM: " + heroe2.getPuntosMana());

        System.out.println();
        */

        boolean fin_partida = false;

        while (!fin_partida) {
            System.out.println("Seleccione un heroe:");
            System.out.println(heroe1);
            System.out.println();
            System.out.println(heroe2);
            System.out.println();
            System.out.println(heroe3);
        
            System.out.println();
            System.out.print("Heroe: ");
            String heroe = teclado.nextLine();
            System.out.println();

            System.out.println("Seleccione que (numero) enemigo atacar:");

            int i = 1;

            //Inicialmente se planteo como condicionales anidados, luego se investigó la implementación del for each

            for (Enemigo e : arr_enemigos){
                if (e.getPuntosVida() > 0) {
                    System.out.println("E" + i + ": PS= " + e.getPuntosVida());
                }
                i++;
            }

            boolean valido = false;

            int enemigo = 0; //Inicialización

            while (!valido) {
                System.out.print("E: ");
                enemigo = teclado.nextInt() - 1; //Se le resta uno, ya que el array va de 0 a 2, y el jugador selecciona de 1 a 3.

                if ((enemigo >= 0 && enemigo <= 2) && !arr_enemigos[enemigo].getDerrotado()) {
                    valido = true;
                } else {
                    System.out.println("Número de enemigo invalido.");
                }
            }
            
            System.out.println();

            int cantidad_derrotados = 0;

            for (Heroe h : arr_heroes){
                if (h.getNombre().equals(heroe)){
                    h.lanzarHechizo(arr_enemigos[enemigo]);
                    System.out.println(h.getNombre() + " Inflinge " + h.getDanioBase() + " de daño a " + arr_enemigos[enemigo].getNombre());

                    if (arr_enemigos[enemigo].getPuntosVida() <= 0){
                        System.out.println("Enemigo " + arr_enemigos[enemigo].getNombre() + " derrotado.");
                        arr_enemigos[enemigo].setDerrotado();

                        if (cantidad_derrotados < arr_enemigos.length) {
                            cantidad_derrotados++;
                        } else {
                            fin_partida = true;
                        }
                    }
                    break;
                }
            }

            valido = false;

            int random = -1; //Inicialización

            while (!valido){
                random = new Random().nextInt(arr_enemigos.length);
                if (!arr_enemigos[random].getDerrotado()) { //Si el enemigo no esta derrotado, puede atacar.
                    valido = true;
                }
            }

            int random2 = new Random().nextInt(arr_heroes.length);

            delay(1000);

            System.out.println();
            arr_enemigos[random].atacar(arr_heroes[random2]);;
            System.out.println();

            delay(1000);

            teclado.nextLine();
        }

        teclado.close();
        
    }
}