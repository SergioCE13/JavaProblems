
/**
 * Nombre del archivo: Producto.java
 * 
 * El Objetivo de la creación de esta clase es utilizarla para crear un pequeño simulador de inventario y carrito de compras,
 * la clase producto se compone de 3 atributos que son: Nombre, Precio y Stock (cantidad de piezas en el inventario).
 *
 * @author Sergio Cruz Estrada
 * @version v0.1.0
 * @since OpenJDK 17.0.15 (2025-04-15)
 */

public class Producto{

    //Declaramos los atributos de la clase Poducto:
    private String nombre;
    private double precio;
    private String departamento;
    private int stock;
    
    // ---- Creamos el constructor de la clase ----
    public Producto(String nombre, double precio, String departamento, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.departamento = departamento;
        this.stock = stock;
    }

    // ---- Creamos los Setters y Getters ----
    //  --- Setters ---
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    // --- Getters ---
    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public int getStock(){
        return this.stock;
    }


    // ---- Creamos el método toString para obtener toda la información del producto ----
    @Override
    public String toString(){
        return "|Nombre: " + getNombre() + "| Precio: $" + getPrecio() + "| Departemento: " + getDepartamento() + "| Stock: " + getStock()+ "|";
    }

    // ---- Métodos de la clase Producto ----
    public boolean isIgual(Producto prod1, Producto prod2){       
        return prod1.getNombre() == prod2.getNombre();
    }

    


}