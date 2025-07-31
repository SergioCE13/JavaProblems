import java.time.LocalDate;

public class Main {

    public static void main (String[] args){

        //Creamos un objeto Persona únicamente para comporbar que el método calcularEdad da el resultado correcto.
        Persona sergio = new Persona("Sergio","Cruz","Estrada", "CUES970820HMCRSR01", LocalDate.of(1997,8,20));
        System.out.println("La edad de " + sergio.getNombre() + " es : " + sergio.getEdad());

        //Comprobamos que el método toString funcione correctamente.
        System.out.println(sergio.toString());

        //Creamos un objeto Empleado
        Empleado emp1 = new Empleado(sergio, 0105632,13400.00, LocalDate.of(2023,8,12));
        System.out.println(emp1.toString());
    }

}
