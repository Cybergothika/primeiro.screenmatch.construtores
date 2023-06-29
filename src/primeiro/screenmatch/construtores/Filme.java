package primeiro.screenmatch.construtores;

public class Filme extends Título implements Classificável {
    // Pode digitar  qualquer atributo extra que quiser ou se necessário
    private String diretor;
    private int duração;
    public Filme(String nome, int anoDeLancamento, String diretor, int duracao) {
        super(nome, anoDeLancamento);
        this.diretor = diretor;
        this.duração = duracao;

    }
    // Pode adicionar metódos extras se desejar ou se precisar
    //Abaixo, um getter
    public String getDiretor() {
        return diretor;
    }
    public int getDuração() {
        return duração;
    }
    @Override
    public void classificar(int classificação) {
        System.out.println("Classificando o filme com a classificação: " + classificação);
        // Você pode criar operações relacionadas (atualizar abas) que tem haver com classificação aqui abaixo
    }
    public void reproduzir() {
        // Add code to play the movie
        System.out.println("Reproduzindo filme: " + getNome());
    }
    // Pode adicionar comandos Override herdados de outros methodos ou implementar interface

}
