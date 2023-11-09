package Array;

import java.util.Scanner;

public class generatespirial {
    static void print_matrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] sprial_matrix(int n){
        int [][] matrix = new int[n][n];
        int toprow = 0;
        int buttonrow = n-1;
        int leftcols = 0;
        int rightcols = n-1;
        int current = 1;
        while(current < n*n){

            for (int j = leftcols; j <= rightcols && current <=n*n; j++){
                matrix[toprow][j] = current++;
                current++;
            }
            toprow++;
            for (int i = toprow; i <= buttonrow && current <= n*n; i++){
                matrix[i][rightcols] = current++;
                current++;
            }
            rightcols--;
            for (int j = rightcols; j >= leftcols && current <=n*n; j-- ){
                matrix[buttonrow][j]= current++;
                current++;
            }
            buttonrow--;
        }
        for (int i = buttonrow; i>= toprow && current <= n*n; i--){
            matrix[i][leftcols] = current++;
            current++;
        }
        leftcols++;
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element:--");
        int n = sc.nextInt();
        int [][] matrix = sprial_matrix(n);
        print_matrix(matrix);
    }
}
