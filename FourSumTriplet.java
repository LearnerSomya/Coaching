import java.io.*;
import java.util.*;
class FourSumTriplet {
    public static void main(String[] args) throws Exception {
        BufferedReader brVal = new BufferedReader(new InputStreamReader( System.in));
        int sizeOfArray = Integer.parseInt(brVal.readLine());
        int[] ArrayEntered = new int[sizeOfArray];
        for(int i = 0; i < ArrayEntered.length; i++){
            ArrayEntered[i] = Integer.parseInt(brVal.readLine());
        }
        int target = Integer.parseInt(brVal.readLine());
        FourSum(ArrayEntered, target);
        System.out.println(FourSum(ArrayEntered,target));
    }
    static List<List<Integer>> FourSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        HashSet <String> unique = new HashSet<>();
        for(int i = 0; i < nums.length - 3; i++){
            for(int j = i + 1; j < nums.length - 2; j++ ){
                int li = j + 1;
                int ri = nums.length - 1;
                while(li < ri){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[li];
                    sum += nums[ri];

                    if(sum < target){
                        li++;
                    } else if(sum > target){
                        ri--;
                    } else{
                        StringBuilder sb = new StringBuilder();
                        sb.append(nums[i]);
                        sb.append(nums[j]);
                        sb.append(nums[li]);
                        sb.append(nums[ri]);
                        String code = sb.toString();

                        if(unique.contains(code) == false){
                            unique.add(code);
                            result.add(Arrays.asList(nums[i],nums[j],nums[li],nums[ri]));
                        }
                        li++;
                        ri--;
                    }
                }

            }
        }
        return result;
    }
}
