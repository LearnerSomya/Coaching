import java.io.*;
import java.util.*;
class SearchInTwoDMatrix {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Row");
        int matrixRow = Integer.parseInt(br.readLine());
        System.out.println("Enter Coloum");
        int matrixCol = Integer.parseInt(br.readLine());
        int[][] UserEntredMatrix = new int[matrixRow][matrixCol];
        System.out.println("Enter Matrix value");
        for(int i = 0; i < matrixRow; i++){
            System.out.println("Enter Matrix row " + i + " value");
            for(int j = 0; j < matrixCol; j++){
                System.out.println("Enter Matrix coloum " + j + " value");
                UserEntredMatrix[i][j] = Integer.parseInt(br.readLine());
            }
        }
        
        System.out.println("Entered Matrix is");
        for(int i = 0; i < matrixRow; i++){
            for(int j = 0; j < matrixCol; j++){
                System.out.print(UserEntredMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Entered Target");
        int target = Integer.parseInt(br.readLine());
        //Arrays.sort(UserEntredMatrix);
        System.out.println(TwoDMatrixSearch(UserEntredMatrix,target));

    }
    public static boolean TwoDMatrixSearch(int[][] num, int target){
        //finding potential row
        int row = PotentialRow(num, target);
        if(row == -1){
            return false;
        }

        boolean isFound = FindingTargetInPotentialRow(num, row, target);
        return isFound;
    }
    public static int PotentialRow(int[][] matrix, int target){
        int low = 0;
        int high = matrix.length - 1;
        int lastCol = matrix[0].length - 1; // getting last coloum place
        while(low <= high){
            int mid = (low + high)/2; //representing row
            if(target >= matrix[mid][0] && target <= matrix[mid][lastCol]){
                return mid; //this row is potential number
            } else if(matrix[mid][0] < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return -1; // if non of condition satisfy
    }

    //traversing in row
    public static boolean FindingTargetInPotentialRow(int[][] matrix, int row, int target){
        int left = 0;
        int right = matrix[0].length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(matrix[row][mid] == target){
                return true;
            } else if(matrix[row][mid] > target){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return false;
    }

}
