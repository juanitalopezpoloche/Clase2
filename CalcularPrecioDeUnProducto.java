/* 
 * En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. ¿Crees que es correcto el precio?
 * En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.
 */

public class CalcularPrecioDeUnProducto {
    public static void main(String[] args) {
        double precioPorPorcion = 5.95;
        double gramosPorKilo    = 1000;
        double porcionEnGramos  = 100; 

        double precioPorKiloCalculado = (precioPorPorcion / porcionEnGramos) * gramosPorKilo;

        // Precio proporcionado por el vendedor
        double precioPorKiloVendedor = 29.75;

        // Mostrar resultados
        System.out.println("Precio por kilo calculado: "+precioPorKiloCalculado+" €\n");
        System.out.println("Precio por kilo del vendedor: "+precioPorKiloVendedor+" €");


        if (precioPorKiloCalculado == precioPorKiloVendedor) {
            System.out.println("El precio por kilo es correcto.");
        } else {
            System.out.println("El precio por kilo no es correcto. El precio correcto es: "+precioPorKiloCalculado);
        }
    }
}
