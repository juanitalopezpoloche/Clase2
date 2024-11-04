import java.util.Scanner;

public class CalcularAreaPerimetro {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite la longitud del rectangulo: ");
        float longitud = scanner.nextFloat();

        System.out.println("\nPor favor digite el ancho del rectangulo: ");
        float ancho = scanner.nextFloat();

        float area      = longitud * ancho;
        float perimetro = 2 * (longitud + ancho);

        System.out.println("El area del rectanggulo es: "+area+"cm y el area es: "+perimetro+"cm");
    }

}
