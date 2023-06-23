import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma dos números é: " + soma);

        sc.close();

    }
}