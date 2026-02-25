package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    static void main() {
        // while, do while, for
        int count = 0;
        while(count < 10) {
            System.out.println(++count);
        }

        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        for (int i = 0;i < 10; i++) {
            System.out.println("For " + i);
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
