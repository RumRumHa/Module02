package bt.BT6;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Bán kính: " + circle1.getRadius());
        System.out.println("Circle 1 - Diện tích: " + circle1.getArea());
        Circle circle2 = new Circle(2);
        System.out.println("Circle 2 - Bán kính: " + circle2.getRadius());
        System.out.println("Circle 2 - Diện tích: " + circle2.getArea());
    }
}
