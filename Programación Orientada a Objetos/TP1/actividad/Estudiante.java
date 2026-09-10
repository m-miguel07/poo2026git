public class Estudiante {

    //ATRIBUTOS 
        
    public String  nombre;
    public String  apellido;
    public int     nro_legajo;
    public int     anio_ingreso;
    public String  nro_dni;
    public String  correo;
    public String  telefono_contacto;
    public int     materias_aprobadas;
    public Boolean alumno_regular;

    //MÉTODOS (Comportamientos)

    public void inscribir_materia(String str_materia){
        System.out.println("Inscribiendo a " + str_materia + "...");
        System.out.println("Inscripción completada con exito.");
    }

    public void mostrar_info(){
        System.out.println("Estudiante: " + nombre + " " + apellido );
        System.out.println("Año de ingreso: " + anio_ingreso);
        System.out.println("Nro. Legajo: " + nro_legajo);
        System.out.println("Correo electronico: " + correo);
        System.out.println("DNI: " + nro_dni);
        System.out.println("Tel. Contacto: " + telefono_contacto);
        System.out.println("Materias aprobadas: " + materias_aprobadas);
    }

    public Boolean consultar_regularidad(){
        return alumno_regular;
    }
}