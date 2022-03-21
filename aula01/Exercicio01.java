import java.util.Scanner;

/*

Faça um programa que leia duas notas de um aluno, calcule e mostre a média aritmética do aluno.

*/

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, media;

		System.out.println("Digite a primeira nota:");
		nota1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota:");
		nota2 = entrada.nextDouble();

		media = (nota1 + nota2) / 2;

		System.out.println("Média = " + media);

		entrada.close();
	}
}
