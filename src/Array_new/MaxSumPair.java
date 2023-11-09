package Array_new;

public class MaxSumPair {
    public  static  void Maxsum(int arr[]){
        int Currentsum =0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        // outterr loop
        for (int i=0; i< arr.length; i++){
            int start = i;

            // subArray loop
            for (int j =i; j< arr.length; j++){
                int end =j;
                // print loop
                for (int k = start; k<=end; k++){
                   Currentsum += arr[k];
                }
                System.out.println("sum of pair:- " + Currentsum);
                // for max sum pair
                if (maxSum< Currentsum){
                    maxSum = Currentsum;
                }
                // min sum pair
                if (minSum > Currentsum){
                    minSum = Currentsum;
                }
            }
        }
        System.out.println("Max Sum:-- " + maxSum);
        System.out.println("Min Sum :-- " + minSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Maxsum(arr);
    }
}
