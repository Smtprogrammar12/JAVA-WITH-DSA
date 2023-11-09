package Array_new;

public class SubArrayPair {
    public  static  void SubArray(int arr[]){
        int totalpair = 0;
        int sum =0;
        // outterr loop
        for (int i=0; i< arr.length; i++){
            int start = i;

            // subArray loop
            for (int j =i; j< arr.length; j++){
                int end =j;
                // print loop
                for (int k = start; k<=end; k++){
                    System.out.print(arr[k]+ " ");
                    sum += arr[k];
                }
                totalpair++;
                System.out.println();
            }
        }
        System.out.println("Total number of pair SubArray " + totalpair);
        System.out.println("Sum of pair are:-- " + sum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        SubArray(arr);
    }
}
