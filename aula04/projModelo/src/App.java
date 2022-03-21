
import java.util.Scanner;

import modelo.Cliente;
import modelo.Funcionario;
import modelo.Pessoa;
import util.GerenciaPessoa;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GerenciaPessoa pessoas = new GerenciaPessoa();
        int opcao = 0;
        int codigo;
        double salario;
        String nome, telefone, endereco;
        String entradaDigitada;
        Pessoa p;

        while (opcao != 6) {
            System.out.println("1-Novo Cliente");
            System.out.println("2-Novo Funcionario");
            System.out.println("3-Procurar");
            System.out.println("4-Alterar telefone");
            System.out.println("5-Apagar");
            System.out.println("6-Sair");
            System.out.print("Sua opcao: ");
            entradaDigitada = teclado.nextLine();
            opcao = Integer.parseInt(entradaDigitada);

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código:");
                    entradaDigitada = teclado.nextLine();
                    codigo = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o nome:");
                    nome = teclado.nextLine();
                    System.out.println("Digite o telefone:");
                    telefone = teclado.nextLine();
                    System.out.println("Digite o endereço:");
                    endereco = teclado.nextLine();
                    p = new Cliente(codigo, nome, telefone, endereco);
                    pessoas.adicionar(p);
                    break;
                case 2:
                    System.out.println("Digite o código:");
                    entradaDigitada = teclado.nextLine();
                    codigo = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o nome:");
                    nome = teclado.nextLine();
                    System.out.println("Digite o telefone:");
                    telefone = teclado.nextLine();
                    System.out.println("Digite o salario:");
                    entradaDigitada = teclado.nextLine();
                    salario = Double.parseDouble(entradaDigitada);
                    p = new Funcionario(codigo, nome, telefone, salario);
                    pessoas.adicionar(p);
                    break;
                case 3:
                    System.out.println("Digite o código para procurar:");
                    entradaDigitada = teclado.nextLine();
                    codigo = Integer.parseInt(entradaDigitada);
                    System.out.println(pessoas.exibir(codigo));
                    break;
                case 4:
                    System.out.println("Digite o código:");
                    entradaDigitada = teclado.nextLine();
                    codigo = Integer.parseInt(entradaDigitada);
                    System.out.println("Digite o novo telefone:");
                    telefone = teclado.nextLine();
                    boolean alterou = pessoas.alterarTelefone(codigo, telefone);
                    if (alterou) {
                        System.out.println("Telefone alterado");
                    } else {
                        System.out.println("Nao foi possivel alerar o telefone");
                    }
                    break;
                case 5:
                    System.out.println("Digite o codigo a ser removido:");
                    entradaDigitada = teclado.nextLine();
                    codigo = Integer.parseInt(entradaDigitada);
                    boolean removeu = pessoas.remover(codigo);
                    if(removeu) {
                        System.out.println("Removido com sucesso");
                    } else {
                        System.out.println("NÃ£o foi possivel remover");
                    }
                    break;
                case 6:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opçao invalida");
                    break;
            }
        }

        teclado.close();
    }
}
