package Exercicio_06;

import java.util.Scanner;

public class SistemaLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== LOJA JAVA ===");
        System.out.print("Nome do cliente: ");
        String cliente = sc.nextLine();
        System.out.print("Nome do produto: ");
        String produto = sc.nextLine();
        System.out.print("Preço unitário: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        double subtotal = preco * quantidade;
        double desconto = 0;
        if (subtotal >= 200) {
            desconto = subtotal * 0.10;
        }
        double total = subtotal - desconto;

        System.out.println();
        System.out.println("=== RECIBO ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total: R$ " + total);
        sc.close();
    }
}
