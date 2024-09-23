package ra.entity;

import ra.run.StudentManagement;

import java.util.Scanner;
import java.util.regex.Pattern;

import static ra.run.BookImp.currentIndex;
import static ra.run.BookImp.listBooks;
import static ra.run.StudentManagement.arrStudents;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book() {
    }

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.year = year;
    }
    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
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
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public float getInterest() {
        return interest;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void inputData() {
        this.bookId = inputBookId();
        this.bookName = inputBookName();
        this.importPrice = inputImportPrice();
        this.exportPrice = inputExportPrice();
        this.author = inputAuthor();
        this.year = inputYear();
    }
    public String inputBookId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        do {
            String bookId = scanner.nextLine();
            String bookIdRegex = "B[\\w]{3}";
            if (Pattern.matches(bookIdRegex, bookId)) {
                boolean isExists = false;
                for (int i = 0; i < currentIndex; i++) {
                    if (bookId.equals(listBooks[i].getBookId())) {
                        isExists = true;
                        break;
                    }
                }
                if (!isExists) {
                    return bookId;
                } else {
                    System.err.println("Mã sách đã tồn tại, vui lòng nhập lại.");
                }
            } else {
                System.err.println("Vui lòng nhập đúng 4 ký tự và bắt đầu là ký tự B.");
            }
        } while (true);
    }
    public String inputBookName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        do {
            String bookName = scanner.nextLine();
            if (!bookName.isEmpty()) {
                boolean isExists = false;
                for (int i = 0; i < currentIndex; i++) {
                    if (bookName.equals(listBooks[i].getBookName())) {
                        isExists = true;
                        break;
                    }
                }
                if (isExists) {
                    System.err.println("Tên sách đã tồn tại, vui lòng nhập lại.");
                } else {
                    return bookName;
                }
            } else {
                System.err.println("Vui lòng nhập tên sách.");
            }
        } while (true);
    }
    public float inputImportPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá nhập của sách: ");
        do {
            float importPrice = Float.parseFloat(scanner.nextLine());
            if (importPrice > 0) {
                return importPrice;
            } else {
                System.err.println("Vui lòng nhập giá nhập của sách có giá trị lớn hơn 0.");
            }
        } while (true);
    }
    public float inputExportPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá xuất của sách: ");
        do {
            float exportPrice = Float.parseFloat(scanner.nextLine());
            if (exportPrice > 0 && exportPrice >= importPrice*1.3) {
                return exportPrice;
            } else {
                System.err.println("Giá xuất của sách có giá trị lớn hơn ít nhất 30% so với giá nhập.");
            }
        } while (true);
    }
    public String inputAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        do {
            String author = scanner.nextLine();
            if (author.length() >= 6 && author.length() <= 50) {
                return author;
            } else {
                System.err.println("Vui lòng nhập tên tác giả từ 6-50 ký tự.");
            }
        } while(true);
    }
    public int inputYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm xuất bản: ");
        do {
            int year = Integer.parseInt(scanner.nextLine());
            if (year >= 2000) {
                return year;
            } else {
                System.err.println("Năm xuất bản ít nhất xuất bản sau năm 2000.");
            }
        } while (true);
    }
    public void displayData() {
        System.out.printf("Mã sách: %s - Tên sách: %s - Giá nhập sách: %f - Giá xuất sách: %f - Tác giả: %s - Lợi nhuận: %f - Năm xuất bản: %d\n", this.bookId, this.bookName, this.importPrice, this.exportPrice, this.author, this.interest, this.year);
    }
    public void calInterest() {
        this.interest = exportPrice - importPrice;
    }
}
