package ra.run;

import ra.entity.Book;

import java.util.Scanner;

public class BookImp {
    public static Book[] listBooks = new Book[100];
    public static int currentIndex = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookImp bookImp = new BookImp();
        int choice;
        do {
            System.out.println("-------------------Menu-------------------");
            System.out.println("1. Nhập thông tin n sách");
            System.out.println("2. Tính lợi nhuận các sách ");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách");
            System.out.println("7. Thống kê số lượng sách theo năm xuất bản ");
            System.out.println("8. Thống kê số lượng sách theo tác giả ");
            System.out.println("9. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bookImp.inputListBooks();
                    break;
                case 2:
                    bookImp.calInterests();
                    break;
                case 3:
                    bookImp.displayListBooks();
                    break;
                case 4:
                    bookImp.sortByExportPriceASC();
                    break;
                case 5:
                    bookImp.sortByInterestDESC();
                    break;
                case 6:
                    bookImp.searchBookByName();
                    break;
                case 7:
                    bookImp.countBooksByYear();
                    break;
                case 8:
                    bookImp.countBooksByAuthor();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-9.");
            }
        } while (choice != 9);
    }
    public void inputListBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin n sách: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            listBooks[currentIndex] = new Book();
            listBooks[currentIndex].inputData();
            currentIndex++;
        }
    }
    public void calInterests() {
        if (currentIndex == 0) {
            System.out.println("Danh sách của sách trống.");
        } else {
            for (int i = 0; i < currentIndex; i++) {
                listBooks[i].calInterest();
            }
            System.out.println("Đã tính lợi nhuận cho tất cả sách.");
        }
    }
    public void displayListBooks() {
        if (currentIndex == 0) {
            System.out.println("Danh sách của sách trống.");
        } else {
            for (int i = 0; i < currentIndex; i++) {
                listBooks[i].displayData();
            }
        }
    }
    public void sortByExportPriceASC() {
        for (int i = 0; i < currentIndex-1; i++) {
            for (int j = i+1; j < currentIndex; j++) {
                if (listBooks[i].getExportPrice() > listBooks[j].getExportPrice()) {
                    Book temp = listBooks[i];
                    listBooks[i] = listBooks[j];
                    listBooks[j] = temp;
                }
            }
        }
        displayListBooks();
    }
    public void sortByInterestDESC() {
        for (int i = 0; i < currentIndex-1; i++) {
            for (int j = i+1; j < currentIndex; j++) {
                if (listBooks[i].getInterest() < listBooks[j].getInterest()) {
                    Book temp = listBooks[i];
                    listBooks[i] = listBooks[j];
                    listBooks[j] = temp;
                }
            }
        }
        displayListBooks();
    }
    public void searchBookByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sách cần tìm: ");
        String valueSearch = scanner.nextLine();
        int cntBook = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (listBooks[i].getBookName().toLowerCase().contains(valueSearch.toLowerCase())) {
                listBooks[i].displayData();
                cntBook++;
            }
        }
        System.out.printf("Có %d sách phù hợp với yêu cầu tìm kiếm\n", cntBook);
    }
    public void countBooksByYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm xuất bản cần thống kê: ");
        int year = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (listBooks[i].getYear() == year) {
                count++;
            }
        }
        System.out.println("Số lượng sách xuất bản năm " + year + ": " + count);
    }
    public void countBooksByAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên tác giả cần thống kê: ");
        String author = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (listBooks[i].getAuthor().toLowerCase().contains(author.toLowerCase())) {
                count++;
            }
        }
        System.out.println("Số lượng sách của tác giả " + author + ": " + count);
    }
}
