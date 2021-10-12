package number_prime;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        int dem = 0;
        for (; count < numbers; N++) {
            for (int j = 2; j < N; j++) {
                if (N % j == 0) {
                    dem = dem + 1;
                }
            }
            if (dem == 0) {
                count = count + 1;
                System.out.println(N);
            }
            dem = 0;
        }

    }
}
