package ra.loop;

public class For_Each_Demo {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7};
        // Tính tổng các phần tử của mảng numbers
        int sumNumbers = 0;
        for (int element : numbers) {
            sumNumbers += element;
        }
        System.out.println("Tong cac phan tu trong mang la: " + sumNumbers);
    }
}
