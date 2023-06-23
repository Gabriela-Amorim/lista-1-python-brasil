import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho de um arquivo para download (em MB)");
        double tamanhoArquivo = sc.nextDouble();

        System.out.println("Informe a velocidade de um link de Internet (em Mbps)");
        double velocidadeInternet = sc.nextDouble();

        double velocidadeMBps = velocidadeInternet / 8;
        double tempoDownloadMinutos = (tamanhoArquivo / velocidadeMBps) / 60;

        System.out.println("O tempo aproximado de download é de: " + tempoDownloadMinutos + " minutos.");

        sc.close();

    }
}