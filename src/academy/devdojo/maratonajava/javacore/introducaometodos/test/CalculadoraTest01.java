package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 20);
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
    }
}
