package Arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> elements = new MyList<>(5);
        elements.add(2,"hai");
        elements.add(1,"ba");
        System.out.println(elements);
        MyList <String> result = elements.clone();

        System.out.println(result);
    }
}
