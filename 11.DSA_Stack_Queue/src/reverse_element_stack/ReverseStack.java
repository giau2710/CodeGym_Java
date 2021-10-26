package reverse_element_stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int element : arr
        ) {
            stack.push(element);
        }

        System.out.println(stack);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
      String str="mWord";
       Stack<Character>newStack = new Stack<>();
        for(int i=0; i<str.length();i++){
            newStack.push(str.charAt(i));

        }
        System.out.println(str);

        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output = output + newStack.pop();
        }
        System.out.println(output);

    }
}
