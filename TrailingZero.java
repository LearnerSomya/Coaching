import java.io.*;
import java.util.*;
class TrailingZero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
    }
    static int solve(int n){
        int count = 0;

       // Iterate through the bits of the binary representation
       while (n > 0 && (n & 1) == 0) {
           // Increment count for each trailing zero
           count++;
           n >>= 1; // Right shift N to move to the next bit
       }

       return count;
   }
}
