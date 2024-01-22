import java.io.*;
import java.util.*;
class DivideTwoIntegersWithoutUsingDividFunction {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int dividend = scn.nextInt();
        int divisor = scn.nextInt();
        DividingTwoIntigers(dividend, divisor);
        System.out.println(DividingTwoIntigers(dividend, divisor));
    }

    static int DividingTwoIntigers(int dividend, int divisor){
        //int sign  = 1; 
        int sign = (dividend < 0 && divisor < 0) || (dividend >= 0 && divisor >= 0) ? 1 : -1;
        if(dividend < 0 || divisor < 0){
            sign = -1;
        } else if (dividend < 0 && divisor < 0){
            sign = 1;
        } else {
            return 1;
        }
        // if(dividend == Integer.MIN_VALUE && divisor == -1){
        //     return Integer.MAX_VALUE;
        // }
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);
        int questiont = 0;
        
        while(absDividend >= absDivisor){
            absDividend -= absDivisor;
            questiont += 1;

        }
        System.out.println("questiont" + questiont);
        //return  sign * questiont;
        //return remaining;
        return sign*questiont;
    }
}
