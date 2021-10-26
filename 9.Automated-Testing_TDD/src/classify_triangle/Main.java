package classify_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        double a, b, c;
        do {
            check = false;
            System.out.println("nhap canh tam giac");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            if (a < 0 || b < 0 || c < 0) {
                check = true;
                System.out.println("moi nhap lai canh tam giac");

            }

        } while (check);
        System.out.println(TamGiac.checkTamgGiac(a, b, c));
    }
}
