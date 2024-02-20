import java.io.*;
import java.util.*;
class XORSumOfSubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] arrayEntred = new int[arraySize];
        for(int i = 0; i < arrayEntred.length; i++){
            arrayEntred[i] = scn.nextInt();
        }
        System.out.println(SumOFXorOfSubset(arrayEntred));
    }
    static int SumOFXorOfSubset(int[] input){
        int n = input.length;
        int result = 0;
        //making subsets
        for(int i = 0; i < (1<<n);i++){
            int XORValue = 0;
            for(int j = 0; j < n; j++){
                if((i & (1<<j)) != 0){
                    XORValue ^= input[j]; 
                }
            }
            result += XORValue;
        }
        return result;
    }
}
