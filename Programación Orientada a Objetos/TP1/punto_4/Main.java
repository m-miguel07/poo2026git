import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba el primer número entero");
        int num_1 = teclado.nextInt();

        System.out.println("Escriba el segundo número:");
        int num_2 = teclado.nextInt();

        System.out.println("La suma es " + (num_1 + num_2));

        teclado.close();

    }

}
