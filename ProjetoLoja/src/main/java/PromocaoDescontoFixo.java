public class PromocaoDescontoFixo implements Descontavel {
    private double valorDesconto;

    public PromocaoDescontoFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public void aplicarDesconto(double preco) {
        preco -= valorDesconto;
    }
}
