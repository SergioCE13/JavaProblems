/**
 * Nombre del archivo: Producto.java
 * 
 * El Objetivo de la creación de esta clase es utilizarla para crear un pequeño simulador de inventario y carrito de compras,
 * la clase Producto se compone de 3 atributos que son: Nombre, Precio y Stock (cantidad de piezas en el inventario).
 *
 * @author Sergio CE
 * @version v0.2.0
 * @since OpenJDK 17.0.15 (2025-04-15)
 */

public class Producto{

    //Declaramos los atributos de la clase Poducto:
    private String nombre;
    private double precio;
    private double precioConDescuento;
    private String departamento;
    private int stock;
    
    // ---- Creamos el constructor de la clase ----
    public Producto(String nombre, double precio, String departamento, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.precioConDescuento = precio;
        this.departamento = departamento;
        this.stock = stock;
    }

    // ---- Creamos los Setters y Getters ----
    //  --- Setters ---
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        if(precio > 0){
            this.precio = precio;
            this.precioConDescuento = precio;
        }
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void setStock(int stock){
        if(stock >= 0 )
            this.stock = stock;
    }
    // --- Getters ---
    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precioConDescuento;
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
        return "|Nombre: " + getNombre() + "| Precio: $" + getPrecio() + "| Departamento: " + getDepartamento() + "| Stock: " + getStock()+ "|";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return nombre.equals(producto.nombre);
    }

    @Override
    public int hashCode(){
        return nombre.hashCode();
    }

    // ---- Métodos de la clase Producto ----

    /**
     * Realiza el calculo del precio final de un producto al aplicarle un descuento.
     * @param descuento Indica el porcentaje de descuento que se va aplicar al producto.
     */
    public void aplicarDescuento(double descuento){
        if(descuento >= 0 && descuento <100)
            this.precioConDescuento = this.precio - this.precio*(descuento/100);
    }

    /**
     * Elimina el descuento aplicado a un producto dejando como referencia el precio original.
     */
    public void quitarDescuento(){
        this.precioConDescuento = this.precio;
    }

    /**
     * Realiza el calculo pertinente para saber cuanto ahorra el cliente con el descuento actual 
     * del producto.
     */
    public double calcularAhorro(){
        return this.precio - this.precioConDescuento;
    }
    
    /**
     * Realiza la actualización de la cantidad de piezas en Stock de un producto
     * @param producto Indica el producto del cual se actualizarán las existencias
     */
    public void actualizarStock(int piezasVendidas){
        if(piezasVendidas <= this.stock)
            this.stock = this.stock - piezasVendidas;
    }

    /**
     * Verifica si quedan existencias de un producto específico en el almacen.
     * @return Devuelve true si hay existencias en el almacen, False en caso contrario.
     */
    public boolean productoEnExistencia(){
        return this.stock > 0 ? true : false;
    }

    /*
     * Notas a considerar para actualizaciones futuras:
     * 1. Crear una clase "Descuento" y/o "Inventario" (Falta desarrollar la idea).
     * 2. Considerar utilizar BigDecimal para los precios.
     * 3. Verificar que la implementación de validaciones sea correcta para evitar descuentos, precios, stock, etc. absurdos.
     * 4. Añadir mensajes de error a consola.
     * 5. Implementar manejor de excepciones.
     */
}