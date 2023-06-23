import java.util.Scanner;

public class Exer17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho em metros quadrados da área a ser pintada");
        double area = sc.nextDouble();

        double litros = area / 6.0;
        int latas = (int) Math.ceil(litros / 18.0);
        double precoTotalLatas = latas * 80.0;
        int galoes = (int) Math.ceil(litros / 3.6);
        double precoTotalGaloes = galoes * 25.0;

        int latasCombinado = (int) Math.floor(litros / 18.0);
        int galoesCombinado = (int) Math.ceil(galoes / 3.6);
        double precoCombinado = (latasCombinado * 80.0) + (galoesCombinado * 25.0);

        System.out.println("Apenas latas.");
        System.out.println("Quantidade de latas de tinta: " + latas);
        System.out.println("Preço total: R$ " + precoTotalLatas);

        System.out.println("Apenas galões.");
        System.out.println("Quantidade de galões de tinta: " + galoes);
        System.out.println("Preço total: R$ " + precoTotalGaloes);

        System.out.println("Latas e galões.");
        System.out.println("Quantidades de latas de tinta: " + latasCombinado);
        System.out.println("Quantidade de galões de tinta: " + galoesCombinado);
        System.out.println("preço combinado: R$ " + precoCombinado);

        sc.close();

    }
}
