package ra.string;

public class StringDemo {
    public static void main(String[] args) {
        //1. Khai báo và khởi tạo chuỗi Literal
        String studentName = "Nguyễn Văn A"; //Immutable - Không thể thay đổi giá trị
        //2. Khai báo và khởi tạo chuỗi từ lớp String
        String address = new String("Hà Nội"); //Mutable - Có thể thay đổi giá trị

        studentName = "Nguyễn Văn B";
        address = "Hồ Chí Minh";
        System.out.println("Họ và tên: " + studentName);
        System.out.println("Địa chỉ: " + address);
        //3. Các phương thức làm việc với String
        // 3.1 So sánh 2 chuỗi
        // -- So sánh với toán tử == : so sánh tuyệt đối - Giá trị và địa chỉ ô nhớ
        String str1 = new String("Rikkei");
        String str2 = new String("Rikkei");
        System.out.println("Kết quả so sánh str1 và str2 với == là: " + (str1 == str2));
        System.out.println("Kết quả so sánh str1 và str2 với equals là: " + (str1.equals(str2)));
        String str3 = "Rikkei Academy";
        String str4 = "Rikkei Academy";
        System.out.println("Kết quả so sánh str3, str4 với == là: " + (str3 == str4));
        System.out.println("Kết quả so sánh str3 và str4 với equals là: " + (str3.equals(str4)));
        // 3.2 int length(): trả về độ dài chuỗi
        System.out.println("Độ dài chuỗi str3 là: " + str3.length());
        // 3.3 char charAt(int index): trả về ký tự tại chỉ số index
        System.out.println("Ký tự có chỉ số 0 trong chuỗi str3 là: " + str3.charAt(0));
        // 3.4 String toUpperCase(String str): viết hoa các ký tự trong chuỗi str
        System.out.println("Viết hoa chuỗi str3: " + str3.toUpperCase());
        System.out.println("Chuỗi str3 sau khi viết hoa: " + str3);
        // 3.5 String toLowerCase(String str): Viết thường các ký tự trong chuỗi str
        System.out.println("Viết thường chuỗi str4: " + str4.toLowerCase());
        System.out.println("Chuỗi str4 sau khi viết thường: " + str4);
        // 3.6 String trim(): cắt khoảng trắng 2 đầu
        String str5 = "     Rikkei Academy  ";
        System.out.println("Cắt khoảng trắng 2 đầu chuỗi str5: " + str5.trim());
        // 3.7 boolean equalsIgnoreCase(String str): So sánh giá trị của 2 chuỗi không phân biệt hoa thường
        String str6 = "rIKKEI aCADEMY";
        System.out.println("Kết quả so sánh str3 và str6 là: " + str3.equalsIgnoreCase(str6));
        // 3.8 int compareTo(String str): so sánh chuỗi và trả về giá trị chênh của 2 chuỗi trong bảng mã ASCCI
        String str7 = "ABCD";
        String str8 = "ABEEE";
        System.out.println("Kết quả so sánh chuỗi str7 và str8 là: " + str7.compareTo(str8));
        // 3.9 boolean str1.contains(String str2): Kiểm tra trong chuỗi str1 có chứa chuỗi str2 không
        System.out.println("Kiểm tra chuỗi Academy có trong chuỗi str3 không: " + str3.contains("Academy"));
        // 3.10 int str1.indexOf(String str2): trả về chỉ số của chuỗi str2 trong chuỗi str1
        System.out.println("Chỉ số chuỗi Academy trong chuỗi str3 là: " + str3.indexOf("Academy"));
        // 3.11 String replace(String oldStr, String newStr): thay thế chuỗi oldStr thành newString
        System.out.println("Thay thế chuỗi Academy trong str3 thành Education: " + str3.replace("Academy", "Education"));
        // 3.12 boolean str1.startsWith(String str2): Kiểm tra chuỗi str1 có phải bắt đầu là chuỗi str2 hay không
        System.out.println("Kiểm tra chuỗi str3 có phải bắt đầu là Rikkei hay không: " + str3.startsWith(str1));
        // 3.13 String[] split(String regex): cắt chuỗi thành các chuỗi không
        String str10 = "Học viện đào tạo CNTT Rikkei Academy";
        String[] arrString = str10.split(" ");
        System.out.println("Các chuỗi con là: ");
        for (String element: arrString) {
            System.out.println(element);
        }
        // 3.14 String substring(int begin): cắt chuỗi từ chỉ số begin đến hết
        System.out.println("Cắt chuỗi str10 từ chỉ số 4: " + str10.substring(4));
        // 3.15 String substring(int begin, int end): Cắt chuỗi từ chỉ số begin đến end-1
        System.out.println("Cắt chuỗi str10 từ chỉ số 4 đến 8: " + str10.substring(4, 8));
    }
}
