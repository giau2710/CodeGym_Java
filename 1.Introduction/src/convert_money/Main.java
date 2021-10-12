package convert_money;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Enter value money USD:");
        Scanner scaner = new Scanner(System.in);
        float usd = scaner.nextFloat();
        float vnd = usd * 23000;
//1 USD into 23,000VND
        System.out.printf("%f USD into %f VND.",usd,vnd);
    }
}
