package ra.entity;


import static ra.run.ShopManagement.*;

public class Categories {
    private final int nextId = 1;
    private final int catalogId;
    private String catalogName;
    private String description;
    private boolean catalogStatus;

    public Categories() {
        this.catalogId = catalogCurrentIndex+1;
    }

    public Categories(String catalogName, String description, boolean catalogStatus) {
        this.catalogId = catalogCurrentIndex+1;
        this.catalogName = catalogName;
        this.description = description;
        this.catalogStatus = catalogStatus;
    }
    public int getCatalogId() {
        return catalogId;
    }
    public String getCatalogName() {
        return catalogName;
    }
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCatalogStatus() {
        return catalogStatus;
    }
    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
    public void inputData() {
        this.catalogName = inputCatalogName();
        System.out.println("Nhập mô tả: ");
        this.description = scanner.nextLine();
        this.catalogStatus = inputCatalogStatus();
    }
    public void displayData() {
        System.out.printf("Mã danh mục: %d - Tên danh mục: %s - Mô tả: %s - Trạng thái: %s\n", this.catalogId, this.catalogName, this.description, this.catalogStatus ? "Hoạt động" : "Không hoạt động");
    }
    public String inputCatalogName() {
        System.out.println("Nhập tên danh mục: ");
        do {
            String catalogName = scanner.nextLine();
            if (catalogName.length() <= 50) {
                boolean isExist = false;
                for (int i = 0; i < catalogCurrentIndex; i++) {
                    if (catalogName.equals(arrCategories[i].getCatalogName())) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    return catalogName;
                } else {
                    System.err.println("Tên danh mục đã tồn tại, vui lòng nhập lại.");
                }
            } else {
                System.err.println("Vui lòng nhập không quá 50 ký tự.");
            }
        } while (true);
    }
    public boolean inputCatalogStatus() {
        System.out.print("Nhập trạng thái danh mục: ");
        do {
            String catalogStatus = scanner.nextLine();
            if (catalogStatus.equals("true") || catalogStatus.equals("false")) {
                return Boolean.parseBoolean(catalogStatus);
            } else {
                System.err.println("Vui lòng nhập true hoặc false.");
            }
        } while (true);
    }
}
