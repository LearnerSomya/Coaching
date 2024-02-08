//Bosscoder
import java.util.*;
import java.io.*;
public class BuildArrayFormPermutation {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }
        int[] result = PermutationArray(array);
        System.out.println(Arrays.toString(result));
    }
    static int[] PermutationArray(int[] input){
        int[] ans = new int[input.length];
        //when user enter values that is more then index array has
        // for(int i = 0; i < ans.length; i++){
        //     int indexs = input[i];
        //     if(indexs >= 0 && indexs < input.length){
        //         ans[i] = input[indexs];
        //     } else {
        //         ans[i] = -1;
        //     }
        // }

        //when user enters value till existing arrays
        for(int i = 0; i < ans.length; i++){
            ans[i] = input[input[i]];
        }
        return ans;
    }


    //Using List
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     List<Integer> nums = new ArrayList<>();
    //     int input;
    //     while((input = scn.nextInt()) != -1){
    //         nums.add(input);
    //     }
    //     List<Integer> result =  PermutationArray(nums);
    //     System.out.println(result);
    // }
    // static List<Integer> PermutationArray(List<Integer> input){
    //     int inputSize = input.size();
    //     List<Integer> ans = new ArrayList<>(inputSize);

    //     for(int i = 0; i < inputSize; i++){
    //         ans.add(input.get(input.get(i)));
    //     }
    //     return ans;
    // }
}
