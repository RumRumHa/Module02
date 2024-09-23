package ra.imp;

import ra.entity.Product;

import java.util.Scanner;

public class ProductImp {
    public static Product[] listProducts = new Product[100];
    public static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductImp productImp = new ProductImp();
        int choice;
        do {
            System.out.println("-------------------Menu-------------------");
            System.out.println("1. Nhập thông tin n sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo giá");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm");
            System.out.println("10. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productImp.inputListProducts();
                    break;
                case 2:
                    productImp.displayListProducts();
                    break;
                case 3:
                    productImp.calProfits();
                    break;
                case 4:
                    productImp.sortProfitDESC();
                    break;
                case 5:
                    productImp.countProductsByExportPrice();
                    break;
                case 6:
                    productImp.searchByProductName();
                    break;
                case 7:
                    productImp.inputQuantityProduct();
                    break;
                case 8:
                    productImp.sellProduct();
                    break;
                case 9:
                    productImp.updateStatus();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-10.");
            }
        } while (true);
    }
    public void inputListProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin n sản phẩm: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            listProducts[currentIndex] = new Product();
            listProducts[currentIndex].inputData();
            currentIndex++;
        }
    }
    public void displayListProducts() {
        if (currentIndex == 0) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (int i = 0; i < currentIndex; i++) {
                listProducts[i].displayData();
            }
        }
    }
    public void calProfits() {
        if (currentIndex == 0) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (int i = 0; i < currentIndex; i++) {
                listProducts[i].calProfit();
            }
            System.out.println("Đã tính lợi nhuận cho tất cả sản phẩm.");
        }
    }
    public void sortProfitDESC() {
        if (currentIndex == 0) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (int i = 0; i < currentIndex-1; i++) {
                for (int j = i+1; j < currentIndex; j++) {
                    if (listProducts[i].getProfit() < listProducts[j].getProfit()) {
                        Product temp = listProducts[i];
                        listProducts[i] = listProducts[j];
                        listProducts[j] = temp;
                    }
                }
            }
            displayListProducts();
        }
    }
    public void countProductsByExportPrice() {
        if (currentIndex == 0) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập khoảng giá bán cần thống kê: ");
            System.out.println("Từ: ");
            float fromPrice = Float.parseFloat(scanner.nextLine());
            System.out.println("Đến: ");
            float toPrice = Float.parseFloat(scanner.nextLine());
            int count = 0;
            for (int i = 0; i < currentIndex; i++) {
                if (listProducts[i].getExportPrice() >= fromPrice && listProducts[i].getExportPrice() <= toPrice) {
                    count++;
                }
            }
            System.out.printf("Số lượng các sản phẩm có giá bán từ %f đến %f là: %d \n", fromPrice, toPrice, count);
        }
    }
    public void searchByProductName() {
        if (currentIndex == 0) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên sản phẩm cần tìm: ");
            String valueSearch = scanner.nextLine();
            int cntProduct = 0;
            for (int i = 0; i < currentIndex; i++) {
                if (listProducts[i].getProductName().toLowerCase().contains(valueSearch.toLowerCase())) {
                    listProducts[i].displayData();
                    cntProduct++;
                }
            }
            System.out.printf("Có %d sản phẩm phù hợp với yêu cầu tìm kiếm\n", cntProduct);
        }
    }
    public void inputQuantityProduct() {
        if (currentIndex == 0) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            Scanner scanner = new Scanner(System.in);
            boolean found = false;
            while (!found) {
                System.out.println("Nhập vào mã sản phẩm cần nhập: ");
                String productId = scanner.nextLine();
                for (int i = 0; i < currentIndex; i++) {
                    if (listProducts[i].getProductId().equalsIgnoreCase(productId)) {
                        System.out.println("Nhập số lượng cần nhập: ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        int newQuantity = listProducts[i].getQuantity() + quantity;
                        listProducts[i].setQuantity(newQuantity);
                        System.out.println("Đã cập nhật số lượng sản phẩm.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.err.println("Mã sản phẩm không tồn tại, vui lòng nhập lại.");
                    System.out.println("Bạn có muốn tiếp tục nhập mã sản phẩm không? (yes/no): ");
                    String response = scanner.nextLine();
                    if (response.equalsIgnoreCase("no")) {
                        System.out.println("Dừng nhập mã sản phẩm.");
                        break;
                    }
                }
            }
        }
    }
    public void sellProduct() {
        if (currentIndex == 0) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            Scanner scanner = new Scanner(System.in);
            boolean found = false;

            while (!found) {
                System.out.println("Nhập vào tên sản phẩm cần bán: ");
                String productName = scanner.nextLine();
                for (int i = 0; i < currentIndex; i++) {
                    if (listProducts[i].getProductName().equalsIgnoreCase(productName)) {
                        found = true;
                        if (!listProducts[i].isStatus()) {
                            System.err.println("Sản phẩm hiện đang không bán.");
                            return;
                        }

                        boolean validQuantity = false;
                        int quantity = 0;

                        while (!validQuantity) {
                            System.out.println("Nhập số lượng sản phẩm cần bán: ");
                            quantity = Integer.parseInt(scanner.nextLine());

                            if (listProducts[i].getQuantity() >= quantity) {
                                validQuantity = true;
                            } else {
                                System.err.println("Số lượng sản phẩm không đủ để bán, vui lòng nhập lại.");
                            }
                        }

                        if (listProducts[i].getQuantity() == quantity) {
                            for (int j = i; j < currentIndex - 1; j++) {
                                listProducts[j] = listProducts[j + 1];
                            }
                            listProducts[currentIndex - 1] = null;
                            currentIndex--;
                            System.out.println("Đã bán hết sản phẩm và xóa khỏi danh sách.");
                        } else {
                            int newQuantity = listProducts[i].getQuantity() - quantity;
                            listProducts[i].setQuantity(newQuantity);
                            System.out.println("Đã cập nhật số lượng sản phẩm.");
                        }
                        break;
                    }
                }

                if (!found) {
                    System.err.println("Tên sản phẩm không tồn tại, vui lòng nhập lại.");
                    System.out.println("Bạn có muốn tiếp tục nhập tên sản phẩm không? (yes/no): ");
                    String response = scanner.nextLine();
                    if (response.equalsIgnoreCase("no")) {
                        System.out.println("Dừng quá trình bán sản phẩm.");
                        break;
                    }
                }
            }
        }
    }

    public void updateStatus() {
        if (currentIndex == 0) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            Scanner scanner = new Scanner(System.in);
            boolean found = false;
            while (!found) {
                System.out.println("Nhập vào mã sản phẩm cần cập nhật trạng thái: ");
                String productId = scanner.nextLine();
                for (int i = 0; i < currentIndex; i++) {
                    if (listProducts[i].getProductId().equalsIgnoreCase(productId)) {
                        boolean newStatus = !listProducts[i].isStatus();
                        listProducts[i].setStatus(newStatus);
                        System.out.println("Đã cập nhật trạng thái sản phẩm.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.err.println("Mã sản phẩm không tồn tại, vui lòng nhập lại.");
                    System.out.println("Bạn có muốn tiếp tục nhập mã sản phẩm không? (yes/no): ");
                    String response = scanner.nextLine();
                    if (response.equalsIgnoreCase("no")) {
                        System.out.println("Dừng quá trình cập nhật trạng thái.");
                        break;
                    }
                }
            }
        }
    }
}
