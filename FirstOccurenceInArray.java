import java.io.*;
import java.util.*;
class FirstOccurenceInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("array size");
        int arraySize = scn.nextInt();
        int[] arrayEntre = new int[arraySize];
        System.out.println("Array Elements");
        for(int i = 0; i < arrayEntre.length; i++){
            arrayEntre[i] = scn.nextInt();
        }
        System.out.println("target");
        int target = scn.nextInt();
        System.out.println(findFirstOccurence(arrayEntre, target));
    }
    public static int findFirstOccurence(int[] arr,int target){
        int ans = -1;
        int left = 0;
        int right = arr.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                ans = mid;
                right = mid - 1;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
