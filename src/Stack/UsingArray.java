package Stack;

import java.util.Stack;

public class UsingArray {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("original stack  ");
        System.out.println(st);

        int n = st.size();
        int arr[] = new int[n];
        for (int i =n-1; i>= 0; i--){
            int x = st.pop();
            arr[i] = x;
        }

        for (int i =0 ; i< n; i++){
            // System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
        // copy element with help of array
        System.out.println(st);


    }
}
