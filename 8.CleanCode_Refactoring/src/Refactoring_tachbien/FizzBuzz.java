package Refactoring_tachbien;

public class FizzBuzz {

    private static boolean isFizz;
    private static boolean isBuzz;

    public static String fizzBuzz(int number){
        isFizz = number % 3 == 0;
        isBuzz = number % 5 == 0;
        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(number % 3 == 0)
            return "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return number + "";
    }
}
