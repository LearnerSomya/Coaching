import java.io.*;
import java.util.*;
class FindSingleValueInDuplicateArray {
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
        System.out.println(findSingleValueIndex(arrayEntre));
    }
    public static int findSingleValueIndex(int [] arr){
        int ans = -1;
        int left = 0;
        int right = arr.length;
        while(left < right){
            int mid = (left + right)/2;
            if(mid %2 == 0){                            //if mid value is even
                
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                if(arr[i] == arr[i+1]){
                    i++;
                } else{
                    ans = i+1;
                }
            }
        }
        return ans;
    }
}
