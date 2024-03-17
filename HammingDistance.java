import java.io.*;
import java.util.*;
class HammingDistance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ENter First Value");
        int firstValue = scn.nextInt();
        System.out.println("ENter Second Value");
        int secondValue = scn.nextInt();
        System.out.println("Hamming Distance is "+hammingDistanceBetweenValues(firstValue,secondValue));
    }
    public static int hammingDistanceBetweenValues(int x, int y){
        int count = 0;
        int result = x^y;
        while(result > 0){
            count += result & 1;
            result >>= 1;
        }
        return count;
    }
}
