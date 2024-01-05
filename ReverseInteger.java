import java.util.*;
import java.io.*;
class ReverseInteger {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        result(num);
        System.out.println(result(num));
    }
    public static int result(int num){
        //if number is negative
        boolean neg = false;
        if(num < 0){
            //if number is negative then here we are turning "neg" flag as true
            neg = true;
            //taking mode of negitive number is always negative
            num = -num;
        }
        //took longe datatype so that if answere crosses its bit limit than "0" can be printed as answer
        long answer = 0;
        while(num != 0){
            int remainder = num % 10;
            answer = answer * 10 + remainder;
            num = num / 10;
        }

        if(neg){
            answer = -answer;
        }

        if(answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE){
            return 0;
        }
        //returning answer in int type as we made answer in long so here we are converting it
        return(int) answer;
    }
}
