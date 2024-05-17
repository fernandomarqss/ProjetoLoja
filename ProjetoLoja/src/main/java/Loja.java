import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;
    private List<Descontavel> promocoes;

    public Loja() {
        this.produtos = new ArrayList<>();
        this.promocoes = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }

    public Produto buscarProduto(String modelo) {
        for (Produto produto : produtos) {
            if (produto.getModelo().equals(modelo)) {
                return produto;
            }
        }
        return null;
    }

    public void adicionarPromocao(Descontavel promocao) {
        promocoes.add(promocao);
    }

    public double calcularTotalCompra() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
