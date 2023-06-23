import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        sc.close();
    }
}
