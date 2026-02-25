package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main() {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        // && (AND) || (OR)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;
        System.out.println(isDentroDaLei);
    }
}
