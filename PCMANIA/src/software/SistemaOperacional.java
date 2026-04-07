package software;

public class SistemaOperacional {

    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNomeSO() {
        return nome;
    }

    public int getTipoSO() {
        return tipo;
    }
}
