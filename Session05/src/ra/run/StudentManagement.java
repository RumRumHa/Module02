package ra.run;

import ra.entity.Student;

import java.util.Scanner;

public class StudentManagement {
    // Khai bao 1 mang SV de luu tru cac SV
    public static Student[] arrStudents = new Student[100];
    // Khai bao chi so phan tu chua chua du lieu
    public static int currentIndex = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khoi tao doi tuong StudentManagement
        StudentManagement studentManagement = new StudentManagement();
        // In menu va thuc hien cac chuc nang theo menu
        do {
            System.out.println("------------------------Menu------------------------");
            System.out.println("1. List Students");
            System.out.println("2. Add Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Sort Student asc");
            System.out.println("6. Search Student for student id or name");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManagement.displayListStudents();
                    break;
                case 2:
                    studentManagement.inputListStudent(scanner);
                    break;
                case 3:
                    studentManagement.updateStudent(scanner);
                    break;
                case 4:
                    studentManagement.deleteStudent(scanner);
                    break;
                case 5:
                    studentManagement.sortStudentByAgeASC();
                    break;
                case 6:
                    studentManagement.searchStudentByIdOrName(scanner);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Invalid choice");
            }
        } while (true);
    }
    public void displayListStudents() {
        if (currentIndex == 0) {
            System.out.println("No students found");
        } else {
            for (int i = 0; i < currentIndex; i++) {
                arrStudents[i].displayData();
            }
        }
    }
    public void inputListStudent(Scanner scanner) {
        System.out.print("Enter Student number: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            // Khoi tao doi tuong sinh vien tai chi so currentIndex
            arrStudents[currentIndex] = new Student();
            // Nhap du lieu cho doi tuong currentIndex
            arrStudents[currentIndex].inputData(scanner);
            // Tang currentIndex len 1 chi so
            currentIndex++;
        }
    }
    public void updateStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentIdUpdate = scanner.nextLine();
        int indexUpdate = getIndexById(studentIdUpdate);
        if (indexUpdate >= 0) {
            // Ton tai ma sinh vien -> cap nhat
            boolean isExit = true;
            do {
                System.out.println("1. Update Student name: ");
                System.out.println("2. Update sex: ");
                System.out.println("3. Update class student: ");
                System.out.println("4. Update age: ");
                System.out.println("5. Update address: ");
                System.out.println("6. Exit: ");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter Student name: ");
                        arrStudents[indexUpdate].setStudentName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter Sex: ");
                        arrStudents[indexUpdate].setSex(arrStudents[indexUpdate].inputSex(scanner));
                        break;
                    case 3:
                        System.out.print("Enter Class Student: ");
                        arrStudents[indexUpdate].setClassName(scanner.nextLine());
                        break;
                    case 4:
                        System.out.print("Enter Age: ");
                        arrStudents[indexUpdate].setAge(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.print("Enter Address: ");
                        arrStudents[indexUpdate].setAddress(scanner.nextLine());
                        break;
                    case 6:
                        isExit = false;
                        break;
                    default:
                        System.err.println("Invalid choice");
                }
            } while (isExit);
        }
    }
    public int getIndexById(String studentId) {
        for (int i = 0; i < currentIndex; i++) {
            if (arrStudents[i].getStudentId().equals(studentId)) {
                return i;
            }
        }
        return -1;
    }
    public void deleteStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentIdDelete = scanner.nextLine();
        int indexDelete = getIndexById(studentIdDelete);
        if (indexDelete >= 0) {
            for (int i = indexDelete; i < currentIndex - 1; i++) {
                arrStudents[i] = arrStudents[i + 1];
            }
            arrStudents[currentIndex - 1] = null;
            currentIndex--;
        } else {
            System.err.println("Student ID not found");
        }
    }
    public void sortStudentByAgeASC() {
        // Thuat toan gan voi thuat toan selection sort
        for (int i = 0; i < currentIndex - 1; i++) {
            for (int j = i + 1; j < currentIndex; j++) {
                if (arrStudents[i].getAge() > arrStudents[j].getAge()) {
                    Student temp = arrStudents[i];
                    arrStudents[i] = arrStudents[j];
                    arrStudents[j] = temp;
                }
            }
        }
    }
    public void searchStudentByIdOrName(Scanner scanner) {
        System.out.println("Enter Student ID or Student name: ");
        String valueSearch = scanner.nextLine();
        int cntStudent = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (arrStudents[i].getStudentId().toLowerCase().contains(valueSearch.toLowerCase()) || arrStudents[i].getStudentName().toLowerCase().contains(valueSearch.toLowerCase())) {
                arrStudents[i].displayData();
                cntStudent++;
            }
        }
        System.out.printf("There are %d students matching your search criteria.\n", cntStudent);
    }
}
