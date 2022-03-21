import java.util.Scanner;

/*

Escreva um programa que leia um número inteiro digitado pelo usuário e exiba uma sequência de números de 1 até o valor digitado. 

*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;

        System.out.println("Digite o número final:");
        limite = teclado.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.println(i + " ");
        }

        teclado.close();
    }
}
