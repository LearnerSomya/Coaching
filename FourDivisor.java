//leetcode and bosscoder
import java.io.*;
import java.util.*;
class FourDivisor {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter array size");
        int arraySize = Integer.parseInt(br.readLine());
        int[] arrayEntred = new int[arraySize];
        System.out.println("enter array elements");
        for(int i = 0; i < arrayEntred.length; i++){
            arrayEntred[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(IntegerWithExactFourDivisor(arrayEntred));
    }
    public static int IntegerWithExactFourDivisor(int[] nums){
        //with more time complexity
        int sum = 0;
        for(int arrValue : nums){
            int divisorCount = 0;
            int divisorSum = 0;
            for(int findDivisor = 1; findDivisor <= arrValue; findDivisor++){
                if(arrValue % findDivisor == 0){
                    divisorCount++;
                    divisorSum += findDivisor;
                }
                if(divisorCount> 4){
                    break;
                }
            }
            if(divisorCount == 4){
                sum += divisorCount;
            } else{
                break;
            }
        }
        return sum;
    }
}