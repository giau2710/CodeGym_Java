package StringBuilder;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoSB {
    public static void main(String[] args) {
        String text = (new Scanner(System.in)).next();
        String regex = "^0+[\\d]{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        if (m.matches()) {
            System.out.println("Ok");
        }else
        {
            System.out.println("Nhap sai vui long nhap lai");
        }
    }
}
