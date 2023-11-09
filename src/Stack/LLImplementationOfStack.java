package Stack;

public class LLImplementationOfStack {
    public static class Node{
        int data;
        Node next;

        void Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public  static class LLstack{
        Node head = null;
        int size =0;
        void push(int data){
            Node temp = new Node();
            temp.next = head;
            head = temp;
            size++;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int pop(){
            if(head == null){
                System.out.print("stack is empty!!");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }
        int peek(){
            if(head == null){
                System.out.println("stack is empty!!");
                return -1;
            }
            return head.data;

        }
        boolean isEmpty(){
            if (size == 0) return true;
            return false;
        }

        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        LLstack st = new LLstack();
        st.push(10); //10
        //  st.display();
        st.push(20);
        //    st.display(); //10>20
        st.push(30); // 10>20>30
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.size());
       st.pop();
        st.display();
        st.peek();
        st.display();
        System.out.println(st.size());

    }
}
