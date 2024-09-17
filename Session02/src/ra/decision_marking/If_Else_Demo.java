package ra.decision_marking;

import java.util.Scanner;

public class If_Else_Demo {
    public static void main(String[] args) {
        //1. Nhập vào 1 số nguyên, kiểm tra số vừa nhập có phải là số chẵn hay không, nếu là chẵn thì in ra là số chẵn
        /*
        * B1: Đọc và hiểu yêu cầu
        * B2: Phân tích: đầu vào. đầu ra
        * B3: Các giải pháp và lựa chọn giải pháp phù hợp
        * B4: Các bước giải quyết vấn đề
        * B5: Thực hiện code theo các bước đã thiết kế
        * */

        //B1: Nhập 1 số nguyên từ bàn phím
        // 1.1 Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        // 1.2 Thông báo nhập
        System.out.println("Nhập vào một số nguyên: ");
        // 1.3 Nhập số nguyên và lưu vào 1 biến number
        int number = Integer.parseInt(scanner.nextLine());
        //B2: Kiểm tra số nguyên có phải số chẵn hay không --> in ra thông báo
        // 2.1 Sử dụng câu lệnh điều kiện để kiểm tra số chẵn -if
        if (number % 2 == 0) {
            // 2.2 Nếu là số chẵn thì thông báo ra
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
        //2. In ra số dư trong phép chia 3, sử dụng câu lệnh điều kiện if
        if (number % 3 == 0) {
            System.out.println(number + " chia hết cho 3.");
        } else if (number % 3 == 1) {
            System.out.println(number + " chia 3 dư 1.");
        } else {
            System.out.println(number + " chia 3 dư 2.");
        }
        //3. Nhập vào 1 số nguyên từ bàn phím, in ra số dư trong phép chia dư 5
        if (number % 5 == 1) {
            System.out.println(number + " chia 5 dư 1.");
        } else if (number % 5 == 2) {
            System.out.println(number + " chia 5 dư 2.");
        } else if (number % 5 == 3) {
            System.out.println(number + " chia 5 dư 3.");
        } else if (number % 5 == 4) {
            System.out.println(number + " chia 5 dư 4.");
        } else {
            System.out.println(number + " chia hết cho 5.");
        }
    }
}
