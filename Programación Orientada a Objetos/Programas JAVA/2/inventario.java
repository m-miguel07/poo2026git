import java.util.ArrayList;
import java.util.Scanner;

public class inventario {
    
    private ArrayList<item> lista_items;

    Scanner teclado = new Scanner(System.in);

    //inicializar objeto 'inventario'
    public inventario() {
        lista_items = new ArrayList<>();
    }

    public void registrar() {

        int codigo_producto = 1;

        do {
            System.out.print("Ingrese el codigo del item (0 Para finalizar): ");
            codigo_producto = teclado.nextInt();
            System.out.println();
            if (codigo_producto != 0) {
                teclado.nextLine();

                System.out.print("Ingrese la descripcion del item: ");
                String descripcion_producto = teclado.next();
                System.out.println();

                System.out.print("Ingrese el stock minimo del item: ");
                float stock_min_producto = teclado.nextFloat();
                System.out.println();

                System.out.print("Ingrese el stock actual del item: ");
                float stock_act_producto = teclado.nextFloat();
                System.out.println();

                System.out.print("Ingrese el precio unitario del item: ");
                float precio_producto = teclado.nextFloat();
                System.out.println();

                item nuevo_item = new item(codigo_producto, descripcion_producto, stock_min_producto, stock_act_producto, precio_producto);

                lista_items.add(nuevo_item);

                System.out.println("< Item registrado con exito >");
            }
        } while (codigo_producto != 0);
            
        System.out.println("< Fin ingreso de item(s) >");
    }

    public void 
}
