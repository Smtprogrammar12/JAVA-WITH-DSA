package Basic_Sorting;

public class Bubble_sort {
    public  static  void bubleS(int number[]){
        for (int i =0 ; i< number.length-1; i++){
            int swap =0;
            for (int j =0; j < number.length-1-i; j++){
               if(number[j] > number[j+1]){
                   int temp = number[j];
                   number[j] = number[j+1];
                   number[j+1] = temp;
                   swap++;

               }

            }
            System.out.print(swap +" ");
        }
        System.out.println();

    }
    public  static  void  print(int number[]){

        for (int i =0 ; i< number.length; i++){
            System.out.print( number[i] + " ");
        }
        System.out.println();
    }

    public  static  void slecltionSort(int number[]){
        for (int i =0 ; i< number.length-1; i++){
            int index = i;
            for (int j =i+1; j<number.length;j++){
                if (number[j] < number[index]){
                   index=j;
                }
            }
            // swap
            int smallN = number[index];
             number[index] = number[i];
            number[i] = smallN;
        }
    }

    public static  void insertionS(int number[]){

        for (int i = 0 ; i<number.length; i++){
            int curr = number[i];
            int prev = i-1;
            while(prev >= 0 && number[prev] > curr){
                number[prev+1] = number[prev];
                prev--;
            }
            number[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int number[] = {5,4,1,3,2};
//        int number[] = {1,2,3,4,5};
//        bubleS(number);

//        slecltionSort(number);
        insertionS(number);

        print(number);
    }
}
