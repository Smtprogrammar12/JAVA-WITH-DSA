package LinkedList;

public class BasicLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
//        public static Node head;
//        public  static Node tail;

    }

    public static void print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printrecv(Node head){
        if(head == null){
            return;
        }
        printrecv(head.next);
        System.out.print(head.data + " ");
    }
   // printing the length of element
    public static int lengthN(Node head){
        int count =0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;

    }

    public static void main(String[] args) {
        Node Ob = new Node(5);
      //  System.out.println(Ob.next);
        Node Ob1 = new Node(10);
        Node Ob2 = new Node(15);
        Node Ob3 = new Node(20);
        Node Ob4 = new Node(25);
        Node Ob5 = new Node(30);

        Ob.next = Ob1;
        Ob1.next = Ob2;
        Ob2.next= Ob3;
        Ob3.next = Ob4;
        Ob4.next = Ob5;
//        System.out.println(Ob.next);
//        System.out.println(Ob.data);
//        System.out.println(Ob1.next);
//        System.out.println(Ob1);

//        System.out.println(Ob.data);



//      for (int i =1 ; i<5; i++){
//          System.out.print(temp.data + "->");
//          temp = temp.next;
//      }

        // when length is not detremined
//        Node temp = Ob;
//        while (temp!= null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

      // call printing function from here
     print(Ob);
     // recursive print which is reverse
          printrecv(Ob);
        System.out.println();

          // printing size of linkedlist
        System.out.println("Length of the linkedlist  "+lengthN(Ob));

    }
}
