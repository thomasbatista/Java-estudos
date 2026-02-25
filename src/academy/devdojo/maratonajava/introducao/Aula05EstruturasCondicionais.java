package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    static void main() {
        int idade = 17;

        if (idade >= 18) {
            System.out.println("Pode comprar bebida");
        } else {
            System.out.println("Não pode comprar bebida");
        }

        double salario = 6000;
        String mensagemDoar = "Eu vou doar pro DevDojo";
        String mensagemNaoDoar = "Não vou doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
