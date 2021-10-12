package display_icon;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice =1;
        while (1 <= choice && choice <= 4) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    squareTriangle();
                    break;
                case 3:
                    isoscelesTriangle();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }

    //in hình chữ nhật
    public static void rectangle() {
        int height = 3;
        int weight = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    //in ra tam giác vuông
    public static void squareTriangle() {
        int high = 5;
        for (int i = high; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //    in ra tam giác cân
    public static void isoscelesTriangle() {
        int height = 7;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}


