public class App {
    public static void main(String[] args){
        Personaje personaje = new Personaje("name",100);

        personaje.set_vida(100);

        System.out.println("Vida: " + personaje.get_vida());
    }
}