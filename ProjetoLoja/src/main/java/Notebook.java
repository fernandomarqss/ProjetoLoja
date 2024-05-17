public class Notebook extends Produto {
    private String processador;
    private String sistemaOperacional;

    public Notebook(String marca, String modelo, double preco, String tipoTela, String processador, String sistemaOperacional) {
        super();
    }

    // getters and setters

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
