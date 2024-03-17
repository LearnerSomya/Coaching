import java.io.*;
import java.util.*;
class JumpGameII {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("array size");
        int arraySize = scn.nextInt();
        int[] jumpsArray = new int[arraySize];
        System.out.println("jumps");
        for(int i = 0; i < jumpsArray.length; i++){
            jumpsArray[i] = scn.nextInt();
        }
        System.out.println(jump(jumpsArray,arraySize));
    }
    public static int jump(int[] nums,int arraySize) {
        //int numsSize = nums.length;
        int[] dp = new int[arraySize + 1];
        dp[arraySize] = 0;
        for(int p = arraySize - 2; p >= 0; p--){
            if(nums[p] > 0){
                int minimumValue = Integer.MAX_VALUE;
                for(int q = 1; q <= nums[p] && p+q < dp.length; q++){
                    if(dp[p+q] != Integer.MAX_VALUE){
                        minimumValue = Math.max(minimumValue, dp[p+q]);
                    }
                }
                if(minimumValue != Integer.MAX_VALUE){
                    dp[p] = minimumValue + 1;
                }
            }
        }
        return dp[0];
    }
}
