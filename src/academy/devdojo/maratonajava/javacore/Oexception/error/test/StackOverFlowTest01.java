package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    static void main() {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
