package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("--- Estudante ---");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(seminario.getTitulo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
