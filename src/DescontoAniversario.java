public class DescontoAniversario implements EstrategiaDesconto {

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.80;
    }
}
