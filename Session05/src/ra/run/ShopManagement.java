package ra.run;

import ra.entity.Categories;
import ra.entity.Products;

import java.util.Scanner;

public class ShopManagement {
    public static Categories[] arrCategories = new Categories[100];
    public static int catalogCurrentIndex = 0;
    public static Products[] arrProducts = new Products[100];
    public static int productCurrentIndex = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ShopManagement shopManagement = new ShopManagement();
        int choice;
        do {
            System.out.println("******************SHOP MENU*******************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    shopManagement.categoryMenu();
                    break;
                case 2:
                    shopManagement.productMenu();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }
    public void categoryMenu() {
        ShopManagement categoriesMenu = new ShopManagement();
        int choiceCategories;
        do {
            System.out.println("******************CATEGORIES MENU******************");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Thoát");
            System.out.println("Nhập lựa chọn danh mục sản phẩm: ");
            choiceCategories = Integer.parseInt(scanner.nextLine());
            switch (choiceCategories) {
                case 1:
                    categoriesMenu.inputCategories();
                    break;
                case 2:
                    categoriesMenu.displayCategories();
                    break;
                case 3:
                    categoriesMenu.updateCategory();
                    break;
                case 4:
                    categoriesMenu.deleteCategory();
                    break;
                case 5:
                    categoriesMenu.updateStatusCategory();
                    break;
                case 6:
                    return;
                default:
                    System.err.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }
    public void productMenu() {
        ShopManagement productManagement = new ShopManagement();
        int choiceProducts;
        do {
            System.out.println("******************PRODUCT MANAGEMENT******************");
            System.out.println("1. Nhập thông tin các sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp các sản phẩm theo giá");
            System.out.println("4. Cập nhật thông tin sản phẩm theo mã sản phẩm");
            System.out.println("5. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("6. Tìm kiếm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Tìm kiếm sản phẩm trong khoảng giá a – b");
            System.out.println("8. Thoát");
            System.out.println("Nhập lựa chọn sản phẩm: ");
            choiceProducts = Integer.parseInt(scanner.nextLine());
            switch (choiceProducts) {
                case 1:
                    productManagement.inputProducts();
                    break;
                case 2:
                    productManagement.displayProducts();
                    break;
                case 3:
                    productManagement.sortProductsByPrice();
                    break;
                case 4:
                    productManagement.updateProductByProductId();
                    break;
                case 5:
                    productManagement.deleteProductByProductId();
                    break;
                case 6:
                    productManagement.searchProductByProductName();
                    break;
                case 7:
                    productManagement.searchProductByPrice();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }
    public void inputCategories() {
        System.out.print("Nhập số lượng danh mục muốn nhập: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrCategories[catalogCurrentIndex] = new Categories();
            arrCategories[catalogCurrentIndex].inputData();
            catalogCurrentIndex++;
        }
    }
    public void displayCategories() {
        if (catalogCurrentIndex == 0) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (int i = 0; i < catalogCurrentIndex; i++) {
                arrCategories[i].displayData();
            }
        }
    }
    public void updateCategory() {
        boolean isValid = false;
        int catalogIdToUpdate;

        do {
            System.out.print("Nhập mã danh mục cần cập nhật: ");
            catalogIdToUpdate = Integer.parseInt(scanner.nextLine());

            if (catalogIdToUpdate > 0 && catalogIdToUpdate <= catalogCurrentIndex+1 && arrCategories[catalogIdToUpdate - 1] != null) {
                isValid = true;
            } else {
                System.err.println("Mã danh mục không hợp lệ, vui lòng nhập lại.");
            }
        } while (!isValid);

        boolean isExit = true;
        do {
            arrCategories[catalogIdToUpdate-1].displayData();
            System.out.println("1. Cập nhật tên danh mục ");
            System.out.println("2. Cập nhật mô tả ");
            System.out.println("3. Cập nhật trạng thái ");
            System.out.println("4. Quay lại ");
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên danh mục: ");
                    arrCategories[catalogIdToUpdate - 1].setCatalogName(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Nhập mô tả: ");
                    arrCategories[catalogIdToUpdate - 1].setDescription(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Nhập trạng thái (true: hiện, false: ẩn): ");
                    arrCategories[catalogIdToUpdate - 1].setCatalogStatus(Boolean.parseBoolean(scanner.nextLine()));
                    break;
                case 4:
                    isExit = false;
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ");
            }
        } while (isExit);
    }

    public void deleteCategory() {
        System.out.print("Nhập mã danh mục cần xóa: ");
        int catalogId = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < catalogCurrentIndex; i++) {
            if (arrCategories[i].getCatalogId() == catalogId) {
                found = true;
                for (int j = i; j < catalogCurrentIndex - 1; j++) {
                    arrCategories[j] = arrCategories[j + 1];
                }
                arrCategories[catalogCurrentIndex-1] = null;
                catalogCurrentIndex--;
                System.out.println("Xóa danh mục thành công.");
                break;
            }
        }
        if (!found) {
            System.err.println("Mã danh mục không tồn tại.");
        }
    }
    public void updateStatusCategory() {
        boolean found = false;
        while (!found) {
            System.out.print("Nhập mã danh mục cần cập nhật trạng thái: ");
            int catalogId = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < catalogCurrentIndex; i++) {
                if (arrCategories[i].getCatalogId() == catalogId) {
                    boolean newStatus = !arrCategories[i].isCatalogStatus();
                    arrCategories[i].setCatalogStatus(newStatus);
                    System.out.println("Đã cập nhật trạng thái sản phẩm.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.err.println("Mã danh mục không tồn tại, vui lòng nhập lại.");
                System.out.println("Bạn có muốn tiếp tục nhập mã danh mục không? (yes/no): ");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("no")) {
                    System.out.println("Dừng quá trình cập nhật trạng thái.");
                    break;
                }
            }
        }

    }
    public void inputProducts() {

    }
    public void displayProducts() {

    }
    public void sortProductsByPrice() {

    }
    public void updateProductByProductId() {

    }
    public void deleteProductByProductId() {

    }
    public void searchProductByProductName() {

    }
    public void searchProductByPrice() {

    }
}
