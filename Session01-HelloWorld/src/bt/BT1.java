package bt;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String yourName = sc.nextLine();
        System.out.printf("Hello: %s", yourName);
        sc.close();
    }
}
