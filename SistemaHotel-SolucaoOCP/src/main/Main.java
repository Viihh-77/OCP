package main;

import domain.MetodoPagamento;
import domain.Pagamento;
import services.ProcessadorPagamento;
import strategies.PagamentoBoleto;
import strategies.PagamentoCartao;
import strategies.PagamentoPaypal;
import strategies.PagamentoPix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite o valor do Pagamento: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        MetodoPagamento metodoPagamento = null;

        while (metodoPagamento == null) {
            System.out.println("| CARTAO | PIX | BOLETO | PAYPAL |");
            System.out.println("Escolha  o método de pagamento: ");
            String escolha = scanner.nextLine().toUpperCase();

            switch (escolha) {
                case "CARTAO":
                    metodoPagamento = new PagamentoCartao();
                    break;
                case "PIX" :
                    metodoPagamento = new PagamentoPix();
                    break;
                case "BOLETO":
                    metodoPagamento = new PagamentoBoleto();
                    break;
                case "PAYPAL":
                    metodoPagamento = new PagamentoPaypal();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        Pagamento pagamento = new Pagamento("1", valor, email, metodoPagamento);

        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();
        double  valorFinal = processadorPagamento.processarPagamento(pagamento);

        System.out.println("Pagamento de R$" + valorFinal + " processado com sucesso!");

        scanner.close();
    }
}