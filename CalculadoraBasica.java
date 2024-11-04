import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite un número: ");
        float numero1 = scanner.nextFloat();

        System.out.println("\nPor favor digite otro número: ");
        float numero2 = scanner.nextFloat();


        System.out.println("\n ------ Operaciones ------ ");
        System.out.println("Suma: "+(numero1 + numero2));
        System.out.println("Resta: "+(numero1 - numero2));
        System.out.println("Multiplicación: "+(numero1 * numero2));
        System.out.println("División: "+(numero1 / numero2));

        scanner.close();

    }
}
