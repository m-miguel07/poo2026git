import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int numero_azar = new Random().nextInt(10);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero = teclado.nextInt();

        if (numero == numero_azar){
            System.out.println(numero + " es igual a " + numero_azar);
        } else {
            System.out.println(numero + " es distinto a " + numero_azar);
        }

        if (numero > numero_azar){
            System.out.println(numero + " es mayor a " + numero_azar);
        } else if (numero < numero_azar){
            System.out.println(numero + " es menor a " + numero_azar);
        }

        if (numero >= numero_azar){
            System.out.println(numero + " es mayor o igual a " + numero_azar);
        }

        if (numero <= numero_azar){
            System.out.println(numero + " es menor o igual a " + numero_azar);
        }
        
        teclado.close();
    }
}