import java.io.*;
import java.util.*;
class AlternativeSorting {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }
        int[] result = AlternativeSort(array);
        System.out.println(Arrays.toString(result));
    }
    static int[] AlternativeSort(int[] input){
        int n = input.length;
        int[] ans = new int[n];
        int maxValue = n - 1;
        int minValue = 0;
        int index = 0;
        while(minValue < maxValue){
            ans[index++] = input[maxValue];
            ans[index++] = input[minValue];
            maxValue--;
            minValue++;
        }
        if(n %2 != 0){
            ans[index] = input[minValue];
        }
        return ans;
    }
}
