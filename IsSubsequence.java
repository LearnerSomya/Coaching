import java.io.*;
import java.util.*;
class IsSubsequence {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String you want to check in");
        String CheckIn = brVal.readLine();
        System.out.println("Enter String you want to check to");
        String ToCheck = brVal.readLine();
        IsSubsequence(CheckIn, ToCheck);
        System.out.println(IsSubsequence(CheckIn, ToCheck));
    }
    static boolean IsSubsequence(String CheckIn, String ToCheck){
         boolean flag = false;
        
        int i =0;
        int j = 0;
        while(i < ToCheck.length() && j < CheckIn.length()){
            if(CheckIn.charAt(j) == ToCheck.charAt(i)){
                i++;
            }
            j++;
        }
        if(i == ToCheck.length()){
            return flag = true;
        }
        return flag;
    }
}
