package Exercicio_07;

import java.util.Scanner;

public class SistemaVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int totalVendas = 0;
        int totalProdutos = 0;
        double faturamento = 0;
        double totalDescontos = 0;
        double maiorVenda = 0;
        String clienteMaiorVenda = "";

        while (opcao != 2) {
            System.out.println("\n=== SISTEMA DE VENDAS ===");
            System.out.println("1 - Nova venda");
            System.out.println("2 - Encerrar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do cliente: ");
                String cliente = sc.nextLine();
                System.out.print("Nome do produto: ");
                String produto = sc.nextLine();
                System.out.print("Preço unitário: ");
                double preco = sc.nextDouble();
                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();
                System.out.print("Cliente VIP (1-Sim / 2-Não): ");
                int vip = sc.nextInt();

                if (preco <= 0 || quantidade <= 0) {
                    System.out.println("Dados inválidos!");
                    continue;
                }

                double subtotal = preco * quantidade;
                double desconto = 0;
                if (subtotal >= 500) {
                    desconto = subtotal * 0.15;
                } else if (subtotal >= 200) {
                    desconto = subtotal * 0.10;
                } else if (subtotal >= 100) {
                    desconto = subtotal * 0.05;
                }

                double descontoVip = 0;
                if (vip == 1) {
                    descontoVip = subtotal * 0.05;
                }
                double total = subtotal - desconto - descontoVip;

                totalVendas++;
                totalProdutos += quantidade;
                faturamento += total;
                totalDescontos += desconto + descontoVip;

                if (total > maiorVenda) {
                    maiorVenda = total;
                    clienteMaiorVenda = cliente;
                }

                System.out.println("\n===== COMPROVANTE =====");
                System.out.println("Cliente: " + cliente);
                System.out.println("Produto: " + produto);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Subtotal: R$ " + subtotal);
                System.out.println("Desconto: R$ " + desconto);
                System.out.println("Desconto VIP: R$ " + descontoVip);
                System.out.println("Total: R$ " + total);
            } else if (opcao != 2) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("\n===== RELATÓRIO FINAL =====");
        System.out.println("Total de vendas: " + totalVendas);
        System.out.println("Produtos vendidos: " + totalProdutos);
        System.out.println("Faturamento: R$ " + faturamento);
        System.out.println("Descontos: R$ " + totalDescontos);
        System.out.println("Maior venda: R$ " + maiorVenda);
        System.out.println("Cliente: " + clienteMaiorVenda);
        if (totalVendas > 0) {
            double ticketMedio = faturamento / totalVendas;
            System.out.println("Ticket médio: R$ " + ticketMedio);
        }
        sc.close();
    }
}
