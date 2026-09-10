// Archivo: PerfilUsuario.java
// Primer borrador de la clase. Funciona, pero no protege nada.

public class PerfilUsuario {

    // Atributos publicos: cualquier parte del programa puede escribir lo que quiera.
    private final String nombreUsuario;
    private String nombreCompleto;
    private String email;
    private int anioNacimiento;

    public PerfilUsuario (String nombreUsuario, String email){
        if (nombreUsuario == "null" || nombreUsuario.isEmpty()) {
            throw new IllegalArgumentException("Nombre de usuario invalido");
        } else {
            this.nombreUsuario = nombreUsuario;
        }
        boolean correoValido = false;
        
        for (char ch : email.toCharArray()) { 
            if (ch == '@') { 
                correoValido = true;
            }
        }

        if (correoValido) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email invalido");
        }
      
    }

    //GETTERS
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    public String getEmail() {
        return this.email;
    }
    public Integer getAnioNacimiento() {
        return this.anioNacimiento;
    }
   
    //SETTERS
    public Boolean setNombreCompleto(String nombreCompleto){
        if (nombreCompleto == "null" | nombreCompleto == " "){
              return false;
        } else {
            this.nombreCompleto = nombreCompleto;
            return true;
        }
    }
    
    public Boolean setEmail(String email){
        
        if (email.contains("@")){
            this.email = email;
            return true;
        } else {
            return false;
        }

    }

    public Boolean setAnioNacimiento(Integer anioNacimiento){
        if (anioNacimiento < 1900 | anioNacimiento > 2026){
            return false;
        } else {
            this.anioNacimiento = anioNacimiento;
            return true;
        }
    }

}
