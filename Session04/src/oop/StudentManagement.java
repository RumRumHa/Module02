package oop;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        //Syntax: ClassName objectName = new constructor(arguments)
        //1. Khởi tạo đối tượng sinh viên mà không khởi tạo bất cứ thông tin gì
        Student student1 = new Student();
        //2. Khởi tạo đối tượng sinh viên và khởi tạo mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002", "Nguyễn Văn B");
        //3. Khởi tạo đối tượng sinh viên và khởi tạo tất cả thông tin sinh viên
        Student student3 = new Student("SV003", "Nguyễn Văn C", 25, true, "HCM");
        Student student4 = new Student("SV004", "Nguyễn Văn D", 24, true, "HN");
        //4. Nhập thông tin sinh viên 2 từ bàn phím gồm: Tuổi, giới tính, địa chỉ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên 2: ");
        System.out.println("Nhập tuổi sinh viên: ");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập giới tính sinh viên: ");
        student2.setGender(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập địa chỉ sinh viên: ");
        student2.setAddress(scanner.nextLine());
        //5. Nhập thông tin sinh viên 1
        System.out.println("Nhập thông tin sinh viên 1: ");
        student1.inputData(scanner);
        //6. Tính tuổi trung bình của các sinh viên
        int avgAge = (student1.getAge() + student2.getAge() + student3.getAge()) / 3;

        //In thông tin sinh viên
        System.out.println("Thông tin sinh viên 1: ");
        student1.displayData();
        System.out.println("Thông tin sinh viên 2: ");
        student2.displayData();
        System.out.println("Thông tin sinh viên 3: ");
        student3.displayData();
        System.out.println("Tuổi trung bình của các sinh viên: " + avgAge);

    }
}
