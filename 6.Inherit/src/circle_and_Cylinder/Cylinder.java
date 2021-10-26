package circle_and_Cylinder;

public class Cylinder extends Circle {
  public   double height=10;

 public Cylinder(){

 }

    public Cylinder(double radius, double height) {
super();
        this.height=height;
    }

    public double volume() {
     return super.area()*this.height;
 }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
