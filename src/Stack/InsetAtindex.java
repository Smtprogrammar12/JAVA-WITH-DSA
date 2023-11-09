package Stack;

import java.util.Stack;

public class InsetAtindex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx =2;
        int x = 100;
        Stack<Integer> ft = new Stack<>();
        System.out.println(st.size());
        while (st.size()>idx){
            ft.push(st.pop());
        }
        st.push(x);
        while (ft.size()>0){
            st.push(ft.pop());
        }
        System.out.println(st);
    }
}
