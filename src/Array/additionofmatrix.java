package Array;

import java.util.Scanner;

public class additionofmatrix {
    static void  printmatrix(int [][] arr){
        for (int i =0; i<arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void add(int a[][] , int r1, int c1, int b[][], int r2, int c2){
        if(r1 != r2 && c1 != c2){
            System.out.println("your are enter wrong input which is not possible in addition");
          return ;
        }
        int sum [][] = new int[r1][c1];
        for (int i =0; i<r1; i++){
            for (int j=0; j<r2; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println();
        System.out.println("sum of the matrix is here ");
        printmatrix(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemnet row and clouns of matrix1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
//        System.out.println("Enter the number of columns");
//        int c = sc.nextInt();
        int a[][]  = new int[r1][c1];
        System.out.println("Enter the " + r1*c1 + "element");
        for (int i =0; i<r1; i++){
            for (int j =0; j<c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element row and columns of matrix2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
//        System.out.println("Enter the number of columns");
//        int c = sc.nextInt();
        int b [][]  = new int[r1][c1];
        System.out.println("Enter the " + r1*c1 + "element");
        for (int i =0; i<r1; i++){
            for (int j =0; j<c1; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix1 are");
        printmatrix(a);
        System.out.println("Matrix 2 are");
        printmatrix(b);
        add(a ,r1,c1,b,r2,c2);
    }
}
