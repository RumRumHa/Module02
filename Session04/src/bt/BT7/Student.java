package bt.BT7;

import java.util.Scanner;

public class Student {
    /*
    *       Student
    * - Thuộc tính:
    *   + studentId: int
    *   + studentName: String
    *   + sex: boolean
    *   + className: String
    *   + age: int
    *   + address: String
    * - Phương thức:
    *   + Student()
    *   + Student(studentId: int, studentName: String, sex: boolean, className: String, age: int, address: String)
    *   + getStudentId(): int
    *   + setStudentId(studentId: int): void
    *   + getStudentName(): String
    *   + setStudentName(studentName: String): void
    *   + isSex(): boolean
    *   + setSex(sex: boolean): void
    *   + getClassName(): String
    *   + setClassName(className: String): void
    *   + getAge(): int
    *   + setAge(age: int): void
    *   + getAddress(): String
    *   + setAddress(address: String): void
    *   + inputData(): void
    *   + displayData(): void
    * */
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;

    public Student() {
    }

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.studentId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Nhập tên lớp: ");
        this.className = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
    }
    public void displayData() {
        System.out.printf("Mã sinh viên: %d - Tên sinh viên: %s - Giới tính: %s - Tên lớp: %s - Tuổi: %d - Địa chỉ: %s\n", this.studentId, this.studentName, this.sex ? "Nam" : "Nữ", this.className, this.age, this.address);
    }
}
