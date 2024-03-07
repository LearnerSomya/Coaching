import java.io.*;
import java.util.*;
class TrailingZerosInFactorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Factorial Value whos Trailing Zeros you want to check");
        int enterFactorialValue = scn.nextInt();
        System.out.println("Total Trailing Zeros in factorial of " + enterFactorialValue + " is " + NumberOfTrailingZeros(enterFactorialValue));
    }
    public static int NumberOfTrailingZeros(int n){
        int sum = 0;
        while(n / 5 > 0){
            sum += n / 5;
            n /= 5;
        }
        return sum;
    }
}
