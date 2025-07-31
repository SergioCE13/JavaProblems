    /*
     * En este archivo se presenta el planteamiento y solución de 5 problemas nivel básicos de programación:
     * 1. Clasificador de edades: La función recibe una edad y devuelve un mensaje dependiendo de si se trata de un niño si es menor de 13, un adolecente si tiene entre 13 y 17 y un adulto si es mayor a 18.
     * 2. Calculadora de desuento: La función recibe el precio de un producto y se aplica un 5% de descuento si el producto cuesta menos de $100, 10% si el producto cuesta entre $100 y $500 y 15% si el producto cuesta más de $500
     * 3. Buscador de números primo: La función recibe un número y determina si el número es primo o no
     * 4. Calculadora de años bisiestos: La función recibe un año y determina si es bisiesto en caso de que sea divisible por 4 pero no por 100, excepto si también es divisible entre 400.
     * 5. Simulador de rentabilidad de un producto: La función recibe el precio de venta, el costo de producción y las piezas vendidas, calula la ganancia total (utilidad = (venta - costo) * cantidad), en caso de ser positiva el producto es rentable, si es 0 esta en el punto de equilibrio, si es negativa es una pérdida.
     */

public class Problemario1 {
    public static void main(String[] args) {
        calcularRentabilidad(10,18,100);
    }

    public static void calcularEdad(int edad){
        if(edad<=13)
            System.out.println("La persona es un niño");
        if(edad > 13 && edad <= 17)
            System.out.println("La persona es un adolecente");
        if(edad >= 18)
            System.out.println("La persona es un adulto");
    }

    public static void calcularDescuento(double precio){
        if(precio < 100)
            System.out.println("El precio final es de : " + precio * 0.95);
        if(precio >= 100 && precio <= 500)
            System.out.println("El precio final es de : " + precio * 0.9);
        if(precio>500)
            System.out.println("El precio final es de :" + precio*0.85);
    }

    public static void numeroPrimo(int numero){
        boolean primo = true;
        for(int i = 1; i<numero; i++){
            if( i != 1 && numero%i == 0)
                primo = false;
        }
        System.out.println("El numero " + (primo ? "es primo":"no es primo"));
    }

    public static void calcularBisiesto(int anyo){
        if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    public static void calcularRentabilidad(double precioVenta, double costoProducto, int piezasVendidas){
        double rentabilidad = (precioVenta-costoProducto) * piezasVendidas;
        System.out.print("Las ganancias son de: " + (precioVenta-costoProducto) * piezasVendidas);
        System.out.println(", el producto " + (rentabilidad >= 0 ? "es rentable.": "no es rentable."));
    }
}
