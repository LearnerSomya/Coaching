import java.io.*;
import java.util.*;
class MaxLengthSubarrayWithSumZero {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] ArrayEntred = new int[arraySize];
        for(int i = 0; i < ArrayEntred.length; i++){
            ArrayEntred[i] = scn.nextInt();
        }
        System.out.println(SubarrayWithSumZero(ArrayEntred));
    }
    static int SubarrayWithSumZero(int[] input){
        HashMap<Integer,Integer> indexes = new HashMap<>();
        int prefixSum = input[0];
        //if very first value is zero then ans will start with 1 and if not than with zero
        int ans = input[0] == 0 ? 1:0;
        indexes.put(prefixSum,0);
        //making prefixSum array
        for(int i = 1; i < input.length; i++){
            prefixSum += input[i];
            //checking if this current value in prefixSum already exist
            if(prefixSum == 0){
                ans = Math.max(ans, i+1);
            } 
            if(indexes.containsKey(prefixSum)){
                ans = Math.max(ans, i - indexes.get(prefixSum));
            } else{
                indexes.put(prefixSum,i);
            }
        }
        return ans;
    }
}
