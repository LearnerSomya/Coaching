import java.io.*;
import java.util.*;
class FindPeekElemet {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("array size");
        int arraySize = Integer.parseInt(br.readLine());
        int[] arrayEnter = new int[arraySize];
        System.out.println("Array values");
        for(int i = 0; i < arrayEnter.length; i++){
            arrayEnter[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(PeekBetweenNeighbour(arrayEnter));
    }
    public static int PeekBetweenNeighbour(int[] nums){
        
        int left  = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = (left + right)/2;
            //check if currentv elemt is peek or not
            //checking its left side
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            } else{
            //check if currentv elemt is peek or not
            //checking its right side as mid + 1 is grater then nums[mid]
                left = mid + 1;
            }

            // if((nums[mid] < nums[mid + 1])){
            //     left = mid + 1;
            // } else{
            //     right = mid;
            // }
        }
        System.out.println("Index of " + nums[left] + " ");
        return left;
        // System.out.println("Index of " + nums[right] + " ");
        // return right;
    }
}
