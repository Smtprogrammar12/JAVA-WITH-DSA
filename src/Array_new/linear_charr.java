package Array_new;

public class linear_charr {

    public  static  int linearr(String arr[] , String key){

        for (int i =0; i< arr.length; i++){
            if(arr[i] == key){
                return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String arr[] = {"apple" ,"banana" , "Date" , "Almonds" , "orange"};
        String key = "abccc";

        int index = linearr(arr , key);

        if(index == -1){
            System.out.println("Not founded;");
        }else{
            System.out.println("index are :--  " + index);
        }


    }
}
