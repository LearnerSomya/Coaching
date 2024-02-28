import java.io.*;
import java.util.*;
class NextPermutation {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(br.readLine());
        int[] arrayEnterd = new int[arraySize];
        for(int i = 0; i < arrayEnterd.length; i++){
            arrayEnterd[i] = Integer.parseInt(br.readLine());
        }

        int[] result = nextPermutation(arrayEnterd);
        System.out.println("Next Greater Permutation ");
        for(int permutations : result){
            System.out.print(permutations);
        }
      
    }

    public static int[] nextPermutation(int[] nums) {
        int numsSize = nums.length;
        //step 1 - find break point
        int ind = -1;
        for(int i = numsSize - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            } 
        }

        //if break point doesn't exist
        if(ind == -1){
            int start = 0;
            int end = nums.length - 1;
            while (start < end) {
                // int temp = nums[start];
                // nums[start] = nums[end];
                // nums[end] = temp;
                // start++;
                // end--;
                reverseArray(nums, start, end);
            }
            return nums;
        }

        //Step 2 : Find next greater element and swap it with arr[ind]
        for(int i = numsSize - 1; i > ind; i--){
            if(nums[i] > nums[ind]){
                int tempNP = nums[i];
                nums[i] = nums[ind];
                nums[ind] = tempNP;
                break;
            }
        }

        //step 3 : reverse the right half
        int start = ind + 1;
        int end = numsSize - 1;
        while(start < end){
            // int temp = nums[start];
            // nums[start] = nums[end];
            // nums[end] = temp;
            // start++;
            // end--;
            reverseArray(nums, start, end);
        }
        return nums;
    }

    public static void reverseArray(int[]nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
