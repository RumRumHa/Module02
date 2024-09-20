package bt.BT7;

import java.util.Scanner;

public class StudentManagement {
    private static Student[] students = new Student[100];
    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------------------Menu------------------");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Update thông tin sinh viên theo Id");
            System.out.println("4. Xóa sinh viên theo Id");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    displayStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.err.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }

    private static void displayStudents() {
        if (count == 0) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (int i = 0; i < count; i++) {
                students[i].displayData();
            }
        }
    }

    private static void addStudent() {
        if (count < students.length) {
            Student newStudent = new Student();
            newStudent.inputData();
            students[count] = newStudent;
            count++;
            System.out.println("Đã thêm sinh viên.");
        } else {
            System.out.println("Danh sách đã đầy, không thể thêm sinh viên.");
        }
    }

    private static void updateStudent() {
        System.out.print("Nhập mã sinh viên cần cập nhật: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId() == id) {
                System.out.println("Cập nhật thông tin sinh viên:");
                students[i].inputData();
                found = true;
                System.out.println("Đã cập nhật thông tin.");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với mã ID: " + id);
        }
    }

    private static void deleteStudent() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId() == id) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                found = true;
                System.out.println("Đã xóa sinh viên.");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với mã ID: " + id);
        }
    }
}
