import java.io.*;
import java.util.*;
class CombinationSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] candidates = new int[arraySize];
        for(int i = 0; i < candidates.length; i++){
            candidates[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(AllCombinations(candidates, target));
    }
    public static List<List<Integer>> AllCombinations(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans, new ArrayList<>());
        return ans;
    }

    public static void findCombinations(int ind, int[] arr, int target,  List<List<Integer>> ans, List<Integer> ds){
        //base case
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }
}
