public class CalculadoraDesconto {

    public double aplicarDesconto(Pedido pedido, EstrategiaDesconto estrategiaDesconto) {
        return estrategiaDesconto.aplicarDesconto(pedido.getValorBruto());
    }
}
