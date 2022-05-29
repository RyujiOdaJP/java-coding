package algorithm;

public class Multiply {
    public void out99Table() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
