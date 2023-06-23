import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o peso do peixe: ");
        double peso = sc.nextDouble();

        double excesso = peso - 50;
        double multa = excesso * 4;

        System.out.println("O peixe pesa: " + peso);
        System.out.println("O peso excedente é: " + excesso);
        System.out.println("A multa será: " + multa);

        sc.close();

    }
}