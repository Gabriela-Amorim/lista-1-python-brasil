import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Informe seu genero (F- feminino ou M- masculino)");
        String genero = sc.next();

        if (genero.equalsIgnoreCase("F")) {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f", pesoIdeal);
        }
        if (genero.equalsIgnoreCase("M")) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f", pesoIdeal);
        }

        sc.close();

    }
}
