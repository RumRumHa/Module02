package ra.loop;

public class For_Demo {
    public static void main(String[] args) {
        //1. Tính tổng 10 số tự nhiên đầu tiên
        // B1: Khai báo biến tổng với giá trị khởi tạo là 0
        int sumNumbers = 0;
        // B2: Sử dụng vòng lặp for lặp 10 lần để tính tổng
        for (int i=1; i<=10; i++) {
            sumNumbers += i;
        }
        // B3: In ra tổng
        System.out.println("Tổng 10 số tự nhiên đầu tiên là: " + sumNumbers);

        //2. Sử dụng vòng lặp for tìm điểm trung bình trong khoảng 0-10
        int i = 0, j = 10;
        for (; i<j; i++, j--) {

        }
        System.out.println("Điểm trung bình trong khoảng 0-10 là: " + i);
    }
}
