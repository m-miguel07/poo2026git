import java.util.Scanner;

public class Main { 

    private static final int max = 10; //max : constant integer := 10;

    static class t_info {   
        int legajo;
        String nombre_apellido;
        int dasu;
    }

    static class t_info_2 {
        int legajo;
        String nombre_apellido;
    }

    static int dim, dim2, dim3;

    static t_info[] universidad = new t_info[max];
    static t_info[] afiliados = new t_info[max];
    static t_info_2[] no_afiliados = new t_info_2[max]; 
    
    static Scanner scanner = new Scanner(System.in); //Para leer datos desde la consola

    static int cant_no_afiliados = 0;

    public static void delay (int milisegundos) {
        try{
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {

        }
    }

    public static void leer_datos () {
        int i = 0;
        boolean valido = false;
        char rta;

        do 
        {
            universidad[i] = new t_info(); //Nuevo elemento en el arreglo
            do
                try {

                    System.out.print("Ingrese N°Legajo: ");
                    universidad[i].legajo = scanner.nextInt();
                    System.out.println();

                    if (universidad[i].legajo < 0) {
                    throw new IllegalArgumentException ("El numero no puede ser negativo.");
                    }

                    valido = true;

                }catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println();

                    delay(1500);
                    }
                catch (Exception e) {
                    System.out.println("Ingrese un número entero.");
                    System.out.println();

                    scanner.nextLine();
                }  
            while (!valido);

            scanner.nextLine(); //skip_line;

            System.out.print("Ingrese nombre y apellido: ");
            universidad[i].nombre_apellido = scanner.nextLine();
            System.out.println();

            valido = false;

            do {
                try {
                    System.out.print("Ingrese N° Dasu (Si no esta afiliado, ingrese 0): ");
                    universidad[i].dasu = scanner.nextInt();
                    System.out.println();

                    if (universidad[1].legajo < 0) {
                        throw new IllegalArgumentException ("El numero no puede ser negativo.");
                    }
                
                    valido = true;

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());

                } catch (Exception e) {
                    System.out.println("Ingrese un número entero");
                }
            } while (!valido);
            
            if (universidad[i].dasu == 0) {
                cant_no_afiliados++;
            }

            if (i < max) {
                System.out.println("Ingresar mas datos? < S/N >");
                do {
                    rta = scanner.next().charAt(0); 
                } while (rta != 'S' && rta != 'N');

                if (rta == 'S') {
                    i++;
                }

            } else {
                rta = 'N';
                System.out.println("Tope de ingresos alcanzado.");
            }
            
        }while (rta != 'N' && i < max);

        dim = i;
        }

        public static void clasificar_info(){
            dim2 = 0;
            dim3 = 0;

            for (int j = 0, i < dim, j++) {
                System.out.println("keke");
            }
        }
    /*
    * ==========
    * == MAIN ==
    * ==========
     */
    public static void main(String[] args) {
        leer_datos();
    }
}

    
