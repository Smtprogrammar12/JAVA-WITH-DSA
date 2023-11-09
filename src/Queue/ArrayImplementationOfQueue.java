package Queue;

import java.util.Queue;

public class ArrayImplementationOfQueue {
    public static class queueArr{
        int f =-1;
        int r =-1;
        int size =0;

        int arr[] = new int[6];
        public void add(int data){
            if ( r == arr.length){
                System.out.println("your Queue is full ");
                return;
            }
            // base case
            if (f ==-1) {
                f = r =0;
                arr[0] = data;

            }


            else {
//            arr[++r] = data;
                arr[r+1] = data;
                r++;
            }

            size++;

        }

        public int remove(){
            if (size == 0){
                System.out.println("your queue is empty ");
                return  -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        public int peek(){
            if (size == 0){
                System.out.println("your queue is empty ");
                return  -1;
            }

            return  arr[f];
        }

        public void Display(){
            if (size ==0){
                System.out.println("your Quueue is empty!! ");
            }
            for (int i =f ; i<=r; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        queueArr QA = new queueArr();
    //  QA.Display();
        QA.add(10);
        QA.add(20);
        QA.add(30);
        QA.add(40);
        QA.add(50);
        QA.Display();
        QA.remove();
        QA.Display();
        System.out.println();
        System.out.println( QA.peek());
        System.out.println(QA.size);

    }
}
