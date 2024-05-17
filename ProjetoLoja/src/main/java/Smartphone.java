public class Smartphone extends Produto {
    private int memoriaRAM;
    private int armazenamentoInterno;

    public Smartphone(String marca, String modelo, double preco, String tipoTela, int memoriaRAM, int armazenamentoInterno) {
        super();
    }

    // getters and setters

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamentoInterno() {
        return armazenamentoInterno;
    }

    public void setArmazenamentoInterno(int armazenamentoInterno) {
        this.armazenamentoInterno = armazenamentoInterno;
    }
}
