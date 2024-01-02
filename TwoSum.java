import java.io.*;
import java.util.*;
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){
            for(int j = i+1; j < nums.length;j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                     //System.out.println(nums[]{i,j});
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter Array Values");
        for(int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }
        System.out.println("Enter Target");
        int target = scn.nextInt();
        int[] result = twoSum(array, target);
        //with using "result" directly in S.o.p. we get "[I@1b6d3586"
        //System.out.println(result);

        System.out.println(Arrays.toString(result));
    }
}

