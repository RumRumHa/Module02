package bt;

import java.util.Scanner;

public class QuadraticEquation {
    /*
    *       QuadraticEquation
    * - Thuộc tính:
    *   + a, b, c: double
    * - Phương thức:
    *   + QuadraticEquation(a: double, b: double, c: double)
    *   + getA(): double
    *   + setA(a: double): void
    *   + getB(): double
    *   + setB(b: double): void
    *   + getC(): double
    *   + setC(c: double): void
    *   + getDiscriminant(): double
    *   + getRoot1() và getRoot2(): double
    * */
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hệ số b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hệ số c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm thứ nhất: " + equation.getRoot1());
            System.out.println("Nghiệm thứ hai: " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
