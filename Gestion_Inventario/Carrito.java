import java.util.Map;


/**
 * Nombre del archivo: Carrito.java
 * 
 * El Objetivo de la creación de esta clase es utilizarla para crear un pequeño simulador de inventario y carrito de compras,
 * la clase Carrito se compone del nombre del cliente (dueño del carrito), lista de productos, cantidad de artículos en la lista
 * y por último el monto total del carrito de compras para que el usuario visualice el total a pagar por sus productos.
 *
 * @author Sergio CE
 * @version v0.1.0
 * @since OpenJDK 17.0.15 (2025-04-15)
 */

public class Carrito {
    private String nombreCliente;
    //ArrayList<Producto> articulos;
    private Map<Producto, Integer> articulos;
    private int cantidadArticulos;
    private double montoCarrito;


  // ---- Constructor de la clase Carrito_compra ----
    /*
   * Como un carrito de compras se genera desde antes de agregar productos a este
   * se toman como valores iniciales de cantidad de articulos y monto del carrito 0 y 0.0 respectivamente.
   */
    public Carrito(Map<Producto, Integer> articulos, String nombreCliente){
        this.nombreCliente = nombreCliente;
        this.articulos = articulos;
        this.cantidadArticulos = 0;
        this.montoCarrito = 0.0;
    }


    //---- Getters de la clase Carrito_compra ----
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }


    public void setArticulos(Map<Producto, Integer> articulos) {
        this.articulos = articulos;
        calcularMonto();
        //contarArticulos();
    }

    // ---- Getters de la clase Carrito_compra ----
    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public Map<Producto, Integer> getArticulos() {
        return this.articulos;
    }

    public int getCantidadArticulos() {
        return this.cantidadArticulos;
    }

    public double getMontoCarrito() {
        return this.montoCarrito;
    }

    // ---- Métodos específicos de la clase Carrito: ----

    /**
     * Esta función calcula el monto total de los productos de una lista de objetos productos. 
     */
    public void calcularMonto(){
        double total = 0.0;
        for(Map.Entry<Producto, Integer> par: this.articulos.entrySet()){
            Producto producto = par.getKey(); //par.getKey hace referencia al producto.
            total += producto.getPrecio() * par.getValue(); // par.getValue hace referencia al número de piezas.
        }
        this.montoCarrito = total;
    }

    /**
    * Cuenta la cantidad de artículos distintos (ignorando el número de piezas) en un carrito de compras como 
    * información adicional para el cliente.
    */
    public int contarArticulosEnCarrito(){
        return this.articulos.size();
    }

    /**
     * Cuenta la cantidad de artículos totales (incluyendo el número de piezas) en un carrito de compras como
     * información adicional para el cliente. 
     */
    public void actualizarPiezasEnCarrito(){
        int totalArticulos = 0;
        for(Map.Entry<Producto, Integer> par : this.articulos.entrySet()){
            totalArticulos += par.getValue();
        }
        /*
        * Por el momento se retornará la cantidad de artículos totales, 
        * hasta tomar una decisión de diseño sobre si se almacenará como atributo.
        */
        this.cantidadArticulos = totalArticulos;
    }


    /**
     * Agrega un producto al carrito de compras, actualiza la cantidad de artículos y el monto total del carrito.
     */
    public void agregarProducto(Producto nuevoProducto, Integer cantidadPiezas){
        if(articulos.containsKey(nuevoProducto)){
            articulos.put(nuevoProducto, articulos.get(nuevoProducto)+cantidadPiezas);
        }else{
            this.articulos.put(nuevoProducto, cantidadPiezas);
        }
        actualizarPiezasEnCarrito();
        calcularMonto();
    }

    /**
     * Elimina un artículo específico del carrito, actualiza la cantidad de artículos y el monto total del carrito.
     */
    public void eliminarProducto(Producto producto){
        articulos.remove(producto);
        actualizarPiezasEnCarrito();
        calcularMonto();
    }

    /**
     * Método toString utilizado inicialmente para imprimir en consola la información
     * de un carrito de compras en específico. 
     */
    @Override
    public String toString() {
        return "{" +
            " nombreCliente='" + getNombreCliente() + "'" +
            ", articulos='" + getArticulos() + "'" +
            ", cantidadArticulos='" + getCantidadArticulos() + "'" +
            ", montoCarrito='" + getMontoCarrito() + "'" +
            "}";
    }
}
