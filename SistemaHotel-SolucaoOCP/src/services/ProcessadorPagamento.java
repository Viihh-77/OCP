package services;

import domain.Pagamento;

public class ProcessadorPagamento {
    public double processarPagamento(Pagamento pagamento) {
        return pagamento.getMetodoPagamento().pagar(pagamento.getValor());
    }
}
