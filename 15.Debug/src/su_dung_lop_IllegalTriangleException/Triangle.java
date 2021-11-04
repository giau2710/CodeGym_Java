package su_dung_lop_IllegalTriangleException;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh thu 1: ");
        int ct1= sc.nextInt();
        System.out.println("nhap canh thu 2: ");
        int ct2= sc.nextInt();
        System.out.println("nhap canh thu : ");
        int ct3= sc.nextInt();
        Triangle triangle = new Triangle();
        triangle.condition(ct1,ct2,ct3);
    }

    private void condition(int ct1,int ct2,int ct3){
try {
    if(!(ct1<=0|| ct2<=0 ||ct3<=0 ||(ct1+ct2 < ct3) || (ct2+ct3<ct1)||(ct1+ct3<ct2))) {
        System.out.println("ban nhap dung");
    }else System.out.println("ban nhap sai");
}catch (Exception e) {
    e.printStackTrace();
}
    }
}
