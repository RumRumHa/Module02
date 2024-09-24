package ra.entity;

import java.util.Scanner;

import static ra.imp.ProductImp.listProducts;
import static ra.imp.ProductImp.currentIndex;

public class Product {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String description;
    private boolean status;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, int quantity, String description, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.description = description;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void inputData() {
        this.productId = inputProductId();
        this.productName = inputProductName();
        this.importPrice = inputImportPrice();
        this.exportPrice = inputExportPrice();
        this.quantity = inputQuantity();
        this.description = inputDescription();
        this.status = inputStatus();
    }
    public String inputProductId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        do {
            String productId = scanner.nextLine();
            if (productId.length() == 4) {
                boolean isExist = false;
                for (int i = 0; i < currentIndex; i++) {
                    if (productId.equals(listProducts[i].getProductId())) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    return productId;
                } else {
                    System.err.println("Mã sản phẩm đã tồn tại, vui lòng nhập lại.");
                }
            } else {
                System.err.println("Vui lòng nhập đúng 4 ký tự.");
            }
        } while (true);
    }
    public String inputProductName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        do {
            String productName = scanner.nextLine();
            if (productName.length() >= 6 && productName.length() <= 50) {
                boolean isExist = false;
                for (int i = 0; i < currentIndex; i++) {
                    if (productName.equals(listProducts[i].getProductName())) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    return productName;
                } else {
                    System.err.println("Tên sản phẩm đã tồn tại, vui lòng nhập lại.");
                }
            } else {
                System.err.println("Vui lòng nhập tên sản phẩm gồm 6-50 ký tự.");
            }
        } while (true);
    }
    public float inputImportPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá nhập: ");
        do {
            float importPrice = Float.parseFloat(scanner.nextLine());
            if (importPrice > 0) {
                return importPrice;
            } else {
                System.err.println("Vui lòng nhâp giá nhập lớn hơn 0.");
            }
        } while (true);
    }
    public float inputExportPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá xuất: ");
        do {
            float exportPrice = Float.parseFloat(scanner.nextLine());
            if (exportPrice >= importPrice*1.2) {
                return exportPrice;
            } else {
                System.err.println("Vui lòng nhập giá xuất lớn hơn ít nhất 20% giá nhập.");
            }
        } while (true);
    }
    public int inputQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng: ");
        do {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (quantity > 0) {
                return quantity;
            } else {
                System.err.println("Vui lòng nhập số lượng lớn hơn 0.");
            }
        } while (true);
    }
    public String inputDescription() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mô tả: ");
        String description = scanner.nextLine();
        return description;
    }
    public boolean inputStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập trạng thái: ");
        do {
            String status = scanner.nextLine();
            if (status.equals("true") || status.equals("false")) {
                return Boolean.parseBoolean(status);
            } else {
                System.err.println("Vui lòng nhập true hoặc false.");
            }
        } while (true);
    }
    public void displayData() {
        System.out.printf("Mã sản phẩm: %s - Tên sản phẩm: %s - Giá nhập: %f - Giá xuất: %f - Lợi nhuận: %f - Số lượng: %d - Mô tả: %s - Trạng thái: %s\n", this.productId, this.productName, this.importPrice, this.exportPrice, this.profit, this.quantity, this.description, this.status ? "Đang bán" : "Không bán");
    }
    public void calProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }
}
