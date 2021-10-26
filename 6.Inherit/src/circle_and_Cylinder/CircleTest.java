package circle_and_Cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(circle);
        System.out.println(circle.area());
        circle = new Circle(5, "blue");
        System.out.println(circle);
        System.out.println(circle.area());
    }
}
