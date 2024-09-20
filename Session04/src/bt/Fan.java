package bt;

public class Fan {
    /*
    *       Fan
    * - Thuộc tính:
    *   + speed: int
    *   + on: boolean
    *   + radius: double
    *   + color: String
    * - Phương thức
    *   + Fan()
    *   + getSpeed(): int
    *   + setSpeed(speed: int): void
    *   + isOn(): boolean
    *   + setOn(on: boolean): void
    *   + getRadius(): double
    *   + setRadius(radius: double): void
    *   + getColor(): String
    *   + setColor(color: String): void
    *   + toString(): String
     * */
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (on) {
            return "Fan is on: speed = " + speed + ", color = " + color + ", radius = " + radius;
        } else {
            return "Fan is off: color = " + color + ", radius = " + radius;
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.println("Đối tượng Fan 1: " + fan1.toString());
        System.out.println("Đối tượng Fan 2: " + fan2.toString());
    }
}
