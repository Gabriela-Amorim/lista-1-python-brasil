import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho em metros quadrados da área a ser pintada");
        double area = sc.nextDouble();

        double litros = area / 3.0;
        int latas = (int) Math.ceil(litros / 18.0);
        double precoTotal = latas * 80.0;

        System.out.println("Quantidade de latas de tinta: " + latas);
        System.out.println("Preço total: R$ " + precoTotal);

        sc.close();
    }

}
