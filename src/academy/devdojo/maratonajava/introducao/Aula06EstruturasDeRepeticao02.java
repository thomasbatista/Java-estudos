package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    static void main() {
        //break
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(parcela + " parcelas " + " R$ " + valorParcela);
        }
    }
}
