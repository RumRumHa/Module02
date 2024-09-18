package ra.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Rikkei Academy");
        System.out.println("Chuoi builder la: " + stringBuilder);
        System.out.println("Noi chuoi: " + stringBuilder.append(" - Hoc vien CNTT"));
        System.out.println("Chen chuoi: " + stringBuilder.insert(26,"dao tao "));
        System.out.println("Xoa cac ky tu trong chuoi: " + stringBuilder.delete(0,6));
        System.out.println("Dao nguoc chuoi: " + stringBuilder.reverse());
    }
}
