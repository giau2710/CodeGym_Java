package methodOfString;

import java.util.SortedMap;

public class Demo {
    public static void main(String[] args) {
//Trả về số kí tự chuỗi
        String nameString = "khoc mot dong song";
        System.out.println("So ki tu trong chuoi la: " + nameString.length());


//Trả về ký tự tại vị trí index trong chuỗi
        System.out.println("ki tu o vi tri can tim la:" + nameString.charAt(3));


//        Nối chuỗi
        String str1 = "khoc mot ";
        String str2 = "dong song";
        String userConcat = str1.concat(str2);
        String operatorAddition = str1 + str2;
        System.out.println("Noi chuoi su dung phuong thuc concat: " + userConcat);
        System.out.println("Noi chuoi su dung toan tu +: " + operatorAddition);

        
//        Chuyển đổi chuỗi
        String name = "VIETNAM";
        System.out.println("Chuyen thanh ki tu thuong:" + name.toLowerCase());
        System.out.println("chuyen thanh ki tu hoa:"+ nameString.toUpperCase());

//xoa khoang trang
        String khoangTrang = "    Khoang trang \n   ";
        System.out.println(khoangTrang);
        System.out.println(khoangTrang.trim());
        System.out.println(khoangTrang);
    }
}
