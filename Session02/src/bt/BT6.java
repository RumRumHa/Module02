package bt;

public class BT6 {
    public static void main(String[] args) {
        int countPrimeNumbers = 0;
        int number = 2;
        System.out.println("20 số nguyên tố đầu tiên là:");
        while (countPrimeNumbers < 20) {
            int count = 0;
            for (int i = 1; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                    if (i != number/i) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.printf("%d\t", number);
                countPrimeNumbers++;
            }
            number++;
        }
    }
}
