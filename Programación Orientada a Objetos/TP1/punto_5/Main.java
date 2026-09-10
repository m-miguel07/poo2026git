import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la primer frase:");
        String frase_1 = teclado.nextLine();

        System.out.println();

        System.out.println("Ingrese la segunda frase:");
        String frase_2 = teclado.nextLine();

        System.out.println();

        System.out.println("El resultado de las dos frases ingresadas son: " + frase_1 + " " +  frase_2);

        teclado.close();
    }
}