package FizzBuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter is number:");
        int number = scanner.nextInt();
        if (number < 11) {
            System.out.println(FizzBuzzTranslate.checkNumber(number));
            System.out.println(FizzBuzzTranslate.from0To9(number));
        } else if (number < 100) {
            String dozesLetter = FizzBuzzTranslate.from0To9(number);

            System.out.printf("%s", dozesLetter);
            System.out.println("test");

        }
    }
}
