import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>(); //Criando uma lista de produtos
        Scanner scanner = new Scanner(System.in);
        int contadorNumeroPrduto = 1; // Tornando o contador automático

        Produto produto1 = new Produto(); // Cadastrando um novo Produto
        produto1.setNomeProduto("Picanha"); //Adicionando um nome ao Produto
        produto1.setNumeroIten(contadorNumeroPrduto);  //Adicionando um id ao produto
        contadorNumeroPrduto = contadorNumeroPrduto + 1; // Fazendo com que o id some mais um a ele.
        listaProdutos.add(produto1); // Adicionando o produto a lista de Produtos criada acima.

        Produto produto2 = new Produto();
        produto2.setNomeProduto("Refrigerante");
        produto2.setNumeroIten(contadorNumeroPrduto);
        contadorNumeroPrduto = contadorNumeroPrduto + 1;
        listaProdutos.add(produto2);

        // Criando o Menu de opções ao Usuário

        System.out.println("O que deseja fazer? ");
        System.out.println("1 - Adicionar Item a Lista de Compra:");
        System.out.println("2 - Remover Item a Lista de Compra:");
        System.out.println("3 - Consultar Itens na Lista de Compra:");
        System.out.println("4 - Sair");
        int opcao = Integer.parseInt(scanner.nextLine()); // Convertendo um int em String (Recebido do usuário)

        if (opcao == 1) {
            System.out.println("Informe o nome do Produto: ");
            String nomeProduto = scanner.nextLine();                     //Recebe os dados do teclado
            Produto produto = new Produto();                             //
            produto.setNomeProduto(nomeProduto);
            produto.setNumeroIten(contadorNumeroPrduto);
            contadorNumeroPrduto = contadorNumeroPrduto + 1;
        }
        if (opcao == 2) {
            System.out.println("Informe o número do Produto: ");
            int numeroProduto = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < listaProdutos.size(); i++) {
                Produto produto = listaProdutos.get(i);
                if (numeroProduto == produto.getNumeroIten()) {
                    listaProdutos.remove(i);
                    break;
                }
            }
        }
        if (opcao == 3) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                System.out.println(listaProdutos.get(i).nomeProduto);
                System.out.println(listaProdutos.get(i).numeroIten);
            }
        }
        if (opcao == 4) {
            System.out.println("Obrigado por usar nosso Sistema!");
        }
    }
}
