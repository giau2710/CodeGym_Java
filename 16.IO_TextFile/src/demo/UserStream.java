package demo;


import java.util.Arrays;
import java.util.List;

public class UserStream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Khanh", "Thanh", "Dung","Khang");

        names.stream()
                .filter(s -> s.startsWith("K"))
                .forEach(System.out::println);
    }




}





