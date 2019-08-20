import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bom dia Aluno, favor informar seu Nome: ");
        String nome = leitor.nextLine();

        System.out.println("Informe sua turma: ");
        String Turma = leitor.nextLine();

        System.out.println("Informe sua Primeira nota de prova no Semestre:");
        Float notaProva1 = leitor.nextFloat();

        System.out.println("Informe sua Segunda nota de prova no Semestre:");
        Float notaProva2 = leitor.nextFloat();

        System.out.println("Informe sua Terceira nota de prova do Semestre:");
        Float notaProva3 = leitor.nextFloat();

        Float soma_das_notas = notaProva1+notaProva2+notaProva3;

        System.out.println(" O seu nome é: " +nome+  "\nSua turma é: " +Turma+
                "\nVocê obteve um total de " + soma_das_notas+ " pontos" );
    }
}
