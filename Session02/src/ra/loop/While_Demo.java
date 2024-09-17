package ra.loop;

public class While_Demo {
    public static void main(String[] args) {
        // In ra và tính tổng 20 số nguyên chẵn đầu tiên tính từ 1
        // B1: Khai báo biến đếm số nguyên chẵn và tổng các số chẵn
        int cntEven = 0;
        int sumEven = 0;
        // B2: Sử dụng vòng lặp while để in 20 số chẵn đầu tiên và tính tổng
        int number = 1;
        System.out.println("20 số chắn đầu tiên tính từ 1 là: ");
        while (cntEven < 20) {
            if (number % 2 == 0) {
                System.out.printf("%d\t", number);
                cntEven++;
                sumEven += number;
            }
            number++;
        }
        System.out.println("Tổng 20 số chẵn đầu tiên là: " + sumEven);
    }
}
