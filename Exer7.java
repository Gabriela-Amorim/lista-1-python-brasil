import java.util.Scanner;

public class Exer7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio do quadrado: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double dobro = area * area;

        System.out.printf("O dobro da área do quadrado é: %.2f", dobro);

        sc.close();

    }
}