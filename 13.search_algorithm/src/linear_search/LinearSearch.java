package linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        String arr[]=new String[]{"Hoang","Tan","Huu","Giau"};
        String value="Tan";
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals(value)){
                System.out.printf("tim thay %s tai vi tri %d",value,i);
                break;
            }
        }
    }


}
