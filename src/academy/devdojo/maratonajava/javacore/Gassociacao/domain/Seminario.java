package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Seminario {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime() {
        System.out.println("--- Seminário ---");
        System.out.println("Título: " + titulo);
        if (estudantes == null) return;
        for (Estudante estudante : estudantes) {
            System.out.println("Estudante: " + estudante.getNome());
        }
        System.out.println("Local: " + local.getEndereco());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
