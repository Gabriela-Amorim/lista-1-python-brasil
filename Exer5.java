import java.util.Scanner;

public class Exer5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o metro: ");
        double metro = sc.nextDouble();

        double centimetro = metro * 100;
        System.out.println(centimetro + " centimetros");

        sc.close();

    }
}