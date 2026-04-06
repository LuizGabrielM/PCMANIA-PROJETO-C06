package hardware;

public class MemoriaUSB {

    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNomeUSB() {
        return nome;
    }

    public int getCapacidadeUSB() {
        return capacidade;
    }
}
