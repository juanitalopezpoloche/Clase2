import java.util.Scanner;
public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Juanita");   
        System.out.println("Como van las cosas");   
        System.out.println(10);
        System.out.println(10.5);   
        System.out.println('A');
        
        System.out.printf("Aqui va una cadena: %s%n", "Juanita");
        System.out.printf("Aqui va un entero: %s%n", 10);
        System.out.printf("Mi nombre es %s y tengo  %d años", "Juanita", 20);
        System.out.println("Mi nombre es "+"Juanita"+" y tengo "+20+" años");

        var entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        var entero = entrada.nextInt();
        System.out.println(entero);

        entrada.close();
    }
}