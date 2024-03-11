import java.io.*;
import java.util.*;
class CombinationSumII {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("array size");
        int arraySize = Integer.parseInt(br.readLine());
        int[] candidates = new int[arraySize];
        System.out.println("candidates");
        for(int i = 0; i < candidates.length; i++){
            candidates[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("target");
        int target = Integer.parseInt(br.readLine());
        System.out.println(AllCombinations(candidates,target));
    }
    public static List<List<Integer>> AllCombinations(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates, target, ans, new ArrayList<>());
        return ans;
    }
    public static void findCombinations(int ind, int[] arr, int target,List<List<Integer>> ans, List<Integer> ds){
        //base case
        if(target == 0){
            ans.add(new ArrayList<>(ds));
        }

        //recursive call
        for(int i = ind; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i - 1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            ds.add(arr[i]);
            findCombinations(ind + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1)
;        }
    } 
}
