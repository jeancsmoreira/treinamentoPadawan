package br.com.frw;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        int y = 0; //Só uma variavel qualquer pra entrar na estrutura de repetição. Recebe Zero.
        int aprovados = 0; //Cria uma varivável com valor atribuido a ela zero
        int recuperacao = 0;
        int reprovados = 0;


        while (y == 0) { //Compara a variavel com o Zero e entra na estrutira de repetição.
            Scanner leitor = new Scanner(System.in);

            System.out.println("Bom dia Aluno, favor informar seu Nome: ");
            String nome = leitor.nextLine();

            System.out.println("Informe sua turma: ");
            String Turma = leitor.nextLine(); //Recebe dados do teclado.

            System.out.println("Informe o total de pontos obtidos com Exercícios no Semestre: ");
            Float notas_exercicios = leitor.nextFloat();

            System.out.println("Informe sua Primeira nota de prova no Semestre:");
            Float notaProva1 = leitor.nextFloat();

            System.out.println("Informe sua Segunda nota de prova no Semestre:");
            Float notaProva2 = leitor.nextFloat();

            System.out.println("Informe sua Terceira nota de prova do Semestre:");
            Float notaProva3 = leitor.nextFloat();

            Float soma_das_notas_Prova = notaProva1 + notaProva2 + notaProva3 * 2;
            Float tot_notas = soma_das_notas_Prova + notas_exercicios;

            if (tot_notas > 100) {
                tot_notas = 100F; // Usar o F no final do número quando a variavel for do tipo Flout.
                System.out.println();
            }

            if (tot_notas > 100) {
                aprovados = ++aprovados; //Pega a variavel criada e vai incrementando a ela a cada cadastro aprovado.
                System.out.println("Status: Aprovado");
            } else if (tot_notas >= 60) {
                System.out.println("Status: Aprovado");
                aprovados = ++aprovados;
            } else if (tot_notas >= 50 && tot_notas < 59) {
                System.out.println("Status: Recuperação Prova  I");
                recuperacao = ++recuperacao;
            } else if (tot_notas >= 40 && tot_notas < 49) {
                System.out.println("Status: Recuperação - Prova II");
                recuperacao = ++recuperacao;
            } else {
                System.out.println("Status: Reprovado");
                reprovados = ++reprovados;
            }

            System.out.println("O seu nome é: " + nome + "\nSua turma é: " + Turma +
                    "\nVocê obteve um total de " + soma_das_notas_Prova + " pontos em provas e " + notas_exercicios +
                    " pontos de exercício." + "\nSua pontuação total no Semestre foi de " + tot_notas + " pontos.");

            String enter = leitor.nextLine(); //Limpa tudo que foi digitado antes da mensagem e se prepara pra receber nova digitacaçao.

            System.out.println("Deseja informar a nota de mais um aluno?" +
                    "\n 1 - Sim" +
                    "\n 2 - Nao");

            Integer OpcaoDigitada = leitor.nextInt(); //Recebe a Opçao digitada 1 OU 2.


            if (OpcaoDigitada != 1) { //Compara a opçao digitada se for 2 finaliza, se for 1, volta ao cadastro.
                y = 1;

            }
        }

        System.out.println("Quantidade de alunos Aprovados: " + aprovados); // Lista na tela todos os aprovados.
        System.out.println("Quantidade de alunos em Recuperação: " + recuperacao);
        System.out.println("Quantidade de alunos Reprovados: " + reprovados);



    }

}

