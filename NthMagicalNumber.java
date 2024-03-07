import java.io.*;
import java.util.*;
class NthMagicalNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a");
        int aValue = Integer.parseInt(br.readLine());
        System.out.println("Enter b");
        int bValue = Integer.parseInt(br.readLine());
        System.out.println("Enter which nth Magical number you want to check");
        int NthValue = Integer.parseInt(br.readLine());
        System.out.println(calculatingNthMagicalNumber(aValue, bValue, NthValue));
    }
    public static int calculatingNthMagicalNumber(int a, int b, int n){
        long PowerToHandle = (long)(Math.pow(10,9)+7);
        //System.out.println(PowerToHandle);
        //long mod = PowerToHandle + 7;
        //long mod = 1000000007;
        long lowerLimit = Math.min(a,b);
        long higherLimit = lowerLimit * n;
        while(lowerLimit < higherLimit){
            long midValue = lowerLimit + (higherLimit - lowerLimit) / 2;
            long count = (midValue/a) + (midValue/b) - midValue/LCM(a, b);
            if(count >= n){
                higherLimit = midValue;
            } else{
                lowerLimit = midValue + 1;
            }
        }
        //return (int) (lowerLimit % PowerToHandle);
        return (int)(lowerLimit % PowerToHandle);
    }

    public static int LCM(int a, int b){
        return (a*b)/GCD(a,b);
    }
    public static int GCD(int a, int b){
        while(a % b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return b;
    }
}
