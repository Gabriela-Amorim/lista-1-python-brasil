import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário por hora:");
        double salarioHora = sc.nextDouble();

        System.out.println("Informe as horas trabalhadas por mês: ");
        double horasMes = sc.nextDouble();

        double salarioBruto = salarioHora * horasMes;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
        double descontos = salarioBruto - salarioLiquido;

        System.out.println("O salário bruto é: " + salarioBruto);
        System.out.println("O valor pago ai INSS é: " + inss);
        System.out.println("O valor pago ao sindicato é: " + sindicato);
        System.out.println("O salario liquido é: " + salarioLiquido);
        System.out.println("O desconto total é: " + descontos);

        sc.close();

    }
}