public class Main{
    public static void main (String[] args){
        //Iterativas

        //Precondicional para

        //for i in 1..9 loop
        //  put(i);
        //end loop;

        for (int i = 1; i <= 9; i++){
            System.out.println(i);
        }

        System.out.println();

        //Precondicional mientras

        //while n <= 9 loop
        //  put(n);
        //  n := integer'succ(n);
        //end loop;
        int n = 1;

        while (n <= 9) {
            System.out.println(n);
            n++;
        }

        //poscondicional repetir
        //loop
        //  put_line(i);
        //  i := integer'succ(i);
        //  exit when i > 9;
        //end loop;

        int k = 1;

        do {
            System.out.println(k);
            k++;
        }  while (k <= 9);
        

        //Condicionales

        //Condicional simple

        //if condicion then 
        //  ...
        //end if;

        boolean condicion = true;

        if (condicion) {
            System.out.println("...");
        }

        //Condicional doble

        //a := 1 
        //if a = 2 then
        //   put_line("Numero 2");
        //else
        //  put_line("...");
        //end if;
            
        int a = 1;

        if (a == 2){
            System.out.println("Numero 2");
        } else {
            System.out.println("...");
        }

        //Selector multiple
        /*
        case nota is 
            when 'A' =>
                put_line("Sobresaliente");

            when 'B' | 'C' | 'D' | 'E' =>
                put_line("Aprobado");

            when 'F' =>
                put_line("Desaprobado");

            when others => null;
        end case;
         */

        char nota = 'A'; 

        switch (nota){
            case 'A':
                System.out.println("Sobresaliente");
                break;
            case 'B','C','D','E':
                System.out.println("Aprobado");
                break;
            case 'F':
                System.out.println("Desaprobado");
                break;
        }
    }
}
