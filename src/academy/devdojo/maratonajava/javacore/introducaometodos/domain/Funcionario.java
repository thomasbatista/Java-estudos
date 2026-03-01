package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (double aux : this.salario) {
            System.out.print(aux + " ");
        }
        media();
    }

    public void media() {
        if (salario == null) {
            return;
        }
        double soma = 0, media;
        for (double aux : this.salario) {
            soma += aux;
        }
        media = soma / this.salario.length;
        System.out.println("\nA média dos salários é: " + media);
    }
}
