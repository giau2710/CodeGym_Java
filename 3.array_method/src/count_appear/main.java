package count_appear;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String chain;
        char symbol = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chain = scanner.nextLine();
        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == symbol) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + symbol +
                " trong chuỗi " + chain + " = " + count);
    }
}