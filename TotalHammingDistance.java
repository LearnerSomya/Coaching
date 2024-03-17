import java.io.*;
import java.util.*;
class TotalHammingDistance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] arrayEntred = new int[arraySize];
        for(int i = 0; i < arrayEntred.length; i++){
            arrayEntred[i] = scn.nextInt();
        }
        System.out.println(hammingDistance(arrayEntred));
    }
    public static int hammingDistance(int[] nums){
        int totalDistance = 0;
        for(int i = 0; i < 32; i++){
            int ones = 0;
            for(int everyNum : nums){
                ones += (everyNum >> i) & 1;
            }
            totalDistance += ones * (nums.length - ones);
            //System.out.println("total hamming" + totalDistance);
        }
        return totalDistance;
    }
}
