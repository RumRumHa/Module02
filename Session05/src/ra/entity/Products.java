package ra.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import static ra.run.ShopManagement.*;

public class Products {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private int catalogId;
    private int productStatus;
    public Products() {

    }

    public Products(String productId, String productName, float price, String description, Date created, int catalogId, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
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
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public int getCatalogId() {
        return catalogId;
    }
    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }
    public int getProductStatus() {
        return productStatus;
    }
    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }
    public void inputData() {
        this.productId = inputProductId();
        this.productName = inputProductName();
        this.price = inputPrice();
        System.out.println("Nhập mô tả: ");
        this.description = scanner.nextLine();
        this.created = inputCreatedDate();
        this.catalogId = inputCatalogId();
        this.productStatus = inputProductStatus();
    }
    public String inputProductId() {
        System.out.println("Nhập mã sản phẩm: ");
        do {
            String productId = scanner.nextLine();
            String productIdRegex = "(C|S|A)\\w{3}";
            if (Pattern.matches(productIdRegex, productId)) {
                boolean isExist = false;
                for (int i = 0; i < productCurrentIndex; i++) {
                    if (productId.equals(arrProducts[i].getProductId())) {
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
                System.err.println("Mã sản phẩm bắt đầu 1 trong 3 ký tự C/S/A + 3 ký tự.");
            }
        } while (true);
    }
    public String inputProductName() {
        System.out.println("Nhập tên sản phẩm: ");
        do {
            String productName = scanner.nextLine();
            if (productName.length() >= 10 && productName.length() <= 50) {
                boolean isExist = false;
                for (int i = 0; i < productCurrentIndex; i++) {
                    if (productName.equals(arrProducts[i].getProductName())) {
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
                System.err.println("Tên sản phẩm phải có từ 10-50 ký tự.");
            }
        } while (true);
    }
    public float inputPrice() {
        System.out.println("Nhập giá sản phẩm");
        do {
            float price = Float.parseFloat(scanner.nextLine());
            if (price > 0) {
                return price;
            } else {
                System.err.println("Vui lòng nhâp giá sản phẩm có giá trị lớn hơn 0.");
            }
        } while (true);
    }
    public Date inputCreatedDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        while (true) {
            System.out.println("Nhập ngày tạo sản phẩm (dd/MM/yyyy): ");
            String dateStr = scanner.nextLine();
            try {
                Date date = dateFormat.parse(dateStr);
                return date;
            } catch (Exception e) {
                System.err.println("Định dạng ngày không hợp lệ, vui lòng nhập lại theo dạng dd/MM/yyyy.");
            }
        }
    }
    public int inputCatalogId() {
        System.out.println("Chọn mã danh mục:");
        for (Categories category : arrCategories) {
            if (category != null) {
                category.displayData();
            }
        }
        while (true) {
            System.out.print("Nhập mã danh mục đã chọn: ");
            int catalogId = Integer.parseInt(scanner.nextLine());
            for (Categories category : arrCategories) {
                if (category != null && category.getCatalogId() == catalogId) {
                    return catalogId;
                }
            }

            System.err.println("Mã danh mục không hợp lệ, vui lòng nhập lại.");
        }
    }
    public int inputProductStatus() {
        System.out.println("Nhập trạng thái sản phẩm: ");
        while (true) {
            try {
                int productStatus = Integer.parseInt(scanner.nextLine());
                switch (productStatus) {
                    case 0:
                        System.out.println("Đang bán");
                        return productStatus;
                    case 1:
                        System.out.println("Hết hàng");
                        return productStatus;
                    case 2:
                        System.out.println("Không bán");
                        return productStatus;
                    default:
                        System.err.println("Vui lòng nhập 0: Đang bán, 1: Hết hàng, 2: Không bán.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập một số nguyên.");
            }
        }
    }
}
