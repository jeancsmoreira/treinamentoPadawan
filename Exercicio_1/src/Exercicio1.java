import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe sua Primeira nota de prova no Semestre:");
        Float notaProva1 = leitor.nextFloat();

        System.out.println("Informe sua Segunda nota de prova no Semestre:");
        Float notaProva2 = leitor.nextFloat();

        System.out.println("Informe sua Terceira nota de prova do Semestre:");
        Float notaProva3 = leitor.nextFloat();

        Float soma_das_notas = notaProva1+notaProva2+notaProva3;

        System.out.println(" Você obteve um total de pontos de:" + soma_das_notas );

    }
}
