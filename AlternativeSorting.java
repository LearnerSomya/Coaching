import java.io.*;
import java.util.*;
class AlternativeSorting {
    // public static void main(String[] args){
    //     Scanner scn = new Scanner(System.in);
    //     System.out.println("Enter Array Size");
    //     int arraySize = scn.nextInt();
    //     int[] array = new int[arraySize];
    //     for(int i = 0; i < array.length; i++){
    //         array[i] = scn.nextInt();
    //     }
    //     int[] result = AlternativeSort(array);
    //     System.out.println(Arrays.toString(result));
    // }
    // static int[] AlternativeSort(int[] input){
    //     Arrays.sort(input);
    //     //System.out.println(Arrays.toString(input));
    //     int n = input.length;
    //     int[] ans = new int[n];
    //     int maxValue = n - 1;
    //     int minValue = 0;
    //     int index = 0;
    //     while(minValue < maxValue){
    //         ans[index++] = input[maxValue];
    //         ans[index++] = input[minValue];
    //         maxValue--;
    //         minValue++;
    //     }
    //     if(n %2 != 0){
    //         ans[index] = input[minValue];
    //     }
    //     return ans;
    // }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        int input;
        while((input = scn.nextInt()) != -1){
            array.add(input);
        }
        List<Integer> result = AlternativeSort(array);
        System.out.println(result);
    }
    static List<Integer> AlternativeSort(List<Integer> input){
        Collections.sort(input);
        System.out.println(input);
        List<Integer> nums = new ArrayList<>();
        int n = input.size();
        int index = 0;
        int maxValue = n - 1;
        int minValue = 0;
        while(minValue < maxValue){
            nums.add(input.get(maxValue));
            nums.add(input.get(minValue));
            maxValue--;
            minValue++;
        }

        if(n % 2 != 0){
            nums.add(input.get(minValue));
        }
        return nums;
    }
}
