package ra.menu;

import java.util.Scanner;

public class Menu_Demo {
    public static void main(String[] args) {
        // In ra menu và thực hiện các chức năng theo menu
        /*
        *  *********************MENU**********************
        * 1. Phở bò Kobe
        * 2. Phở gà Việt Nam
        * 3. Xôi trứng thịt
        * 4. Bánh mỳ pate
        * 5. Mỳ gói
        * 6. Thoát
        * */
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********************MENU**********************");
            System.out.println("1. Phở bò Kobe");
            System.out.println("2. Phở gà Việt Nam");
            System.out.println("3. Xôi trứng thịt");
            System.out.println("4. Bánh mỳ pate");
            System.out.println("5. Mỳ gói");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn phở bò Kobe");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn phở gà Việt Nam");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn xôi trứng thịt");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn bánh mỳ pate");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn mỳ gói");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn 1 từ đến 6");
                    break;
            }
        } while (true);
    }
}
