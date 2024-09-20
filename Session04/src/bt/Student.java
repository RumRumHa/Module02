package bt;

import java.util.Scanner;

public class Student {
    /*
    *       Student
    * - Thuộc tính
    *   + studentId: String
    *   + studentName: String
    *   + age: int
    *   + gender: boolean
    *   + address: String
    *   + phone: int
    * - Thuộc tính:
    *   + Student()
    *   + Student(studentId: String, studentName: String, age: int, gender: boolean, address: String, phone: int)
    *   + inputData(): void
    *   + displayData(): void
    * */
    private String studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, boolean gender, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã học sinh: ");
        this.studentId = scanner.nextLine();
        System.out.print("Nhập tên học sinh: ");
        this.studentName = scanner.nextLine();
        System.out.print("Nhập tuổi học sinh: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.phone = scanner.nextLine();
    }
    public void displayData() {
        System.out.printf("Mã học sinh: %s - Tên học sinh: %s - Tuổi: %d - Giới tính: %s - Địa chỉ: %s - Số điện thoại: %s\n", this.studentId, this.studentName, this.age, this.gender ? "Nam" : "Nữ", this.address, this.phone);
    }

    public String getStudentId() {
        return studentId;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;
        int choice;
        do {
            System.out.println("-------------------Menu-------------------");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xóa học sinh dựa vào mã học sinh");
            System.out.println("5. Thoát");
            System.out.println("Vui lòng chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("Danh sách học sinh trống.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            students[i].displayData();
                        }
                    }
                    break;
                case 2:
                    if (count < students.length) {
                        Student newStudent = new Student();
                        newStudent.inputData();
                        students[count] = newStudent;
                        count++;
                        System.out.println("Đã thêm học sinh.");
                    } else {
                        System.out.println("Danh sách đã đầy, không thể thêm học sinh.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã học sinh cần sửa: ");
                    String editId = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getStudentId().equals(editId)) {
                            System.out.println("Sửa thông tin học sinh:");
                            students[i].inputData();
                            found = true;
                            System.out.println("Đã cập nhật thông tin học sinh.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã: " + editId);
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã học sinh cần xóa: ");
                    String deleteId = scanner.nextLine();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getStudentId().equals(deleteId)) {
                            for (int j = i; j < count - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[count - 1] = null;
                            count--;
                            found = true;
                            System.out.println("Đã xóa học sinh.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã: " + deleteId);
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.err.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }
}
