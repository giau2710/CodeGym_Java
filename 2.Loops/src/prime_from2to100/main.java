package prime_from2to100;

public class main {
    public static void main(String[] args) {
        for (int number = 2; number < 100; number++) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
                }
                if (count == 2) {
                    System.out.println(number);
                }
            }
        }
    }
