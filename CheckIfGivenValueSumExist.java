import java.io.*;
import java.util.*;
class CheckIfGivenValueSumExist {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] arrays = new int[arraySize];
        for(int i = 0; i < arrays.length;i++){
            arrays[i] = scn.nextInt();
        }
        int maxOfArray = 0;
        for(int j = 0; j < arrays.length; j++){
            int currentMax = arrays[j];
            maxOfArray = Math.max(maxOfArray, currentMax); 
        }
        
        boolean[] attend = new boolean[maxOfArray + 1];
        for(int a = 0; a < attend.length; a++){

            attend[a] = false;
        }
    }
}
