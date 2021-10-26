package FizzBuzz;

import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.Scanner;

public class FizzBuzzTranslate {
//    public static String traslate(int number) {
//        if (number % 3 == 0 && number % 5 == 0) {
//            return "FizzBuzz";
//        } else if (number % 3 == 0) {
//            return "Fizz";
//        } else if (number % 5 == 0) {
//            return "Buzz";
//        } else {
//            return String.valueOf(number);
//        }
//    }
    public static String checkNumber(int number) {
        String str = String.valueOf(number);
        char[] char_arr = str.toCharArray();
        for (char c : char_arr) {
            if (c == '3') {
                return "Fizz";
            }
            if (c == '5') {
                return "Buzz";
            }
        }
        return "Khong co 3 va 5";
    }

    public static String from0To9(int number) {
        String letter = "";
        switch (number) {
            case 0:
                letter = "khong";
                break;
            case 1:
                letter = "mot";
                break;
            case 2:
                letter = "hai";
                break;
            case 3:
                letter = "ba";
                break;
            case 4:
                letter = "bon";
                break;
            case 5:
                letter = "nam";
                break;
            case 6:
                letter = "sau";
                break;
            case 7:
                letter = "bay";
                break;
            case 8:
                letter = "tam";
                break;
            case 9:
                letter = "chin";
                break;
            case 10:
                letter = "muoi";
                break;
        }
        return letter;
    }

}

