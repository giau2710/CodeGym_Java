package bubble_sort;

import static bubble_sort.BubbleSort.bubbleSort;
import static bubble_sort.BubbleSort.list;

public class Main {
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
