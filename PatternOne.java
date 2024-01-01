import java.io.*;
import java.util.*;
class PatternOne {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size");
        int num = scn.nextInt();
        PrintPatternOne(num);
    }

    public static void PrintPatternOne(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
     
}