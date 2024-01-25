import java.io.*;
import java.util.*;
class MaxNoOfVowelsInSubstringofGivenLength {
    public static void main(String[] args) throws Exception {
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        String EnteredString = brVal.readLine();
        int LengthOfSubstring = Integer.parseInt(brVal.readLine());
        System.out.println(VowelsInSubstring(EnteredString, LengthOfSubstring));
    }
    static int VowelsInSubstring(String entredString, int lengthOfSubstring){
        int maxVowelCount = 0;
        int count = 0;

        for(int i = 0; i < lengthOfSubstring; i++){
            if(isVowel(entredString.charAt(i))){
                count++;
            }
        }
        maxVowelCount = count;
        //make a sliding window of size lengthOfSubstring, so that we could calculate maximum vowels in a substring.
        for(int start = lengthOfSubstring; start < entredString.length(); start++){
            // check if character acurired is vowel then increase count
            if(isVowel(entredString.charAt(start))){
                count++;
            }
            //check if released character was vowel then decrease count 
            if(isVowel(entredString.charAt(start - lengthOfSubstring))){
                count--;
            }
            maxVowelCount = Math.max(maxVowelCount, count);
        }
        return maxVowelCount;
    }
    static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}
