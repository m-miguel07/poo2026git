
public class PruebaPerfil {

    public static void main(String[] args) {

        PerfilUsuario valido = new PerfilUsuario("jperez", "jperez@dominio.com");

        System.out.println("Perfil creado: " + valido.getNombreUsuario());

        if (!valido.setEmail("sin-arroba")) {
            System.out.println("Email rechazado, sigue siendo " + valido.getEmail());
        }

        if (valido.setEmail("juan.perez@dominio.com")) {
            System.out.println("Email actualizado a " + valido.getEmail());
        }

        if (!valido.setAnioNacimiento(2050)) {
            System.out.println("Anio de nacimiento rechazado.");
        }

        valido.setAnioNacimiento(1998);
        valido.setNombreCompleto("Juan Perez");
        System.out.println(valido.getNombreCompleto() + ", " + valido.getAnioNacimiento());

        // Y esta creacion tiene que cortar el programa con un mensaje claro.
        PerfilUsuario roto = new PerfilUsuario("", "a@b.com");
        System.out.println("Esta linea no se tendria que ver: " + roto.getNombreUsuario());
        
    }
}
