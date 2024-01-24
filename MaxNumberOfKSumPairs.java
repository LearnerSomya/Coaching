import java.util.*;
import java.io.*;

class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] nums = new int[arraySize];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(SumPairs(nums, k));
    }
    static int SumPairs(int[] nums, int k){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){

            System.out.print(nums[i]);
        }
        int l = 0; 
        int r = nums.length - 1;
        int operations = 0;
        while(l < r){
            int sum = nums[l] + nums[r];
            //System.out.println( "sum" + sum);
            if(sum == k){
                operations++;
                l++;
                r--;
            } else{
                if(sum > k){
                    r--;
                } else if(sum < k){
                    l++;
                }
            }
        }
        //System.out.println();
        return operations;
    }
}
