//leetcode 
import java.io.*;
import java.util.*;
class PermutationTwo {
    public static void main(String[]  args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(br.readLine());
        int[] arrayEnterd = new int[arraySize];
        for(int i = 0; i < arrayEnterd.length; i++){
            arrayEnterd[i] = Integer.parseInt(br.readLine());
        }
        List<List<Integer>> result = permute(arrayEnterd);
        for(List<Integer> permutations : result){
            System.out.println(permutations);
        }
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> allPermutation = new ArrayList<>();
        List<Integer> sepratePermutation = new ArrayList<>();
        boolean[] freqArr = new boolean[nums.length];
        Arrays.sort(nums);
        makePermutations(nums,allPermutation,sepratePermutation,freqArr);
        return allPermutation;
    }

    public static void makePermutations(int[] nums, List<List<Integer>> allPermutations, List<Integer> sepratePermutation, boolean[] freq){
        if(sepratePermutation.size() == nums.length){
            allPermutations.add(new ArrayList<>(sepratePermutation));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!freq[i]){
                if(i > 0 && nums[i] == nums[i - 1] && !freq[i - 1]){
                    continue;
                }
                freq[i] = true;
                sepratePermutation.add(nums[i]);
                makePermutations(nums, allPermutations, sepratePermutation, freq);
                sepratePermutation.remove(sepratePermutation.size() - 1);
                freq[i] = false;
            }
        }
    } 
}
