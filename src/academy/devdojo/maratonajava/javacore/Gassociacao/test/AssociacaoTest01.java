package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTest01 {
    static void main() {
        Local local = new Local("Konoha");

        Estudante estudante1 = new Estudante("Thomas", 19);
        Estudante estudante2 = new Estudante("Matheus", 20);
        Estudante estudante3 = new Estudante("João", 21);

        Seminario seminario1 = new Seminario("Apresentação 01");
        Seminario seminario2 = new Seminario("Apresentação 02");

        seminario1.setLocal(local);
        seminario2.setLocal(local);

        estudante1.setSeminario(seminario1);
        estudante2.setSeminario(seminario1);
        estudante3.setSeminario(seminario2);

        seminario1.setEstudantes(new Estudante[]{estudante1, estudante2});
        seminario2.setEstudantes(new Estudante[]{estudante3});

        Professor professor = new Professor("Jiraya", "DevOps");
        professor.setSeminarios(new Seminario[]{seminario1, seminario2});


        professor.imprime();
        seminario1.imprime();
        seminario2.imprime();
    }
}