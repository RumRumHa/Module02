package bt;

import java.util.Scanner;

public class Employee {
    /*
    *           Employee
    * - Thuộc tính:
    *   + employeeId: String
    *   + employeeName: String
    *   + age: int
    *   + gen: boolean
    *   + rate: double
    *   + salary: double
    * - Phương thức:
    *   + Employee()
    *   + Employee(employeeId: String, employeeName: String, age: int, gen: boolean, rate: double)
    *   + inputData(): void
    *   + displayData(): void
    *   + calSalary(): void
    * */
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    public Employee() {

    }

    public Employee(String employeeId, String employeeName, int age, boolean gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên: ");
        this.gen = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập hệ số lương: ");
        this.rate = Double.parseDouble(scanner.nextLine());
    }
    public void displayData() {
        System.out.printf("Mã nhân viên: %s - Tên nhân viên: %s - Tuổi: %d - Giới tính: %s\n", this.employeeId, this.employeeName, this.age, this.gen ? "Nam" : "Nữ");
        System.out.printf("Hệ số lương: %f - Lương: %f" , this.rate, this.salary);
    }
    public void calSalary(){
        salary = rate * 1300000;
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputData();
        emp.calSalary();
        emp.displayData();
    }
}
