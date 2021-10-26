package classify_triangle;


public class TamGiac {

    public static String checkTamgGiac(double a, double b, double c) {
        if (a+b > c && a+c > b && b+c > a){
            if (a == b && b == c){
                return "Tam giac Deu";
            } else {
                if (a == b || a== c || b == c){
                    return "Tam giac Can";
                } else {
                    return "Tam giac thuong";
                }
            }
        } else{
            return "Khong phai tam giac";
        }
    }
}
