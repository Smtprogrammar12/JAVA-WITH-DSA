package Array_new;

public class subArrayyy {
    public static  void  subarray(int arr[]){
        // from start index
        int sum =0;
        for (int i =0; i< arr.length; i++){

            // till last index
            for (int j =i; j< arr.length; j++){

                // just printing
                for (int k = i; k<=j; k++){
                    System.out.print(arr[k]);

                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subarray(arr);
    }
}
