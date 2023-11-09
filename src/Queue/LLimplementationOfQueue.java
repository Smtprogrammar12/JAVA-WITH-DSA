package Queue;

public class LLimplementationOfQueue {

    public static class Node{
        int data;
        Node next;

        void Node(int data){
            this.data = data;
        }
    }

    public  static  class LLQueue{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp =new Node();
            temp.data = x;
            if (size == 0){
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if (size == 0){
                System.out.println("your queue is empty!!");
                return -1;
            }
            return  head.data;
        }

        public int remove(){
            if (size == 0){
                System.out.println("your queue is empty!!");
                return -1;
            }
            int val = head.data;
             head = head.next;
             size--;
            return  val;
        }

        public void display(){
            if (size ==0){
                System.out.println("Queue is empty.");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp  = temp.next;
            }
        }

        public boolean isEmpty(){
            if (size == 0)  return  true;
           else return  false;
        }




    }
    public static void main(String[] args) {
         LLQueue Ql = new LLQueue();
        System.out.println( Ql.isEmpty());
      //   Ql.display();
         Ql.add(10);
        Ql.add(20);
        Ql.add(30);
        Ql.add(40);
        Ql.add(50);
        Ql.display();
        System.out.println();
        System.out.println("peek is element");
        System.out.println(Ql.peek());
        Ql.remove();
        Ql.display();
        System.out.println(Ql.isEmpty());

    }
}
