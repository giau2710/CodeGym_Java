package Random;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class random2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
