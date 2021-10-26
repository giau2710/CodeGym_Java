package QuadraticEquation;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {

    }
   public QuadraticEquation(double a, double b, double c) {
       this.a=a;
       this.b=b;
       this.c=c;
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

    public double getDiscriminant() {
        double delta = Math.pow(b,2)- 4*a*c;
        return  delta;
    }
    public double getRoot1(){
        if(getDiscriminant()>=0){
            double r1= (-b +Math.sqrt(getDiscriminant()))/(2*a);
            return r1;
        } return 0;

    }
    public double getRoot2(){
        if(getDiscriminant()>=0) {
            double r2 = (-b - Math.sqrt(getDiscriminant()))/(2*a);
            return r2;
        } return 0;
    }
}
