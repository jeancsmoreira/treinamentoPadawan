import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Seja Bem vindo ao Sistema!!");
        System.out.println(" Digite um número inteiro: ");
        int opcaoDigitada = scanner.nextInt();


        for (int i = 0; i <= opcaoDigitada; i++) {
            System.out.println(" Imprimir: " + i); //Imprimir a variavel (i) porque ela RECEBE a opçao digitada!!!
        }
    }
}
