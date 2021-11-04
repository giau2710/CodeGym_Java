package count_string_map;

import java.util.Scanner;
import java.util.TreeMap;

public class CountElementStringOfMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        String newStr = str.toLowerCase();
        System.out.println(newStr);
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < newStr.length(); i++) {
            char key = newStr.charAt(i);
            System.out.println(key);


        }
        System.out.println(map);
    }
}