import java.util.Scanner;
public class Atividade4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Float peso;
        Float altura;

        System.out.println("Seja bem vindo ao Sistema para Cálculo de IMC!!");
        System.out.println("Digite seu peso: ");
        peso = scanner.nextFloat();

        System.out.println("Digite sua altura: ");
        altura = scanner.nextFloat();

        Float calculoIMC = (peso / altura);
        double calcFinal = Math.pow(calculoIMC, 2);

        if (calcFinal < 17){
            System.out.println("Você está muito abaixo do peso!");
        } else if (calcFinal < 17 && calcFinal <= 18.49) {
            System.out.println("Você está abaixo do peso");
        } else if (calcFinal >= 18.5 && calcFinal <= 24.99) {
            System.out.println("Você está com o Peso normal");
        } else if (calcFinal >= 25 && calcFinal <= 29.99) {
            System.out.println("Você está acima do Peso");
        } else if (calcFinal >= 30 && calcFinal <= 34.99) {
            System.out.println("Você está em Obesidade grau I");
        } else if (calcFinal >= 35 && calcFinal <= 39.99) {
            System.out.println("Você está em Obesidade grau II");
        } else{
            System.out.println("Você está em Obesidade grau III");
        }
    }
}
