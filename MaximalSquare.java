import java.io.*;
import java.util.*;
class MaximalSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Row Count");
        int TwoDArrayRow = scn.nextInt();
        System.out.println("Enter Coloum Count");
        int TwoDArrayCol = scn.nextInt();
        char[][] maximalSquare = new char[TwoDArrayRow][TwoDArrayCol];
        System.out.println("Enter only 0 and 1");
        for(int i = 0; i < TwoDArrayRow; i++){
            for(int j = 0; j < TwoDArrayCol; j++){
                maximalSquare[i][j] = scn.next().charAt(0);
            }
        }
        System.out.println(maximalSquareArea(maximalSquare));
    }

    public static int maximalSquareArea(char[][] nums){
        int[][] convertedArray = new int[nums.length][nums[0].length];
        for(int i = 0; i < convertedArray.length; i++){
            for(int j = 0; j < convertedArray[0].length; j++){
                convertedArray[i][j] = nums[i][j] - '0';
            }
        }
        return solve(convertedArray);
    }

    public static int solve(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        int ans = 0;

        for(int i = row - 1; i >= 0; i--){
            for(int j = col - 1; j >= 0; j--){
                if(matrix[i][j] == 1){
                    if(i == row - 1 || j == col - 1){
                        dp[i][j] = 1; //largest square posible is 1 at corners
                    } else{
                        int minOfRDD = Math.min(dp[i][j + 1], dp[i + 1][j]);
                        minOfRDD = Math.min(minOfRDD, dp[i + 1][j + 1]);
                        dp[i][j] = 1 + minOfRDD;
                    }
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans*ans;
    }
}
