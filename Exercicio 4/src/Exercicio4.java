import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bom dia Aluno, favor informar seu Nome: ");
        String nome = leitor.nextLine();

        System.out.println("Informe sua turma: ");
        String Turma = leitor.nextLine();

        System.out.println("Informe o total de pontos obtidos com Exercícios no Semestre: ");
        Float notas_exercicios = leitor.nextFloat();

        System.out.println("Informe sua Primeira nota de prova no Semestre:");
        Float notaProva1 = leitor.nextFloat();

        System.out.println("Informe sua Segunda nota de prova no Semestre:");
        Float notaProva2 = leitor.nextFloat();

        System.out.println("Informe sua Terceira nota de prova do Semestre:");
        Float notaProva3 = leitor.nextFloat();

        Float soma_das_notas_Prova = notaProva1+notaProva2+notaProva3*2;
        Float tot_notas = soma_das_notas_Prova+notas_exercicios;

        if (tot_notas > 100) {
            tot_notas = 100F;
            System.out.println();
        }

        System.out.println("O seu nome é: " +nome+  "\nSua turma é: " +Turma+
                "\nVocê obteve um total de " + soma_das_notas_Prova+ " pontos em provas e " +notas_exercicios+
                " pontos de exercício." + "\nSua pontuação total no Semestre foi de " +tot_notas+ " pontos." );

        if (tot_notas >100){
            System.out.println("Status: Aprovado");
        }
        else if (tot_notas >= 60){
            System.out.println("Status: Aprovado");
        } else if (tot_notas >= 50 && tot_notas < 59) {
            System.out.println("Status: Recuperação Prova I");
        } else if (tot_notas >= 40 && tot_notas < 49 ){
            System.out.println("Status: Recuperação - Prova II" );
        } else {
            System.out.println("Status: Reprovado");
        }

       }
    }