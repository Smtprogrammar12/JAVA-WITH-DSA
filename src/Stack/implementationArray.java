package Stack;

public class implementationArray {
    public static class stack{
        int idx =0;
        int arr[] = new int[6];
        void push(int x){

            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx == 0){
                System.out.println("stack is empty.");
                return  -1;
            }
            return arr[idx -1];
        }
        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty!! ");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx -1] = 0;
            idx--;
            return top;
        }
        void display(){
            for (int i =0; i<=idx-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }


    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10); //10
      //  st.display();
        st.push(20);
    //    st.display(); //10>20
        st.push(30); // 10>20>30
        st.push(40);
        st.push(50);
//        System.out.println("size of the array:-- "+st.size());  // 3
//        st.display(); // 10>20>30
//        st.push(40);
//        //print
//        st.display();
//        System.out.println("size of the array:-- "+st.size());


        st.peek();
        System.out.println("this is peek element");
        System.out.println(st.peek());
        st.display();


        st.pop();
        System.out.println(st.pop());
        //print
        st.display();

    }
}
