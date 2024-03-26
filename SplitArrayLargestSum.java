import java.io.*;
import java.util.*;
class SplitArrayLargestSum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(br.readLine());
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        int splitInto = Integer.parseInt(br.readLine());

    }
    public static int LeastMaxSumPossible(int[] nums, int splitInto){
        int leastMaxSum = 0;
        int heighestMaxSum = 0;
        for(int val : nums){
            leastMaxSum = Math.max(leastMaxSum, val);
            heighestMaxSum += val;
        }
        if(nums.length == splitInto){
            return leastMaxSum;
        }

        int low = leastMaxSum;
        int height = heighestMaxSum;
        int leastMaxSumOfSubarray = 0;
        while(low <= height){
            int mid = low +(height - low)/2;
            if(isPossibleToMinimize(nums, splitInto, mid)==true){
                leastMaxSumOfSubarray = mid;
                height = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return leastMaxSumOfSubarray;
    }
    public static boolean isPossibleToMinimize(int[] nums, int splitInto, int mid){
        int splitValue = 1;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > mid){
                splitValue++;
                sum = nums[i];
            }
        }
        return splitValue <= splitInto;
    }
}
