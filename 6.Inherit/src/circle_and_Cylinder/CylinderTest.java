package circle_and_Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(4, 3);
        System.out.println(cylinder);
        System.out.println(cylinder.volume());
    }
}
