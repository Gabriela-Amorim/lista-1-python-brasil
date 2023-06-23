import java.util.Scanner;

public class Exer9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit: (°F)");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println("A temperatura em Celsius é: " + celsius);

        sc.close();

    }
}