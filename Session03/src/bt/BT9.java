package bt;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BT9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String emailRegex = "\\w+@\\w+\\.\\w+";
        String email;
        System.out.println("Nhập vào email: ");
        do {
            email = scanner.nextLine();
            if (Pattern.matches(emailRegex, email)) {
                break;
            } else {
                System.err.println("Email không đúng định dạng, vui lòng nhập lại!");
            }
        } while (true);
        String passwordRegex = "\\S\\w{6,}";
        String password;
        System.out.println("Nhập vào mật khẩu: ");
        do {
            password = scanner.nextLine();
            if (Pattern.matches(passwordRegex, password)) {
                break;
            } else {
                System.err.println("Mật khẩu không đúng định dạng, vui lòng nhập lại!");
            }
        } while (true);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
