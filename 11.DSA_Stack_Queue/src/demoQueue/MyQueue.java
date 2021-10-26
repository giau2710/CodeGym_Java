package demoQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Tan");
        queue.offer("Huu");
        queue.offer("Giau");
        queue.offer("Thanh");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
