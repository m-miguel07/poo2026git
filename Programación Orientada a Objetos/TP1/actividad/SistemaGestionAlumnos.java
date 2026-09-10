public class SistemaGestionAlumnos {
    public static void main (String[] args){
        //1. CREACIÓN DE OBJETO
        Estudiante estudiante_1 = new Estudiante();

        //2. ASIGNACIÓN DE VALORES
        estudiante_1.nombre             = "Juan";
        estudiante_1.apellido           = "Garcia";
        estudiante_1.nro_legajo         = 54634;
        estudiante_1.anio_ingreso       = 2016;
        estudiante_1.nro_dni            = "37.488.094";
        estudiante_1.correo             = "garciajuan02@gmail.com";
        estudiante_1.telefono_contacto  = "+54 9 297-213-555";
        estudiante_1.materias_aprobadas = 15;
        estudiante_1.alumno_regular     = false; 

        //3. CREACIÓN DE OBJETO 
        Estudiante estudiante_2 = new Estudiante();

        //4. ASIGNACIÓN DE VALORES
        estudiante_2.nombre             = "Carla";
        estudiante_2.apellido           = "Gutierrez";
        estudiante_2.nro_legajo         =  43213;
        estudiante_2.anio_ingreso       =  2020;
        estudiante_2.nro_dni            = "42.433.198";
        estudiante_2.correo             = "carla_g@hotmail.com";
        estudiante_2.telefono_contacto  = "+54 9 297-444-3254";
        estudiante_2.materias_aprobadas = 9;
        estudiante_2.alumno_regular     = true;

        //5. USO DE OBJETOS
        estudiante_1.mostrar_info();
        System.out.println();

        estudiante_2.mostrar_info();
    }
}