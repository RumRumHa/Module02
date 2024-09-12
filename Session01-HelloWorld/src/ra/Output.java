package ra;

public class Output {
    public static void main(String[] args) {
        // 1. In ra câu Rikkei Academy, sau khi in không xuống dòng
        System.out.print("Rikkei Academy ");
        // 2. In ra câu "Xin chào các bạn lớp JV240711
        System.out.println("Xin chào các bạn lớp JV240711");
        // 3. In ra chuỗi có định dạng
        int year = 2024;
        int month = 10;
        int day = 12;
        // 4. In ra ngày theo biến year, month, day
        System.out.println("Ngày hiện tại là: " + day + "/" + month + "/" + year);
        System.out.printf("Ngày hiện tại là: %d/%d/%d", day, month, year);
    }
}
