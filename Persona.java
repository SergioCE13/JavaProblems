import java.time.LocalDate;
import java.time.Period;

public class Persona {
    // ---- Atributos de la clase Persona ----
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String curp;

    private int edad;

    private LocalDate fechaNacimiento;


    // ---- Constructores de la clase Persona ----
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(fechaNacimiento);
    }

    public Persona(String nombre, String apellidoPaterno, String curp, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
    }


    // ---- Setters de todos los atributos de la clase Persona ----
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setCurp(String curp){
        this.curp = curp;
    }

    public void setFechaNacimiento (LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }


    // ---- Getters de todos los atributos de la clase Persona ----
    public String getNombre(){
        return this.nombre;
    }

    public String getApellidoPaterno(){
        return this.apellidoPaterno;
    }

    public String getApellidoMaterno(){
        return this.apellidoMaterno;
    }

    public String getCurp(){
        return this.curp;
    }

    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public int getEdad(){
        return this.edad;
    }

    // ---- Métodos de la clase persona ----
    private int calcularEdad(LocalDate fechaNacimiento){
        LocalDate fecha = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fecha);
        return periodo.getYears();
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellidoPaterno='" + getApellidoPaterno() + "'" +
            ", apellidoMaterno='" + getApellidoMaterno() + "'" +
            ", curp='" + getCurp() + "'" +
            ", edad='" + getEdad() + "'" +
            ", fechaNacimiento='" + getFechaNacimiento() + "'" +
            "}";
    }

}
