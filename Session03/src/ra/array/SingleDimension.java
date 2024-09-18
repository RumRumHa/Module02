package ra.array;

import java.util.Scanner;

public class SingleDimension {
    public static void main(String[] args) {
        //1. Khai báo và khởi tạo mảng 1 chều
        // 1.1 Khai báo mảng và khởi tạo giá trị các phần tử theo giá trị mặc định của kiểu dữ liệu
        // -- Syntax: Datatype[] arrayName = new Datatype[size]
        // -- Khai báo mảng số nguyên gồm 5 phần tử với giá trị mặc định của các phần tử là 0
        int[] numbers = new int[5];
        System.out.println("Giá trị phần tử có chỉ số 1 là: " + numbers[1]);
        // 1.2 Khai báo mảng và khởi tạo giá trị cho từng phần tử của mảng
        // -- Khai báo mảng số thực gồm 5 phần tử với các giá trị là: -4, 3.5, -6.2, 8, 8.3
        float[] arrFloat = {-4, 3.5F, -6.2F, 8, 8.3F}; //size = 5
        //arrFloat[5] = 10; //Exception: vì chỉ số không tồn tại trong mảng
        //2. Làm việc với mảng 1 chiều - sử dụng 1 vòng lặp để duyệt các phần tử của mảng
        // 2.1 Nhập giá trị các phần t của mảng numbers từ bàn phím
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]=", i);
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //2.2. In ra giá trị các phần tử cuả mảng numbers
        System.out.println("Giá trị các phần trử trong mảng numbers là:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\t", numbers[i]);
        }
        System.out.printf("\n");
        // 2.3 Khai báo và khởi tạo mảng số nguyên gồm 10 phần tử, nhập giá trị các phần tử từ bàn phím
        // 2.4 In giá trị các phần tử chẵn trong mảng và tính tổng các phần tử đó
        int[] numbers2 = new int[10];
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < numbers2.length; i++) {
            System.out.printf("numbers[%d] = ", i);
            numbers2[i] = Integer.parseInt(scanner.nextLine());
            if (numbers2[i] % 2 == 0) {
                sum += numbers2[i];
            }
        }
        for (int element : numbers2) {
            if (element % 2 == 0) {
                sum1 += element;
            }
        }
       // System.out.println(arrEven);
        System.out.println("Tổng các phần tử chẵn trong mảng: " + sum);
        System.out.println("Tổng các phần tử chẵn trong mảng: " + sum1);
    }
}
