package OCP_VIOLACAO;

public class ProcessadorPagamento {

    public void processarPagamento(Pagamento pagamento) {

        Pagamento.TipoPagamento tipo = pagamento.getTipoPagamento();

        if (tipo == Pagamento.TipoPagamento.CARTAO) {
            System.out.println("Pagamento via Cartão processado.");
        }
        else if (tipo == Pagamento.TipoPagamento.PAYPAL) {
            System.out.println("Pagamento via Paypal processado.");
        }
        else if (tipo == Pagamento.TipoPagamento.BOLETO) {
            System.out.println("Pagamento via Boleto processado.");
        }

        // VIOLAÇÃO:
        // Se quisermos adicionar um novo tipo como PIX,
        // teremos que modificar esta classe:

        /*
        else if (tipo == TipoPagamento.PIX) {
            System.out.println("Pagamento via PIX processado.");
        }
        */

        // Isso viola o OCP porque estamos alterando código existente

    }

}
