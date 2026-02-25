package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Professor;

public class ProfessorTest01 {
    static void main() {
        Professor professor = new Professor();

        professor.nome = "Raí Valvano";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
