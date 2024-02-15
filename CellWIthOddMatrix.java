import java.io.*;
import java.util.*;
class CellWIthOddMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row count of the matrix which you want to change");
        int row = scn.nextInt();
        System.out.println("Enter column count of the matrix which you want to change");
        int col = scn.nextInt();
        //int[][] matrixToBeChanged = new int[row][col];
        //indices may have more rows but only two column
        System.out.println("Enter Row counts for Indices");
        int m = scn.nextInt();
        int[][] indices = new int[m][2];
        System.out.println("Enter indices value but just in terms of 0 and 1");
        for(int i = 0; i < indices.length; i++){
            for(int j = 0; j < indices[0].length; j++){
                indices[i][j] = scn.nextInt();
            }
        }
        System.out.println("Entred Indices is");
        for(int i = 0; i < indices.length; i++){
            for(int j = 0; j < indices[0].length; j++){
               System.out.print(indices[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Count is " + CountOddValuesOfMatrix(row,col,indices));
    }
    static int CountOddValuesOfMatrix(int row, int col, int[][]indices){
        int count = 0;
        int[][] MatrixToBeChanged = new int[row][col];
        for(int[] insert : indices){
            int rowIndices = insert[0];
            int colIndices = insert[1];

            for(int i = 0; i < col; i++){
                MatrixToBeChanged[rowIndices][i]++;
            }
            for(int j = 0; j < row; j++){
                MatrixToBeChanged[j][colIndices]++;
            }
        }
        System.out.println("Chnged Matrix is this");
        for(int a = 0; a < MatrixToBeChanged.length; a++){
            for(int b = 0; b < MatrixToBeChanged[0].length; b++){
                System.out.print(MatrixToBeChanged[a][b]);
            }
            System.out.println();
        }

        for(int a = 0; a < row; a++){
            for(int b = 0; b < col; b++){
                if(MatrixToBeChanged[a][b] % 2 != 0){
                    count++;
                }
            }
        }

        return count;
    } 
}
