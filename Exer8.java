import java.util.Scanner;

public class Exer8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário por hora:");
        double salario = sc.nextDouble();

        System.out.println("Informe as horas trabalhadas por mês: ");
        double horasMes = sc.nextDouble();

        double salarioTotal = salario * horasMes;
        System.out.println("O salário total é: " + salarioTotal);

        sc.close();

    }
}