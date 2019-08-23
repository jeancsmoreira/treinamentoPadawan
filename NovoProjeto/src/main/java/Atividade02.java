import sun.nio.cs.StreamEncoder;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {

        int y = 0;
        Scanner scanner = new Scanner(System.in);

        while (y == 0) {

            System.out.println("Seja Bem vindo ao Sistema de Login");
            System.out.println("Digite seu nome de Usuário: ");
            String nomeUsuario = scanner.nextLine();

            System.out.println("Digite sua senha de acesso: ");
            String senhaDeAcesso = scanner.nextLine();

            if (nomeUsuario.equalsIgnoreCase("admin") && senhaDeAcesso.equalsIgnoreCase("admin")) {
                System.out.println("Bem Vindo Administrador");
                break;
            } else if (nomeUsuario.equalsIgnoreCase("user") && senhaDeAcesso.equalsIgnoreCase("user")) {
                System.out.println("Bem Vindo Usuário");
                break;
            } else if (nomeUsuario.equalsIgnoreCase("inactive") && senhaDeAcesso.equalsIgnoreCase("inactive")) {
                System.out.println("Seu usuário está inativo");
                break;
            } else {
                System.out.println("Usuário não Encontrado" +
                        "\n Deseja tentar novamente?" +
                        "\n N - Não" + "\n S - Sim");
                String opcaoDigitada = scanner.nextLine();

                if (opcaoDigitada.equalsIgnoreCase("S")) {
                    y = 0;
                }else
                    y = 1;
            }

        }

    }

}