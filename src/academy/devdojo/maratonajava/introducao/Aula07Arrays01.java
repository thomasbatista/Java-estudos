package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    static void main() {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
