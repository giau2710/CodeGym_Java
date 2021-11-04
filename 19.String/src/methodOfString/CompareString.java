package methodOfString;

public class CompareString {
    public static void main(String args[]) {
//        So sánh chuỗi
        String s1 = "Hello";
        String s2 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

//so sánh theo vị trí trong từ điển
        String a="a";
        String c="c";
        String b="b";
        String A="A";
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(a));
        System.out.println(a.compareTo(A));
        System.out.println(a.compareToIgnoreCase(A));

//kiểm tra nếu chuỗi  kết thúc với hậu tố nhất định.
// Nó trả về true nếu chuỗi này kết thúc với hậu tố đã cho, nếu khác thì trả về false.
        System.out.println(s1.endsWith("Hi"));

//        tìm kiếm chuỗi ký tự trong chuỗi
        System.out.println(s1.contains("Ell"));
    }
}
