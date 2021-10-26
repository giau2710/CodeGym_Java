package interfaceResizeable;

public class M {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        System.out.println(circle.getArea());
        circle.resize(10.0);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(10.0);
        System.out.println(circle.getArea());
        circle.resize(10.0);
        System.out.println(circle.getArea());

    }


}
