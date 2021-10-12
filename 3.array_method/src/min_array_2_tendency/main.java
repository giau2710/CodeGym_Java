package min_array_2_tendency;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int row, column;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        row = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        column = scanner.nextInt();


        int A[][] = new int[row][column];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        // tìm phần tử có giá trị nhỏ nhất trong ma trận
        int min = A[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (min > A[i][j]) {
                    min = A[i][j];
                }
            }
        }

        System.out.println("Phần tử nhỏ nhất trong ma trận = " + min);
    }
}
