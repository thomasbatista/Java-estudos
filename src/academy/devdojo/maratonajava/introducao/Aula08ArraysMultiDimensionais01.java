package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultiDimensionais01 {
    static void main() {
        int[][] dias = new int[3][4];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        dias[0][3] = 30;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;
        dias[1][3] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("----------------------------");
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
