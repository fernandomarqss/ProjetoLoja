public class PromocaoDescontoPorcentagem implements Descontavel {
    private double porcentagemDesconto;

    public PromocaoDescontoPorcentagem(double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }

    @Override
    public void aplicarDesconto(double preco) {
        double desconto = preco * (porcentagemDesconto / 100);
        preco -= desconto;
    }
}
