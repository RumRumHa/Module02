package ra;

public class HelloWorld {
    private int sumNumber;

    public static void main(String[] args) {
        System.out.println("Hello World");
        // primitive
        float number = 5.7F;
        int totalNumber = addTwoNumbers(5,7);
    }

    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        // Ctrl + Alt + L
        int sumNumber = firstNumber + secondNumber;
        return sumNumber;
    }
}
