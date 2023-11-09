package Stack;

import java.util.Stack;

public class BasicStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("size of stack "+st.size());
        System.out.println(st);
        st.push(22);
        st.push(23);
        st.push(100);
        st.push(300);
        st.push(400);
        st.push(500);
        System.out.println("size of stack "+st.size());

        // first element from the top
       // System.out.println(st.peek());
        //System.out.println(st);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println("size of stack "+st.size());
        // delete first from the top
       // System.out.println(st.pop());
      //  System.out.println(st.peek());

        // find first element of stack
//        while (st.size() > 1){
//            st.pop();
//        }
//        System.out.println(st.peek());
//        System.out.println(st);

        // find second element of stack
        while (st.size()>2){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

    }
    }
