import java.io.*;
import java.util.*;
class SmallestGoodBase {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter valuse whose smallest good base you want to find");
        String enterValue = br.readLine();
        System.out.println(smallestGoodBaseOfValue(enterValue));
    }
    public static String smallestGoodBaseOfValue(String n){
        //taking long datatype as we are givin limit of 10^18 which when writen for 2 is 2^63 or 2^64 approx
        //and long has capacity of holding intiger till 64 bit
        long nToNum = Long.parseLong(n);
        //we have limit in 2^64 means at max loop will run for 63 time to get smallest base possible
        for(int i = 63; i >= 0; i--){
            long low = 2; //smallest base possible
            long high = nToNum - 1; //greatest base possible for any value to be presented in "111" or 
            //all bits set is just number preceding entred
            while(low <= high){
                long mid = low + (high - low)/2;
                long sum = 0; //1*m^0 + 1*m^1 + 1*m^2 + ...
                long startingValue = 1; // 1*m^0  = 1
                long flag = 0;
                for(int j = 0; j <= i; j++){
                    sum += startingValue;
                    //if sum exceeds from entred value than we dont need it
                    if(sum >= nToNum){ 
                        break;
                    } else if(j < i && (nToNum - sum)/mid < startingValue){
                        flag = 1;
                        break;
                    } else if(j < i){
                        startingValue *= mid;
                    }
                }
                if(sum > nToNum || flag == 1){
                    high = mid - 1;
                } else if( sum < nToNum){
                    low = mid + 1;
                } else{
                    return Long.toString(mid);
                }
            }
        }
        return "";
    }
}
