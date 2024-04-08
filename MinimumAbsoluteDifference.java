import java.io.*;
import java.util.*;
class MinimumAbsoluteDifference {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] nums = new int[arraySize];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scn.nextInt();
        }
        List<List<Integer>> result = miniAbsoluteDiff(nums);
        System.out.println(result);
    }    
    public static List<List<Integer>> miniAbsoluteDiff(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> allRequiredPairs = new ArrayList<>();
        int minDifference = Integer.MAX_VALUE;
        //find miniimum difference
        for(int i = 1; i < nums.length; i++){
            minDifference = Math.min(minDifference, nums[i] - nums[i - 1]);
        }
        //find pair with minimun difference 
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i - 1] == minDifference){
                List<Integer> currentPair = new ArrayList<>();
                currentPair.add(nums[i - 1]);
                currentPair.add(nums[i]);
                allRequiredPairs.add(currentPair);
            }
        }
        return allRequiredPairs;
    }
}
