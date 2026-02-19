package domain;

public class Pagamento {

    private String id;
    private double valor;
    private String emailCliente;
    private MetodoPagamento metodoPagamento;

    public Pagamento(String id, double valor, String emailCliente, MetodoPagamento metodoPagamento) {
        this.id = id;
        this.valor = valor;
        this.emailCliente = emailCliente;
        this.metodoPagamento = metodoPagamento;
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

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
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

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
