import java.io.*;
import java.util.*;
class FirstNLastIndexOfElementInSortedArray {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size");
        int arraySize = Integer.parseInt(brVal.readLine());
        System.out.println("Enter Values");
        int[] nums = new int[arraySize];
        for(int i =0; i < nums.length;i++){
            nums[i] = Integer.parseInt(brVal.readLine());
        }
        System.out.println("Enter Target");
        int target = Integer.parseInt(brVal.readLine());
        int[] result = IndexArray(nums,target);
         System.out.print("[" + result[0] + "," + result[1] + "]\n");
       
    }
    static int[] IndexArray(int[] nums, int target){
        //List<Integer> locationArray = new ArrayList<>();
        int[] locationArray = new int[2];
        locationArray[0] = -1;
        locationArray[1] = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target == nums[mid]){
                int left = mid;
                while(left >= low && nums[left] == target){
                    left--;
                } 
                int right = mid;
                while(right <= mid && nums[right] == target){
                    right++;
                }
                locationArray[0] = left + 1;
                locationArray[1] = right - 1;
                return locationArray;
            } else if(target > nums[mid]){
                low = mid + 1;
            } else if(target < nums[mid]){
                high = mid - 1;
            }
        }
        return locationArray;
    }
}
