package Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
// it follow FIFO -->>> first in first out
public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        System.out.println("length of the queue  "+q.size());
        q.add(10);
        System.out.println(q.isEmpty());
        q.add(20);
        System.out.println("length of the queue  "+q.size());
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        System.out.println("length of the queue  "+q.size());
        q.remove();
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.peek());
        q.add(100);
        System.out.println(q);



    }
}
