package Array;

public class multiDarray {
    void ExampleArray(){
       // int [][] arr1 = new int[3][2];
        //arr1[0][0] = 55;
        int [][] arr1= {{22,33},{21,32},{33,44},{88,99}};
        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][1]); // 44
        System.out.println("length of he array is:---");
        System.out.println(arr1.length);
        System.out.println("use of for loop ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <2 ; j++) {
                System.out.print(arr1[i][j] + " ");
            }
        }
        System.out.println("use of while loop");

    }
    public static void main(String[] args) {

        multiDarray obj = new multiDarray();
        obj.ExampleArray();
    }
}
