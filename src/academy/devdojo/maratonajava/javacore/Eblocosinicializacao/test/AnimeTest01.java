package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    static void main() {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
