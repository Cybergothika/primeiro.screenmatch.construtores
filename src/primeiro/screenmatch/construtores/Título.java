package primeiro.screenmatch.construtores;

public class Título {
    private String nome;
    private int anoDeLançamento;
    public Título(String nome, int anoDeLançamento) {
        this.nome = nome;
        this.anoDeLançamento = anoDeLançamento;
    }
    public String getNome() {
        return nome;
    }
    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }
}
