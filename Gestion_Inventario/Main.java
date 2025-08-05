// import java.util.ArrayList;

/**
 * Nombre del archivo: Main.java
 * 
 * El Objetivo de la creación de esta clase es utilizarla para crear un pequeño simulador de inventario y carrito de compras,
 * la clase Main actualmente solo se utiliza como auxiliar para realizar las pruebas necesarias de este proyecto.
 *
 * @author Sergio Cruz Estrada
 * @version v0.1.0
 * @since OpenJDK 17.0.15 (2025-04-15)
 */

public class Main {
    
    public static void main(String[] args) {
        Producto prod = new Producto("Desodorante", 95.00,"Higiene personal", 145);
        Producto prod2 = new Producto("Bloqueador solar", 120,"Higiene Personal", 85);

        System.out.println(prod.toString());
        System.out.println(prod2.toString());

        /*ArrayList<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(prod);
        listaProducto.add(prod2);

        Carrito carro1 = new Carrito(listaProducto, "Sergio Cruz");
        carro1.contarArticulos();
        carro1.calcularMonto();

        System.out.println(carro1); */
    }   
}
