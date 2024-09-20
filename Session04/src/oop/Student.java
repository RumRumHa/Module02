package oop;

import java.util.Scanner;

public class Student {
    /*
    * Xây dựng lớp sinh viên gồm:
    * - Các đặc điểm:
    *   + Mã sinh viên
    *   + Tên sinh viên
    *   + Tuổi
    *   + Giới tính
    *   + Địa chỉ
    * - Các hành vi:
    *   + Chào giảng viên
    *   + Tính tổng 2 số
    *   + Nhập thông tin cho sinh viên
    *   + Hiển thị thông tin sinh viên
    * */
    // 1. Fields/Attributes/Properties: Thể hiện các đặc điểm của đối tượng
    //Syntax: Access Modifier + Datatype + FieldName
    // Attributes: 0 - N
    // Để đảm bảo tính bao đóng trong lập trình hướng đối tượng, các thuộc tính phải được khai báo với bổ từ truy cập là private
    private String studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    // 2. Constructors: Hàm tạo dùng để khởi tạo đối tượng
    //Syntax: Access Modifier (public) + className (parameter)
    //Parameter syntax: Datatype + parameterName
    //Constructors: 0 - N
    //- Constructor Default: không có tham số
    public Student() {

    }
    //- Constructor có 2 tham số dùng để khởi tạo mã sinh viên và tên sinh viên
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    //-Constructor có 5 tham số dùng để khởi tạo đối tượng
    public Student(String studentId, String studentName, int age, boolean gender, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    //3. Methods: Thể hiện các hành vi của đối tượng
    // 3.1 Getter/Setter: dùng để lấy giá trị hoặc gán giá trị vào các thuộc tính của đối tượng - giúp truy cập các thuộc tính từ bên ngoài
    // Lấy thông tin mã sinh viên
    public String getStudentId() {
        return studentId;
    }
    // Gán giá trị cho thuộc tính mã sinh viên
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    //3.2 Methods: Thể hiện hành vi của đối tượng
    //Syntax: Access Modifier + ReturnDatatype + methodName(parameters)
    //-- Hành vi chào giảng viên
    public void helloTeacher(){
        System.out.println("Hello Teacher");
    }
    //-- Hành vi tính tổng 2 số nguyên
    public int addTwoNumber(int firstNumber, int secondNumber) {
        int sumNumbers = firstNumber + secondNumber;
        return sumNumbers;
    }
    //-- Hành vi nhập thông tin sinh viên
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        this.address = scanner.nextLine();
    }
    //-- Hành vi hiển thị thông tin đối tượng
    public void displayData() {
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %s - Địa chỉ: %s\n", this.gender ? "Nam" : "Nữ", this.address);
    }
}
