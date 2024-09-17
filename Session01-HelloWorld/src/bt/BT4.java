package bt;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm môn Toán: ");
        float math = sc.nextFloat();
        System.out.println("Nhập điểm môn Văn: ");
        float literature = sc.nextFloat();
        System.out.println("Nhập điểm môn Anh: ");
        float english = sc.nextFloat();

        float avgMark = (math + literature + english) / 3;
        System.out.println("Điểm trung bình của 3 môn là: " + avgMark);
        sc.close();
    }
}
