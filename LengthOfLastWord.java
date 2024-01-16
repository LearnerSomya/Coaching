//Bosscoder Assignment
import java.io.*;
import java.util.*;
class LengthOfLastWord {
    public static void main(String[] args) throws Exception {
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        String sentance = brVal.readLine();
        LengthOfSentanceLastWord(sentance);
        System.out.println(LengthOfSentanceLastWord(sentance));
    }
    static int LengthOfSentanceLastWord(String sentance){
        int LastWord = 0;
        //LastWord = sentance.length();
        
        for(int i = sentance.length() - 1; i >= 0; i--){
            Character ch = sentance.charAt(i);
            //LastWord = sentance.length();
            if(ch != ' '){
                //LastWord = sentance.length();
                LastWord++;
            } else if(LastWord > 0){
                break;
            }
        }
        return LastWord;
    }
}
