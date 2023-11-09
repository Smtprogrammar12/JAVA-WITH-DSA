package Array_new;

public class linear_S {
    public  static  int linear(int arr[] , int key){
        for (int i =0; i< arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return  -1;
    }

    public  static  void main(String[] args){
        int arr[] = {1,2,3,4,5,6,99,10};
        int key = 990;

        int index = linear(arr ,key );
        if(index == -1){
            System.out.println("key are found");
        }
        else {
            System.out.println("key at index :-- " + index);
        }
        }

    }

