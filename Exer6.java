import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio do circulo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do circulo é: %.2f", area);

        sc.close();

    }
}