package ra.jump;

public class Jump_Demo {
    public static void main(String[] args) {
        System.out.println("Các số nguyên từ 1 đến 5 là: ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                //break;
                continue;
            }
            System.out.printf("%d\t", i);
        }
        int sum = addTwoNumbers(5,7);
        System.out.printf("Tổng 2 số là %d", sum);
    }
    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        int sumNumbers = firstNumber + secondNumber;
        return sumNumbers;
    }
}
