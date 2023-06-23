import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = sc.nextDouble();

        System.err.println("O número informado foi " + numero);

        sc.close();

    }
}