import java.io.*;
import java.util.*;
class Palindrom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(PalindromString(str));
    }
    static boolean PalindromString(String palindrome){
        boolean flag = true;
        int start = 0;
        int end = palindrome.length() - 1;
        while(start < end){
            // if(palindrome.charAt(start) == palindrome.charAt(end)){
            //     start++;
            //     end--;
            //     count += 2;
            // }
            if(palindrome.charAt(start) != palindrome.charAt(end)){
                return flag = false;
            }
            start++;
            end--;
        }
        
        // return count == palindrome.length(); 
        return flag = true;
    }
}
