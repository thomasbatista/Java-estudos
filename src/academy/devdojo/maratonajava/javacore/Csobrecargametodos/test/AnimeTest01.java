package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    static void main() {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Ação");

        anime.imprime();
    }
}
