/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import java.util.Scanner;
import controller.FinTracker;
import model.Transacao;
import exceptions.EntradaInvalidaException;

/**
 *
 * @author Lara
 */
public class Main {
    public static void main (String[] args){
    
        Scanner scanner = new Scanner(System.in);
            
        FinTracker finTracker = new FinTracker();
          int opcao = 0;
          
          while (opcao != 5) {

    System.out.println("==FINTRACK==");
    System.out.println("1. Adicionar transação");
    System.out.println("2. Listar transação");
    System.out.println("3. Mostrar saldo");
    System.out.println("4. Remover transação");
    System.out.println("5. Sair");

    System.out.print("Escolha uma opção: "); 
    opcao = scanner.nextInt();                 
    scanner.nextLine();

    switch (opcao) {
        case 1:
            try {
                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();

                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                if (valor <= 0) {
                    throw new EntradaInvalidaException("O valor deve ser maior que zero!");
                }
                scanner.nextLine();

                System.out.print("Tipo (receita/despesa): ");
                String tipo = scanner.nextLine();

                Transacao transacao = new Transacao(descricao, valor, tipo);
                finTracker.adicionarTransacao(transacao);
                System.out.println("Transação adicionada com sucesso!");

            } catch (EntradaInvalidaException e) {
                System.out.println(e.getMessage());
                System.out.println("Entrada inválida! Digite novamente.");
                scanner.nextLine();
            }
            break;

        case 2:
            finTracker.listarTransacoes();
            break;

        case 3:
            System.out.println("Saldo atual: R$" + finTracker.calcularSaldoTotal());
            break;

        case 4:
            try {
                System.out.print("Digite o índice da transação: ");
                int indice = scanner.nextInt();
                scanner.nextLine(); // ✅ estava faltando isso
                finTracker.removerTransacao(indice);
                System.out.println("Transação removida com sucesso!");
            } catch (Exception e) {
                System.out.println("Índice inválido!");
                scanner.nextLine();
            }
            break; // ✅ estava faltando o break no case 4!

        case 5:
            System.out.println("Encerrando o sistema...");
            break;

        default:
            System.out.println("Opção inválida!");
    }
          }
    }
}
