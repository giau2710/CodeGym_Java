package numbertoletter.L1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input = inputNumber();
        if (input >= 0 && input < 10) {
            System.out.println(from0To9(input));
        } else {


            if (input >= 10 && input <= 19) {
                System.out.println(from10To19(input));
            } else {

                if (input > 19 && input < 100) {

                    int dozes = input / 10;
                    int unit = input % 10;
                    String dozesLetter = dozesFrom20To99(dozes);
                    String unitLetter = from0To9(unit);
                    System.out.printf("%s %s", dozesLetter, unitLetter);
                } else {
                    int hundred= input/100;
                    int dozes =((input%100)/10);
                    int unit=(input%100)%10;

                    String hundredLetter = hundredsFrom100To900(hundred);
                    String dozesLetter = dozesFrom20To99(dozes);
                    String unitLetter = from0To9(unit);
                    System.out.printf("%s %s %s",hundredLetter, dozesLetter, unitLetter);


                }


            }
        }

    }

    //    nhập số
    public static int inputNumber() {
        System.out.println("Enter is number:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    //    kiểm tra từ 0 đến 10
    public static String from0To9(int number) {
        String letter = "";
        switch (number) {
            case 0:
                letter = "zero";
                break;
            case 1:
                letter = "one";
                break;
            case 2:
                letter = "two";
                break;
            case 3:
                letter = "three";
                break;
            case 4:
                letter = "four";
                break;
            case 5:
                letter = "five";
                break;
            case 6:
                letter = "six";
                break;
            case 7:
                letter = "seven";
                break;
            case 8:
                letter = "eight";
                break;
            case 9:
                letter = "nine";
                break;
        }
        return letter;
    }

    //    kiểm tra từ 10 đến 20
    public static String from10To19(int number) {
        String letter = null;
        switch (number) {
            case 10:
                letter = "ten";
                break;
            case 11:
                letter = "eleven";
                break;
            case 12:
                letter = "twelve";
                break;
            case 13:
                letter = "thirteen";
                break;

            case 14:
                letter = "fourteen";
                break;
            case 15:
                letter = "fifteen";
                break;
            case 16:
                letter = "sixteen";
                break;
            case 17:
                letter = "seventeen";
                break;
            case 18:
                letter = "eighteen";
                break;
            case 19:
                letter = "nineteen";
                break;
            default:
                letter = "";
                break;
        }
        return letter;
    }

    public static String dozesFrom20To99(int dozes) {
        String letter = "";
        switch (dozes) {
            case 2:
                letter = "twenty";
                break;
            case 3:
                letter = "thirty";
                break;
            case 4:
                letter = "forty";
                break;
            case 5:
                letter = "fifty";
                break;
            case 6:
                letter = "sixty";
                break;
            case 7:
                letter = "seventy";
                break;
            case 8:
                letter = "eighty";
                break;
            case 9:
                letter = "nicety";
                break;

        }
        return letter;
    }
    public static String hundredsFrom100To900(int hundreds) {
        String letter = null;
        switch (hundreds) {

            case 1:
                letter = "one hundred";
                break;
            case 2:
                letter = "two hundred";
                break;
            case 3:
                letter = "three hundred";
                break;
            case 4:
                letter = "four hundred";
                break;
            case 5:
                letter = "five hundred";
                break;
            case 6:
                letter = "six hundred";
                break;
            case 7:
                letter = "seven hundred";
                break;
            case 8:
                letter = "eight hundred";
                break;
            case 9:
                letter = "nine hundred";
                break;
        }
        return letter;
    }
}

