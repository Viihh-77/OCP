package main;

import domain.Pagamento;
import services.ProcessadorPagamento;
import strategies.PagamentoPaypal;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamento = new Pagamento(
                "1",
                500.0,
                "gabrielli@gmail.com",
                new PagamentoPaypal()
        );

        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();
        processadorPagamento.processarPagamento(pagamento);
    }
}