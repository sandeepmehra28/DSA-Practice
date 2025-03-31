package javaArrays;

import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int [][] matrix = new int[n][m];
        for(int i=0;i<matrix.length;i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.println("the spiral order matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd  = m-1;
        while(rowStart<=rowEnd&&colStart<=colEnd){
            for (int col=colStart;col<=colEnd;col++){
                System.out.print(matrix[rowStart][col]+" ");
            }
            rowStart++;
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            System.out.println();
        }
    }
}