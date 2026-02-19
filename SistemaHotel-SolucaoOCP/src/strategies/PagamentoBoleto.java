package strategies;

import domain.MetodoPagamento;

public class PagamentoBoleto implements MetodoPagamento {
    @Override
    public double pagar(double valor) {
        System.out.println("Pagamento via Boleto processado.");
        return valor;
    }
}
