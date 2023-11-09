package Array;

import java.util.Scanner;

public class multiplicationInArray {
    static void print_matrix(int arr [][]){
        for (int i =0; i< arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
    }
    static void mulplication(int a[][] , int r1, int c1,int b[][], int r2, int c2){
        if (c1 != r2){
            System.out.println("your are enter wrong input which is not possible in multiplicatio");
            return;
        }
        int mul [][] = new int[r1][c2];
        for (int i =0; i<r1; i++){
            for (int j=0; j<c2; i++){
                for (int k=0; k<c1; k++){
                   mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("multiplication of two matrix");
        print_matrix(mul);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemnet row and clouns of matrix1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

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
        int b [][]  = new int[r2][c2];
        System.out.println("Enter the " + r1*c1 + "element");
        for (int i =0; i<r2; i++){
            for (int j =0; j<c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1 is here");
        print_matrix(a);
        System.out.println("matrix 2 is here");
        print_matrix(b);
        mulplication(a , c1 , r1 , b , c2 , r2);
    }
}
