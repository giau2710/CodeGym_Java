package greatest_common_divisor;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numberOne :");
        int numberOne = scanner.nextInt();
        System.out.println("Enter numberTwo :");
        int numberTwo = scanner.nextInt();
        numberOne = Math.abs(numberOne);
        numberTwo = Math.abs(numberTwo);
        if (numberOne == 0 || numberTwo == 0) {
            System.out.println("No greatest common factor");
        }
        while (numberOne != numberTwo) {
            if (numberOne > numberTwo)
                numberOne = numberOne - numberTwo;
            else
                numberTwo = numberTwo - numberOne;
        }
        System.out.println("Greatest common factor: " + numberOne);

    }
}
