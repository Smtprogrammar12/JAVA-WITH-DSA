package BasicSortingAlgo;

public class BubbleSort {

    public  static void bubblesort(int arr[]){
        // foe turn
        for (int i =0 ; i< arr.length-1; i++){
            // for sorting
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Slection sort
    public static void Slectionsort(int arr[]){
        for (int i =0 ; i< arr.length-1; i++){
            int smallest = i;
            for (int j =i+1 ;j< arr.length; j++){
                if (arr[j] < arr[smallest]){
                    smallest = j;

                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    // insertion sort

    public  static  void Insertionsort(int arr[]){
        for (int i=1 ; i< arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev >=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
    }
    // print the element
    public  static  void  print(int arr[]){

        for (int i =0 ; i< arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
//        bubblesort(arr);
//        System.out.println("this is done by bulble sort alogrithm");
//        Slectionsort(arr);
//        System.out.println("this is done by slection sort");

        Insertionsort(arr);
        System.out.println("this is done by insertion sort alogorithm");
        print(arr);

    }
}
