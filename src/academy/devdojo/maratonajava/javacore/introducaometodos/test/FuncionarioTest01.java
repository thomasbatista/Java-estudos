package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    static void main() {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Dexter");
        funcionario01.setIdade(30);
        funcionario01.setSalario(new double[]{2000, 3000, 4000});
        funcionario01.imprime();
    }
}
