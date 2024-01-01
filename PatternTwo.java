import java.io.*;
import java.util.*;
class PatternTwo {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size");
        int num = scn.nextInt();
        PrintPatternTwo(num);
    }

    public static void PrintPatternTwo(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
