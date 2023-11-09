package Stack;

import java.util.Stack;

public class InertAtButtom {
    public static void main(String[] args) {
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
        ft.push(6);
        while (md.size() > 0){

            ft.push(md.pop());
        }
        System.out.println(ft);
    }
}
