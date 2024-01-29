//checking if all alphabat of english exist in the string
import java.io.*;
import java.util.*;
class SentenceIsPangram {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        String UserEnterSentnce = brVal.readLine();
        System.out.println(Pangram(UserEnterSentnce));
    }
    static boolean Pangram(String EntredString){
        Boolean[] checkArray = new Boolean[26];
        for(int i = 0; i < EntredString.length();i++){
            //checking if the current character is character 
            char currentChar = EntredString.charAt(i);
            if(currentChar >= 'a' && currentChar <= 'z'){
                checkArray[currentChar - 'a'] = true; // subtracting 'a' ascii value from currentChar value to get a value which will togle thar array of that very index
            }
        }
        for(boolean isPresent : checkArray){
            if(!isPresent){
                return false;
            }
        }
        return true;
    }
}
