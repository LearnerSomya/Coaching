import java.io.*;
import java.util.*;
class PalindromNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        IsNumberPalindrom(num);
        System.out.println(IsNumberPalindrom(num));

    }
    public static boolean IsNumberPalindrom(int num){
        if(num < 0){
            return false;
        } else if(num == 0){
            return true;
        }
        int original = num;
        int remainder = 0;
        long answer = 0;
        while(num != 0){
            
            remainder = num % 10; // it wil give remainder
            num = num / 10; // it will give questiont
            answer = answer * 10 + remainder; 
        }

        return answer == original;
    }

}
