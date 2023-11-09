package Array;

public class Check_value {
    void present() {
        int[] arr1 = {1, 2, 3, 4, 5 ,1,5};
        int x = 5;
        int ans = -1;
        for( int i = 0; i< arr1.length; i++){
            if(arr1[i] == x){
                //System.out.println("element are present ");
                ans = i;
                break;
            }
//            else{
//                System.out.println("element" + x + " are not present " + ans );
//            }


        }
        System.out.println("elment " +  x  + " are  present at " +  ans);
    }
    public static void main(String[] args) {
        Check_value  obj = new Check_value();
        obj.present();
    }
}
