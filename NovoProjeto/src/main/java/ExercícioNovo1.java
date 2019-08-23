import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercícioNovo1 {

    public static void main(String[] args) {

        List<String> listaDeNomes = new ArrayList<String>(); //Lista de Nomes de Vendedores
        List<Float> comissoesDosVendedores = new ArrayList<Float>(); //Lista de comissões dos vendedores
        Scanner scanner = new Scanner(System.in); // Recebe dados do teclado
        String nome = " "; //Variavel para guardar o nome dos vendedores
        Float comissao = 0.0f; // Variavel pra guardar a comissão dos vendedores
        int y = 0;
        Float maiorComissao = 0f;
        Float menorComissao = 0f;
        Float totalComissao = 0.0f;


        while (y == 0) {

            System.out.println("Seja Bem vindo ao Sistema de Cadastros");
            System.out.println("Digite o nome do Vendedor:");
            nome = scanner.nextLine(); // Varivel nome recebe o que o usuário digitar.
            listaDeNomes.add(nome); // Lista de nome adiciona o nome digitado nela.

            System.out.println("Digite o valor da sua comissão: ");
            comissao = scanner.nextFloat();
            totalComissao = totalComissao + comissao;
            comissoesDosVendedores.add(comissao);

            System.out.println("Deseja informar a comissão de outro Vendedor? (S/N)");
            String enter = scanner.nextLine(); //Limpa o que o usuario já digitou.
            String opcaoDigitada = scanner.nextLine(); //Recebe a opção digitada pelo usuario.

            if (opcaoDigitada.equalsIgnoreCase("S")) {
                y = 0;
            }else {
                y = 1;
            }

                if (comissao > maiorComissao){
                    maiorComissao = comissao;
                }
                else {
                    menorComissao = comissao;
                }
        }

        float mediaComissao = totalComissao / listaDeNomes.size();

        System.out.println("A maior comissão foi de: " +maiorComissao);
        System.out.println("A menor comissao foi de: " +menorComissao);
        System.out.println("A média de comissões dos Vendedores foi de: " +mediaComissao);

    }


}
