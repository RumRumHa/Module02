package bt;

public class BT5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i/j) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.printf("%d\t", i);
            }
        }
    }
}
