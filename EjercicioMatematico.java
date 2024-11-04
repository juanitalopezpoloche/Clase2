/*
 * En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.
 * ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
 * Explique por que la otra calculadora genera un resultado diferente.
 *  Respuesta: el resultado es 9. La otra calculadora da un resultado diferente porque la primera operación que hace es multiplicar 2 * 1 = 2 + 2 * 2 = 4 y 2 + 4 = 6 y 6 / 6 es igual a 1
 */

public class EjercicioMatematico {
    public static void main(String[] args) {
        var operacion = 6 / 2 * ( 1 + 2 );
        System.out.println("El resultado de 6 / 2 ( 1 + 2 ) es: " + (operacion)); // Resultado 3
    }
}
