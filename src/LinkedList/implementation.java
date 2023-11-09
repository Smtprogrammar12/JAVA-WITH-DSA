package LinkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
       Node tail = null;

        void AddEnd(int data){
            // crete new node
            Node Newnode = new Node(data);
            // check any element are exist or not
            if(head == null){
                head = Newnode;
                return;
            }
          // assign address
            Node value = head;
            while (value.next != null){
                value = value.next;
            }
            value.next = Newnode;
        }
        void print(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int count =0;
        int size(){
            while (head != null){
                count++;
                head = head.next;
            }
            return count;
        }

      void AddFirst(int data){
            Node temp = new Node(data);
            if(head == null){
                head =tail =temp;
                return;
            }
            temp.next = head;
            head = temp;
      }
      // insertion at index
        void insertionAt(int data , int idx){
            Node t = new Node(data);
            Node temp = head;
            for (int i =1; i<= idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
    }

    public static void main(String[] args) {
      linkedlist ll = new linkedlist();
      ll.AddEnd(2);
      ll.AddEnd(5);
      ll.AddEnd(7);
      ll.AddEnd(10);
        ll.AddEnd(25);

        ll.AddFirst(100);
        ll.insertionAt(3 ,200);
        // for print
       ll.print();
      //  System.out.println("size of the list " + ll.size());


    }
}
