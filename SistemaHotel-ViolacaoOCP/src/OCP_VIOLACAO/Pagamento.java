package OCP_VIOLACAO;

public class Pagamento {

    private String id;
    private double valor;
    private String emailCliente;
    private TipoPagamento tipoPagamento;

    public enum TipoPagamento {
        CARTAO, PAYPAL, BOLETO
    }

    public Pagamento(String id, double valor, String emailCliente, TipoPagamento tipoPagamento) {
        this.id = id;
        this.valor = valor;
        this.emailCliente = emailCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
