package primeiro.screenmatch.construtores;

public class Série extends Título {
    // Adicionar atributos especificos se quiser/precisar extender
    private int númeroTemporadas;

    public Série(String nome, int anoDeLancamento, int númeroTemporadas) {
        super(nome, anoDeLancamento);
        this.númeroTemporadas = númeroTemporadas;
    }
    // Lembre das regras; Passei por um erro de stack overflow porque esqueci de por númeroTemporadas em baixo capslock.
    public int getNúmeroTemporadas() {
        return númeroTemporadas;
    }
    public void reproduzir() {
        System.out.println("Reproduzindo a série: " + getNome());
        System.out.println("Número de temporadas: " + númeroTemporadas);
    }

    // Adicionar metódos aqui caso quiser ou precisar
}