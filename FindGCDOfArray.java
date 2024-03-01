//Bosscoder and Leetcode
import java.io.*;
import java.util.*;
class FindGCDOfArray {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(br.readLine());
        int[] arrayEntred = new int[arraySize];
        for(int i = 0; i < arrayEntred.length; i++){
            arrayEntred[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Greatest Common Divisor is "+findGCD(arrayEntred));
    }

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int remainder = 0;
        int numsFirst = nums[0];
        int numsLast = nums[nums.length - 1];
        while(numsFirst % numsLast != 0){
            remainder = numsFirst % numsLast;
            numsFirst = numsLast;
            numsLast = remainder;
        }
        return numsLast;
    }
}
