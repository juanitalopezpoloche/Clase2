import java.util.Scanner;

public class ConvertidorTemperatura {
 
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Por favor digite una temperatura en Celsius: ");
        float celsius = scanner.nextFloat();

        float fahrenheit = celsius * 9/5 + 32;
        double kelvin    = celsius + 273.15;


        System.out.println("Temperatura "+celsius+"°C convertida a fahrenheit es: "+fahrenheit);
        System.out.println("Temperatura "+celsius+"°C convertida a kelvin es: "+kelvin);

        scanner.close();

    }

}
