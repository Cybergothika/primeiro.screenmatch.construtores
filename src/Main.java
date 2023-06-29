import primeiro.screenmatch.construtores.Filme;
import primeiro.screenmatch.construtores.Série;

public class Main {

    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999, "The Wachowskis", 136);
        Série friends = new Série("Friends", 1994, 10);

        // Access and use the added attributes and methods
        System.out.println("Filme: " + favorito.getNome());
        System.out.println("Diretor: " + favorito.getDiretor());
        System.out.println("Duração: " + favorito.getDuração());

        System.out.println("Série: " + friends.getNome());
        System.out.println("Número de temporadas: " + friends.getNúmeroTemporadas());

        favorito.reproduzir();
        friends.reproduzir();
    }
}
