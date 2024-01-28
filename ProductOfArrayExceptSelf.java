import java.io.*;
import java.util.*;
class ProductOfArrayExceptSelf {
    public static void main(String[] args) throws Exception {
       BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
       int numsArraySize = Integer.parseInt(brVal.readLine());
       int[] numsArray = new int[numsArraySize];
       for(int i = 0; i < numsArray.length; i++){
        numsArray[i] = Integer.parseInt(brVal.readLine());
       }

    //    int result[] = ProductArray(numsArray);
    //    System.out.println(Arrays.toString(result;));
    System.out.println(Arrays.toString(ProductArray(numsArray)));
       
    }

    static int[] ProductArray(int[] nums){
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] answer = new int[n];

        leftProduct[0] = 1;
        for(int i = 1; i < n; i++){
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        rightProduct[n - 1] = 1;
        for(int i = n - 2; i >= 0;i--){
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }

       for(int i = 0; i < n;i++){
        answer[i] = leftProduct[i] * rightProduct[i];
       }

       return answer;
    }
}
