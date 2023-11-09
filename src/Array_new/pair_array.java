package Array_new;

public class pair_array {
    public static  void pair(int arr[]){
         int tpp =0;
        for (int i =0; i< arr.length; i++){
            int current = arr[i];

            for (int j =i+1; j< arr.length; j++){
                System.out.print("(" + current + "," + arr[j] + ")");
                 tpp++;
            }
            System.out.println();
        }
        System.out.println(tpp);
    }
    public static void main(String[] args) {
         int arr[] = {2,4,6,8,10};
         pair(arr);



    }
}
