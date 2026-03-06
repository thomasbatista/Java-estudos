package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    static void main() {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Jogador jogador03 = new Jogador("Cafu");
        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
