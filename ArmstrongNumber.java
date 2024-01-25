import java.io.*;
import java.util.*;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(CheckAremstrong(num));
    }
    static boolean CheckAremstrong(int num){
        int originalValue = num;
        int value = 0;
        while(num != 0){
            int remainder = num % 10;
            int cubeValue = remainder * remainder * remainder;
            num = num /10;
            value += cubeValue;
        }
        return value == originalValue;
    }
}
