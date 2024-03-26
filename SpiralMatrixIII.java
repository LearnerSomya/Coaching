import java.io.*;
import java.util.*;
class SpiralMatrixIII {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Rows");
        int rows = Integer.parseInt(br.readLine());
        System.out.println("Coloums");
        int cols = Integer.parseInt(br.readLine());
        // int[][] matrix = new int[rows][cols];
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < cols; j++){
        //         matrix[i][j] = Integer.parseInt(br.readLine());
        //     }
        // }
        System.out.println("Start Row");
        int rStart = Integer.parseInt(br.readLine());
        System.out.println("Start Coloum");
        int cStart = Integer.parseInt(br.readLine());
        int[][] matrixResult = spiralMatrixFill(rows,cols,rStart,cStart);
        for(int[] val : matrixResult){
            System.out.println(Arrays.toString(val));
        }
    }
    public static int[][] spiralMatrixFill(int rows, int cols, int rStart, int cStart){
        int[][] result = new int[rows*cols][2];
        int[][] direction ={{0,1},{1,0},{0,-1},{-1,0}};
        int directionIndex = 0;
        int count = 0;
        int steps = 1;
        int row = rStart;
        int col = cStart;

        while(count < rows * cols){
            //moving in current direction
            for(int i = 0; i < steps; i++){
                //check if current possition is in bound of grid
                if(row >= 0 && row < rows && col >= 0 && col < cols){
                    result[count][0] = row;
                    result[count][1] = col;
                    count++;
                }
                //Move to next direction
                row += direction[directionIndex][0];
                col += direction[directionIndex][1];
            }

            //change direction
            directionIndex = (directionIndex + 1) % 4;
            // Increase steps every two directions (right and up, then down and left)
            if(directionIndex % 2 == 0){
                steps++;
            }
        }
        return result;
    }
}
