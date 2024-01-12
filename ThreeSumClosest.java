import java.util.*;
import java.io.*;
class ThreeSumClosest {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraySize = scn.nextInt();
        int[] ArrayForValues = new int[arraySize];
        System.out.println("Enter values in array");
        for(int a =0; a < ArrayForValues.length; a++){
            ArrayForValues[a] = scn.nextInt();
        }
        System.out.println("Enter target");
        int targetFromUser = scn.nextInt();
        threeSum(ArrayForValues, targetFromUser);
        System.out.println(threeSum(ArrayForValues, targetFromUser));
    }
    public static int threeSum(int[] array, int target){
        List<List<Integer>> resultArrays = new ArrayList<>();
        Arrays.sort(array);
        int answer = 0;
        int gap = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            //int newTarget = target - array[i];
            int leftIndex = i + 1;
            int rightIndex = array.length - 1;
            while(leftIndex < rightIndex){
                int sum = array[leftIndex] + array[rightIndex] + array[i];
                if(sum < target){
                    if(target - sum < gap){
                        gap = target - sum;
                        answer = sum;
                    }
                    leftIndex++;
                } else if(sum > target){
                    if(sum - target < gap){
                        gap = sum - target;
                        answer = sum;
                    }
                    rightIndex--;
                } else{
                    //resultArrays.add(Arrays.asList(array[i], array[leftIndex], array[rightIndex]));
                    return target;
                }
            }
        }
        return answer;
        //return resultArrays;
    }
}
