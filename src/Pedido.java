public class Pedido {

    private String id;
    private double valorBruto;
    private int quantidadeItens;
    private boolean isPago;
    private String emailCliente;
    private TipoDesconto tipoDesconto;

    enum TipoDesconto {
        CUOPOM, VIP, SAZONAL, ANIVERSARIO
    }

    public Pedido(String id, double valorBruto, int quantidadeItens, boolean isPago, String emailCliente, TipoDesconto tipoDesconto) {
        this.id = id;
        this.valorBruto = valorBruto;
        this.quantidadeItens = quantidadeItens;
        this.isPago = isPago;
        this.emailCliente = emailCliente;
        this.tipoDesconto = tipoDesconto;
    }

    public Pedido(String id, double valorBruto, int quantidadeItens, String emailCliente, TipoDesconto tipoDesconto) {
        this.id = id;
        this.valorBruto = valorBruto;
        this.quantidadeItens = quantidadeItens;
        this.emailCliente = emailCliente;
        this.tipoDesconto = tipoDesconto;
    }

    public String getId() {
        return id;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public boolean isPago() {
        return isPago;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public TipoDesconto getTipoDesconto() {
        return tipoDesconto;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public void setPago(boolean pago) {
        isPago = pago;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void setTipoDesconto(TipoDesconto tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }
}
