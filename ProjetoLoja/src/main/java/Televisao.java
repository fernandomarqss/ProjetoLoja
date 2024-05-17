public class Televisao extends Produto {
    private double tamanhoTela;

    public Televisao(String marca, String modelo, double preco, String tipoTela, double tamanhoTela) {
        super();
    }

    // getters and setters

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
}
