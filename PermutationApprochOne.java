//leetcode
import java.io.*;
import java.util.*;
class PermutationApprochOne {
    public static void main(String [] args)throws Exception{
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
        //System.out.println(permute(arrayEnterd));
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> allPermutation = new ArrayList<>();
        List<Integer> sepratePermuations = new ArrayList<>();
        boolean[] freqArray = new boolean[nums.length];
        makePermutation(nums, allPermutation, sepratePermuations, freqArray);
        return allPermutation;
    }
    public static void makePermutation(int[] nums, List<List<Integer>> ans, List<Integer>sepratePermuations, boolean[] freqArr){
        if(sepratePermuations.size() == nums.length){
            ans.add(new ArrayList<>(sepratePermuations));
            return;
        }
        for(int i = 0; i < nums.length;  i++){
            if(!freqArr[i]){
                freqArr[i] = true;
                sepratePermuations.add(nums[i]);
                makePermutation(nums, ans, sepratePermuations, freqArr);
                sepratePermuations.remove(sepratePermuations.size() - 1);
                freqArr[i] = false;
            }
        }
    }
}
