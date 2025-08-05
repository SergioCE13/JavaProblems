import java.time.LocalDate;
import java.time.Period;

/**
 * Nombre del archivo: Cliente.java
 * 
 * El Objetivo de la creación de esta clase es utilizarla para crear un pequeño simulador de inventario y carrito de compras,
 * la clase Cliente se compone del nombre completo del cliente, edad, fecha de nacimiento, correo, telefono y fecha de registro.
 *
 * @author Sergio CE
 * @version v0.1.0
 * @since OpenJDK 17.0.15 (2025-04-15)
 */

public class Cliente{
    private String nombreCompleto;
    private byte edad;
    private LocalDate fechaNacimiento;
    private String correo;
    private String telefono;
    //private String dirección; Se implementará en caso de que se decida que el negocio realiza envios.
    // private String claveCliente; Se implementará más adelante un algoritmo para la generación de número de cliente. 
    private LocalDate fechaRegistro;
    // private String tipoCliente;  Se implementará más adelante para realizar algunas operaciones necesarias.
    // private Carrito carritoActual; Se implementará para conocer el carrito que aun no se compra pero se mantiene almacenado.
    // private ArrayList<Carrito> carritosComprados; Se implementará para los carritos que ya se hayan comprado 

    public Cliente (String nombreCompleto, LocalDate fechaNacimiento, String correo, String telefono, LocalDate fechaRegistro){
        this.nombreCompleto = nombreCompleto;
        this.edad = calcularEdad(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaRegistro = LocalDate.now();
    }

    // ---- Métodos Setters de la clase Cliente ----

    public void setNombre(String nombre){
        this.nombreCompleto = nombre;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }


    // ---- Métodos Getters de la clase Cliente ----

    public String getNombre(){
        return this.nombreCompleto;
    }

    public Byte getEdad(){
        return this.edad;
    }

    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public String getCorreo(){
        return this.correo;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public LocalDate getFechaRegistro(){
        return this.fechaRegistro;
    }
    
    // ---- Métodos específicos para la clase Cliente ----

    public byte calcularEdad(LocalDate fechaNacimiento){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return (byte) periodo.getYears();
    }
}
