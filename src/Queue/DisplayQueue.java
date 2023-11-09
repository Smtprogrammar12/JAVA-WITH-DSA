package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("original queue element ;- " + q);

        Queue<Integer> helper = new ArrayDeque<>();

        while(q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
//        System.out.println();
//        System.out.println("this is helper element:-- "+helper);

        while (helper.size()>0){
            q.add(helper.remove());
        }
        System.out.println();
//        System.out.println(q.peek());
//        System.out.println(q.remove());
    }
}
