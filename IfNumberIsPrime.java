//Bosscoder
import java.io.*;
import java.util.*;
class IfNumberIsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(PrimeNumber(number));
    }
    static boolean PrimeNumber(int number){
        //when initialised boolean is false by default
        boolean flag = true;
        for(int i = 2 ; i*i <= number; i++){
            flag = false;
        }
        return flag;
    }
}
