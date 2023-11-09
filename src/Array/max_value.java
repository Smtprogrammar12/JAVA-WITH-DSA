package Array;

public class max_value {

    void max(){
        int[] arr1 ={1,5,9,7,11};
        int ans = 0;
        for( int i = 0; i < arr1.length; i++){
            if(arr1[i] > ans){
                ans = arr1[i];
            }
        }
        System.out.println("max value in Aaray is :-- " + ans);
    }
    public static void main(String[] args) {
        max_value obj = new max_value();
        obj.max();
    }
}
