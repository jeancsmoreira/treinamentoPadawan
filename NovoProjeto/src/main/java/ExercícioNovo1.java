import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercícioNovo1 {

    public static void main(String[] args) {

        List<String> listaDeNomes = new ArrayList<String>();
        List<Float> comissoesDosVendedores = new ArrayList<Float>();
        Scanner scanner = new Scanner(System.in);
        String nome = " ";
        Float comissao = 0.0f;

        boolean DesejaInformarVendedor = false;

        System.out.println("Seja Bem vindo ao Sistema de Cadastros");


        System.out.println("Digite o nome do Vendedor:");
        nome = scanner.nextLine();
        listaDeNomes.add(nome);

        System.out.println("Digite o valor da sua comissão: ");
        comissao = scanner.nextFloat();
        comissoesDosVendedores.add(comissao);

        System.out.println("Deseja informar a comissão de outro Vendedor? (S/N)");

        DesejaInformarVendedor = true;


    }





}
