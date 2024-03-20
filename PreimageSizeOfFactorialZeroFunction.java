import java.io.*;
import java.util.*;
class PreimageSizeOfFactorialZeroFunction {
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int enteredZerosCount = Integer.parseInt(br.readLine());
        System.out.println(preimageSizeFZF(enteredZerosCount));
    }
    public static int preimageSizeFZF(int k) {
        long start = 0;
        long end = Long.MAX_VALUE;
        while(start <= end){
            long mid = (start + end)/2;
            long x = ZeroCount(mid);
            if(x == k){
                return 5;
            } else if( x > k){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return 0;
    }

    public static long ZeroCount(long mid){
        long ans = 0;
        long x = 5; //as for every zero count we have 5 values at max
        while(x <= mid){
            ans += mid/x;
            x = x*5;
        }
        return ans;
    }
}
