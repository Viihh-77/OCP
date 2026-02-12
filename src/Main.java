public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido("1", 1000, 5, "cliente@email.com", Pedido.TipoDesconto.ANIVERSARIO);

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        EstrategiaDesconto estrategia = new DescontoAniversario();

        double valorFinal = calculadora.aplicarDesconto(pedido, estrategia);

        System.out.println("Valor com desconto: " + valorFinal);
    }
}
