import java.util.Scanner;

/*

A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários. 
Entretanto, o valor máximo da prestação não poderá ultrapassar 30% do salário bruto. 
Faça um programa que leia o salário bruto e o valor da prestação e informe se o empréstimo pode ou não ser concedido.

*/

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, prestacao, limite;

        System.out.println("Digite o valor do salario bruto:");
        salarioBruto = teclado.nextDouble();
        System.out.println("Digite o valor da prestação");
        prestacao = teclado.nextDouble();

        limite = salarioBruto * 0.3;

        if (prestacao <= limite) {
            System.out.println("Emprestimo pode ser feito");
        } else {
            System.out.println("Emprestimo não pode ser feito");
        }

        teclado.close();
    }
}
