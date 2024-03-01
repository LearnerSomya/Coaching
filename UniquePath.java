//Leetcode and Bosscoder, using DP
import java.io.*;
import java.util.*;
class UniquePath {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());

        System.out.println(UniquePaths(rows, col));
    }
    public static int UniquePaths(int m, int n){
        int directionsToBeTaken = m + n - 2;
        int rightwordDirections = m - 1;
        double totalUniquePaths = 1;
        for(int i = 1; i <= rightwordDirections; i++){
            totalUniquePaths = totalUniquePaths * (directionsToBeTaken - rightwordDirections + i)/i;
        }
        return (int)totalUniquePaths;
    }
}
