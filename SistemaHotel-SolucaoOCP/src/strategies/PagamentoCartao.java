package strategies;

import domain.MetodoPagamento;

public class PagamentoCartao implements MetodoPagamento {
    @Override
    public double pagar(double valor) {
        System.out.println("Pagamento via Cartão processado.");
        return valor;
    }
}
