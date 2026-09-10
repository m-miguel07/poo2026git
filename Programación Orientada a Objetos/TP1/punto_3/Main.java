import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        String name = teclado.nextLine();

        Usuario user_1 = new Usuario(name);

        System.out.println("Tu nombre es " + user_1.get_name() );

        teclado.close();
    }
}