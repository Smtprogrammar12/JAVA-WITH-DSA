package TwoD_Array;

public class Spiral_Matrix {

    public static void sprial(int arr[][]){
        int StartRow =0;
        int StartCol =0;
        int EndRow = arr.length-1;
        int EndCol = arr[0].length-1;

        while(StartRow <= EndRow && StartCol <= EndCol){
            // for col
            for (int j =StartCol; j<= EndCol; j++){
                System.out.print(arr[StartRow][j] + " ");
            }
            // for row in left
            for (int i =StartRow+1; i<=EndRow; i++){
                System.out.print(arr[i][EndCol] + " ");
            }
            // for col in button

            for (int j = EndCol-1; j>= StartCol; j--){
                if (StartRow == EndRow){
                    break;
                }
                System.out.print(arr[EndRow][j] + " ");
            }
            // for row in right side
            for (int i = EndRow-1; i>= StartRow+1; i--){
                if (StartCol == EndCol){
                    break;
                }
                System.out.print(arr[i][StartCol] + " ");
            }
            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                     {5,6,7,8},
                { 9,10,11,12},
                {13,14,15,16}
                      };

        sprial(arr);
    }
}
