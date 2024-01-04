import java.io.*;
import java.util.*;
class LongestPalindromSubstring {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String palindromeString = scn.nextLine();
        boolean[][] array = new boolean[palindromeString.length()][palindromeString.length()];
        int LongestPalindromStart = 0;
        int LongestPalindromEnd = 0;

        for(int gap = 0; gap < palindromeString.length(); gap++){
            for(int start = 0, end = gap; end < array.length; start++, end++){
                if(gap == 0){
                    array[start][end] = true;
                    if(end - start > LongestPalindromEnd - LongestPalindromStart){
                        LongestPalindromStart = start;
                        LongestPalindromEnd = end;
                    }
                } else if(gap == 1){
                    if(palindromeString.charAt(start) == palindromeString.charAt(end)){
                        array[start][end] = true;
                        if(end - start > LongestPalindromEnd - LongestPalindromStart){
                            LongestPalindromStart = start;
                            LongestPalindromEnd = end;
                        }
                    } else{
                        array[start][end] = false;
                    }
                } else {
                    if(palindromeString.charAt(start) == palindromeString.charAt(end) && array[start + 1][end - 1] == true){
                        array[start][end] = true;
                        if(end - start > LongestPalindromEnd - LongestPalindromStart){
                            LongestPalindromStart = start;
                            LongestPalindromEnd = end;
                        }
                    } else {
                        array[start][end] = false;
                    }
                }
            }
        }
        System.out.println("Longest Plaindrom Substring " + palindromeString.substring(LongestPalindromStart, LongestPalindromEnd + 1));
    }
}
