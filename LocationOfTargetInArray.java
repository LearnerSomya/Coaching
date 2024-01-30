import java.io.*;
import java.util.*;
class LocationOfTargetInArray {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(brVal.readLine());
        int[] nums = new int[arraySize];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(brVal.readLine());
        }
        System.out.println("Enter value by which you want to roate the array");
        int rotateArrayTimes = Integer.parseInt(brVal.readLine());
        System.out.println("enter target value you want search in array");
        int target = Integer.parseInt(brVal.readLine());
        int[] rotatedArray = RotateTheArray(nums,rotateArrayTimes);

        LocationSearch(rotatedArray, target);
        System.out.println( LocationSearch(rotatedArray, target));
    }

    static int[] RotateTheArray(int[] nums, int timeToRotate){
        timeToRotate = timeToRotate % nums.length;
        //part 1 
        ReverseTheArray(nums, 0, nums.length - timeToRotate - 1);

        //part 2
        ReverseTheArray(nums, nums.length - timeToRotate, nums.length - 1);
        return nums;
    }
    static void ReverseTheArray(int[] nums, int i, int j){
        //reverse the array code
        i = 0; 
        j = nums.length - 1;
        while( i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    static int LocationSearch(int[] RotatedArray,int target){
        int low = 0;
        int high = RotatedArray.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(RotatedArray[mid] == target){
                return mid;
            } else if(RotatedArray[mid] >= RotatedArray[low]){ //left side is sorted
                if(target >= RotatedArray[low] && target <= RotatedArray[mid]){
                    high = mid - 1;
                } else{
                    low = mid + 1;
                }
            } else if( RotatedArray[mid] <= RotatedArray[high]){
                if(target >= RotatedArray[mid] && target <= RotatedArray[high]){
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }
        }
        return RotatedArray[low] == target ? low : -1;
    } 
}
