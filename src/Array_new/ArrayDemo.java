package Array_new;
import java.util.Arrays;

public class ArrayDemo {
    // for print value
    private static void display(int[] intArray){
        System.out.print("Array : [");
        for(int i =0; i<intArray.length; i++){
            System.out.print(" " + intArray[i]);
        }
        System.out.println(" ]");
        System.out.println();
    }
    public static void  main(String args[]){

        // initilze array
        int intArray[];


        // declear size
        intArray = new int[8];
        System.out.println("Array before adding data.");

        display(intArray);

        // operation :-- intertion
        for (int i =0; i<intArray.length; i++){
            System.out.println("Adding " + i + " at index " + i);
            intArray[i] =i;
        }
        System.out.println();
        System.out.println("Array after adding elements ");
        display(intArray);

        // operation :-- update
        int index = 5;
        intArray[index] = 10;

        System.out.println("After the updated the element at index " + index);
        display(intArray);


        // operation :-- Searching

        int value = 4;
        for (int i =0 ;i< intArray.length; i++){

            if(intArray[i] == value){
                System.out.println(value + " found at index " + i);
            }

        }

        // deletete eleement
        display(intArray);
        int newArr[]  = new int[intArray.length -1];
        int j = 5;

        for (int i =0 , k=0; i< intArray.length ; i++){
            if(i != j){
                newArr[k] = intArray[i];
                k++;
            }
        }
        System.out.println("befor deleting the eleemnt :-- "  );
        display(intArray);

        System.out.println("After the delete the element  " + Arrays.toString(newArr));

    }
}
