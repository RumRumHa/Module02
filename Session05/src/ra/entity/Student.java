package ra.entity;

import java.util.Scanner;
import java.util.regex.Pattern;

import static ra.run.StudentManagement.arrStudents;
import static ra.run.StudentManagement.currentIndex;

public class Student {
    //1. Fields/Attributes/Properties
    private String studentId;
    private String studentName;
    private boolean sex;
    private int age;
    private String className;
    private String address;
    public Student() {

    }

    public Student(String studentId, String studentName, boolean sex, int age, String className, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.age = age;
        this.className = className;
        this.address = address;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData(Scanner scanner) {
        this.studentId = inputStudentId(scanner);
        this.studentName = inputStudentName(scanner);
        this.sex = inputSex(scanner);
        this.className = inputClassName(scanner);
        this.age = inputAge(scanner);
        this.address = inputAddress(scanner);
    }
    public String inputStudentId(Scanner scanner) {
        System.out.print("Student ID: ");
        do {
            String studentId = scanner.nextLine();
            //Validate du lieu dau vao
            String studentIdRegex = "SV[\\w]{3}";
            if (Pattern.matches(studentIdRegex, studentId)) {
                return studentId;
            } else {
                System.err.println("Invalid Student ID, please try again.");
            }
        } while (true);
    }
    public String inputStudentName(Scanner scanner) {
        System.out.print("Student Name: ");
        do {
            String studentName = scanner.nextLine();
            if (studentName.length() >= 6 && studentName.length() <= 50) {
                //Check tru`ng
                boolean isExist = false; //khong trung
                for (int i = 0; i < currentIndex; i++) {
                    if (studentName.equals(arrStudents[i].getStudentName())) {
                        isExist = true;
                        break;
                    }
                }
                if (isExist) {
                    System.err.println("Student Name is already taken, please try again.");
                } else {
                    return studentName;
                }
            } else {
                System.err.println("Invalid Student Name, please try again.");
            }
        } while (true);
    }

    public boolean inputSex(Scanner scanner) {
        System.out.print("Sex: ");
        do {
            String sex = scanner.nextLine();
            if (sex.equals("true") || sex.equals("false")) {
                return Boolean.parseBoolean(sex);
            } else {
                System.err.println("Invalid sex, please try again.");
            }
        } while (true);
    }
    public String inputClassName(Scanner scanner) {
        System.out.print("Class Name: ");
        do {
            String className = scanner.nextLine();
            if (className != null && !className.trim().equals("")) {
                return className;
            } else {
                System.err.println("Invalid className, please try again.");
            }
        } while (true);
    }
    public int inputAge(Scanner scanner) {
        System.out.print("Age: ");
        do {
            int age = Integer.parseInt(scanner.nextLine());
            if (age >= 18) {
                return age;
            } else {
                System.err.println("Invalid age, please try again.");
            }
        } while (true);
    }
    public String inputAddress(Scanner scanner) {
        System.out.print("Address: ");
        do {
            String address = scanner.nextLine();
            if (address != null && !address.trim().equals("")) {
                return address;
            } else {
                System.err.println("Invalid address, please try again.");
            }
        } while (true);
    }
    public void displayData() {
        System.out.printf("Student ID: %s - Student Name: %s - Sex: %s\n", this.studentId, this.studentName, this.sex ? "Male" : "Female");
        System.out.printf("Class name: %s - Age: %d - Address: %s\n", this.className, this.age, this.address);
    }
}
