import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumero = sc.nextInt();

        System.out.print("Digite o número real: ");
        double numeroReal = sc.nextDouble();

        int produto = (primeiroNumero * 2) * (segundoNumero / 2);
        double soma = (primeiroNumero * 3) + numeroReal;
        double cubo = Math.pow(numeroReal, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + produto);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);
        System.out.println("O terceiro elevado ao cubo é: " + cubo);

        sc.close();
    }
}
