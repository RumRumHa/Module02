package bt;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng a: ");
        int nA = Integer.parseInt(scanner.nextLine());
        int[] a = new int[nA];
        System.out.print("Nhập độ dài mảng b: ");
        int nB = Integer.parseInt(scanner.nextLine());
        int[] b = new int[nB];
        System.out.println("Nhập các phần tử mảng a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập các phần tử mảng b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("b[%d]= ", i);
            b[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        System.out.println("Mảng c sau khi gộp là: ");
        for (int i = 0; i < c.length; i++) {
            System.out.printf("%d\t", c[i]);
        }
        System.out.printf("\n");
    }
}
