import java.io.*;
import java.util.*;
class CountPalindromSubstring {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        //taking user enters string
        System.out.println("Enter string you want to check");
        String palindromeString = scn.nextLine();

        //using Dynamic Programing concepts
        //made 2D array so tha could check palindroms in dialgoly backword index
        boolean[][] array = new boolean[palindromeString.length()][palindromeString.length()]; 
        int count = 0;

        int LongestPalindromStart = 0;
        int LongestPalindromEnd = 0;
        //gap will always be less than length of string as we count in normal first character is at position 1 in real life and it its last characher ends at we prograss
        //like 5- 1 = 4 it will include 5 characters  
        for(int gap = 0; gap < palindromeString.length(); gap++){
            // int start = 0;
            // int end = start + gap;

            for(int start = 0, end = gap; end < array.length; start++,end++){
                if(gap == 0){
                    //all characters at gap 0 means are single characters and single characters are always palindrome
                    array[start][end] = true;
                    if(end - start > LongestPalindromEnd - LongestPalindromStart){
                        LongestPalindromStart = start;
                        LongestPalindromEnd = end;
                    }
                    System.out.println(palindromeString.substring(start, end + 1));
                    
                } else if(gap == 1){
                    if(palindromeString.charAt(start) == palindromeString.charAt(end)){
                        array[start][end] = true;
                        if(end - start > LongestPalindromEnd - LongestPalindromStart){
                            LongestPalindromStart = start;
                            LongestPalindromEnd = end;
                    }
                        System.out.println(palindromeString.substring(start, end + 1));
                        
                    } else {
                        array[start][end] = false;
                    }
                } else{
                    //all characters that has gap more than 1 are hadled in this
                    if(palindromeString.charAt(start) == palindromeString.charAt(end) && array[start + 1][end - 1] == true){
                        array[start][end] = true;
                        if(end - start > LongestPalindromEnd - LongestPalindromStart){
                            LongestPalindromStart = start;
                            LongestPalindromEnd = end;
                        }
                        System.out.println(palindromeString.substring(start, end + 1));
                    } else {
                        array[start][end] = false;
                    }
                }
                if(array[start][end]){
                    count++;
                }
            }
        }
        System.out.println("Count of Palindrom Substrings " + count);
        System.out.println("Longest Palindrom Substring "+palindromeString.substring(LongestPalindromStart, LongestPalindromEnd + 1));
        //System.out.println(palindromeString);

    }
}
