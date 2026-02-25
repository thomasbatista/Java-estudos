package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main() {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10; // 4 bytes
        long numeroGrande = 100000; // 8 bytes
        float salarioFloat = 2500.0F; // 4 bytes
        double salarioDouble = 2000.0; // 8 bytes
        byte idadeByte = 10; //	1 byte
        short idadeShort = 10; // 2 bytes
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit
        char caractere = 'M'; // 2 bytes
        String nome = "Thomas";
        System.out.println("A idade é " + idade);
        System.out.println(nome);
    }
}
