package Array;

public class SumOfArray {
    void  sum(){
        int[] arr1 = {1,2,3,4,5};
        int sum = 0;
        for( int i =0 ; i< arr1.length; i++){
            sum = sum + arr1[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();
        obj.sum();
    }
}
