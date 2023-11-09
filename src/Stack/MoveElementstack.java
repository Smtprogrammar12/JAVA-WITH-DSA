package Stack;

import java.util.Scanner;
import java.util.Stack;


public class MoveElementstack {
    public static void main(String[] args) {

        // this is used taking input in stack

//       Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number of element");
//
//        int n = sc.nextInt();
//
//        Stack<Integer> st = new Stack<>();
//
//        System.out.println("Enter the element ");
//        for (int i =0; i<n; i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
//        System.out.println(st.peek());

        // move same elemnt to the other stack
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // an other stack for reverse
        Stack<Integer> md = new Stack<>();

        while (st.size()>0){
            md.push(st.pop());
        }
        //System.out.println(md);

        // final stack for store same value
        Stack<Integer> ft = new Stack<>();
        while (md.size() > 0){
            ft.push(md.pop());
        }
        System.out.println(ft);


    }
}
