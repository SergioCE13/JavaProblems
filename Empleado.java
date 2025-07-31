import java.time.LocalDate;
import java.time.Period;

public class Empleado extends Persona{

    // Atributos de la clase Empleado.
    private int numeroEmpleado;
    private int antiguedad;

    private double salario;
    private double bonoAntiguedad;

    private LocalDate fechaInicio;


    // ---- Constructores de la clase empleado ----
    public Empleado(Persona persona, int numeroEmpleado, double salario, LocalDate fechaInicio) {
        super(persona.getNombre(), persona.getApellidoPaterno(), persona.getApellidoMaterno(), persona.getCurp(), persona.getFechaNacimiento());
        this.numeroEmpleado = numeroEmpleado;
        this.antiguedad = calcularAntiguedad(fechaInicio);
        this.salario = salario;
        this.bonoAntiguedad = calcularBonoAntiguedad(antiguedad);
        this.fechaInicio = fechaInicio;
    }


    // ---- Setters de la clase Empleado ----
    public void setNumeroEmpleado(int numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public void setFechaInicio(LocalDate fechaInicio){
        this.fechaInicio = fechaInicio;
    }


    // ----Getters de la clase Empleado ----
    public int getNumeroEmpleado(){
        return this.numeroEmpleado;
    }


    public int getAntiguedad() {
        return this.antiguedad;
    }


    public double getSalario() {
        return this.salario;
    }

    public double getBonoAntiguedad(){
        return this.bonoAntiguedad;
    }


    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }


    // ---- Métodos de la clase Empleado ----

    public int calcularAntiguedad(LocalDate fechaInicio){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaInicio, fechaActual);
        return periodo.getYears();
    }

    public double calcularBonoAntiguedad(int antiguedad){
        /* 
        * El bono se calcula a partir de los años de antiguedad del empleado
        * en caso de que sea un nuevo empleado y no tenga años acumulados el bono es de 0
        * en caso de tener de 1 ó 2 años, el bono es del 7.5% y en caso de tener más años en la empresa
        * el bono es de 10%
        */
        double bono = antiguedad == 0 ? 0 : (antiguedad <= 2 ? 0.075 : 0.1) ; 
        return bono;
    }

    @Override
    public String toString() {
        return "{" +
            " numeroEmpleado='" + getNumeroEmpleado() + "'" +
            ", antiguedad='" + getAntiguedad() + "'" +
            ", salario='" + getSalario() + "'" +
            ", fechaInicio='" + getFechaInicio() + "'" +
            "}";
    }
}
