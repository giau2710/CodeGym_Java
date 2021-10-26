package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("QuadraticEquation has 2 root");
            System.out.println("Nghiem 1:"+ quadraticEquation.getRoot1());
            System.out.println("Nghiem 2:"+ quadraticEquation.getRoot2());
        } else if(quadraticEquation.getDiscriminant() == 0) {
            System.out.println("QuadraticEquation has 1 root");
            System.out.println("Nghiem :"+ quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }



    }
}
