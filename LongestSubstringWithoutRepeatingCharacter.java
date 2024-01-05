// count of character that are in longest substring
import java.io.*;
import java.util.*;
class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String enterStr = scn.next();
        LongestSubstringWithoutRepeatingChar(enterStr);
        System.out.println(LongestSubstringWithoutRepeatingChar(enterStr));

    }

    public static int LongestSubstringWithoutRepeatingChar(String str){
        int i = 0;
        int j = -1;
        int MaxLength = 0;
        int Currentlength = 0;
        //making an array using boolean in which we will use ascii values/ heash map concept
        boolean[] space = new boolean[256];
        while(i < str.length()){
            char chToAccapt = str.charAt(i);
            //hadleing duplicasy with releasing the value which is duplicating
            while(space[chToAccapt] == true){
                j++;
                char charToRelease = str.charAt(j);
                space[charToRelease] = false;
            }

            space[chToAccapt] = true;
            Currentlength = i - j;
            if(Currentlength > MaxLength){
                MaxLength = Currentlength;
            }
            i++;
            //MaxLength = Math.max(MaxLength, i - j);
        }
        return MaxLength;
    }
}
