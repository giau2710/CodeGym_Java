package sum_diagonal_line;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bậc của ma trận: ");
        int n = scanner.nextInt();
        int A[][] = new int[n][n];
        System.out.println("nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }

        }
        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j) {
                    sum += A[i][j];
                }
            }

        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
