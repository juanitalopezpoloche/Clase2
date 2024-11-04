import java.util.Scanner;

public class CalcularMediaAritmettica {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite un número: ");
        float numero1 = scanner.nextFloat();

        System.out.println("\nPor favor digite otro número: ");
        float numero2 = scanner.nextFloat();

        System.out.println("\nPor favor digite otro número: ");
        float numero3 = scanner.nextFloat();

        System.out.println("La media aritmerica de los números digitados "+((numero1+numero2+numero3)/3));
        
        scanner.close();
    }
}
