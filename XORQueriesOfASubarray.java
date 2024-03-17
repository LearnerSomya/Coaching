import java.io.*;
import java.util.*;
class XORQueriesOfASubarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter array size");
        int arraySize = scn.nextInt();
        int[] arrayEntred = new int[arraySize];
        System.out.println("enter array size");
        for(int i = 0; i < arrayEntred.length; i++){
            arrayEntred[i] = scn.nextInt();
        }
        System.out.println("enter how many querie ranges you want to enter");
        int queriesCount= scn.nextInt(); 
        int[][] queries = new int[queriesCount][2];
        for(int i = 0; i < queries.length; i++){
            System.out.println("enter querie ranges you want to enter");
            for(int j = 0; j < 2; j++){
                queries[i][j] = scn.nextInt();
            }
        }
        int [] result = new int[queries.length];
        result = xorQueries(arrayEntred,queries);
        System.out.println(result);
    }
    public static int[] xorQueries(int[] arr, int [][] queries){
        int arrSize = arr.length;
        int[] prefixXORArray = new int[arrSize];
        //filling prefixXORArray
        prefixXORArray[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixXORArray[i] = prefixXORArray[i - 1] ^ arr[i];
        }

        int queriesSize = queries.length;
        //we want results for the mentioned queries
        int[] ansArray = new int [queriesSize];
        for(int q = 0; q < queriesSize; q++){
            int left = queries[q][0];
            int right = queries[q][1];
            //if left is zero then we have nothing to ^ with so just 
            //return prefixXORArray[right] value
            if(left == 0){
                ansArray[q] = prefixXORArray[right];
            } else{
                ansArray[q] = prefixXORArray[right] - prefixXORArray[left - 1];
            }
        }
        return ansArray;
    }
}
