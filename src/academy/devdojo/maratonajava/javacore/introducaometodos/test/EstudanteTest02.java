package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Estudante;

public class EstudanteTest02 {
    static void main() {
        Estudante estudante01 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';
        estudante01.imprime();
    }
}
