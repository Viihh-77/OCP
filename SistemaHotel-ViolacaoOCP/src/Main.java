import OCP_VIOLACAO.Pagamento;
import OCP_VIOLACAO.ProcessadorPagamento;
import OCP_VIOLACAO.Pagamento.TipoPagamento;

public class Main {

    public static void main(String[] args) {

        Pagamento pagamento = new Pagamento(
                "1",
                500.0,
                "gabrielli@email.com",
                TipoPagamento.PAYPAL
        );

        ProcessadorPagamento processador = new ProcessadorPagamento();
        processador.processarPagamento(pagamento);
    }
}
