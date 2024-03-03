//Leetcode
import java.io.*;
import java.util.*;

class CheckIfArrayPairsAreDivisibleByK {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(br.readLine());
        int[] arrayEntred = new int[arraySize];
        for(int i = 0; i < arrayEntred.length; i++){
            arrayEntred[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("enter value of k");
        int divisor = Integer.parseInt(br.readLine());
        System.out.println(PairsCanArrange(arrayEntred, divisor));
    }

    public static boolean PairsCanArrange(int[] nums, int k){
        HashMap<Integer, Integer> remainderFreq = new HashMap<>();
        for(int val : nums){
            //handling negative inputs in array
            int remainder = (val % k + k) % k;
            int olderFreq = remainderFreq.getOrDefault(remainder , 0);
            remainderFreq.put(remainder, olderFreq + 1);
        }

        for(int val : nums){
            int rem = (val % k + k) % k;
            if(rem == 0 || 2 * rem == k){
                int freq = remainderFreq.get(rem);
                if(freq % 2 == 1){
                    return false;
                }
            } else{
                int freq = remainderFreq.get(rem);
                int otherFreq = remainderFreq.getOrDefault(k - rem, 0);
                if(freq != otherFreq){
                    return false;
                }
            }
        }
        return true;
    } 
}
