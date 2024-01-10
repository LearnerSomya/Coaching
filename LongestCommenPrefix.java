import java.io.*;
import java.util.*;
class LongestCommenPrefix {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        int sizeOfStringArray = Integer.parseInt(brVal.readLine());
        String[] arrayOfStrings = new String[sizeOfStringArray];
        for(int i = 0; i < arrayOfStrings.length;i++){
            arrayOfStrings[i] = brVal.readLine();
        }
        String output = CommonPrefix(arrayOfStrings);
        System.out.println(output);

    }
    static String CommonPrefix(String[] str){
        //if length of string array is 0
        if(str.length == 0){
            return "";
        }
        int len = 0;
        while(true){
            //if length of string at 0 location of array is less then value of len
            if(len < str[0].length()){
                boolean charAreMatching = true;
                //in this characterAtIndex we are taking characters from first string of array, and then matching all 
                //rest of strings with the character of this string
                char characterAtIndex = str[0].charAt(len);
                //loop will move till the end of string array
                for(int a = 0; a < str.length; a++){
                    //if length of string at index a is less than len || character at location len of string at index a of array is not equal to characterAtIndex
                    if(len >= str[a].length() || str[a].charAt(len) != characterAtIndex){
                        charAreMatching = false;
                        break;
                    }
                }
                if(charAreMatching){
                    //if character are matching then increasing len and moving towards next character of 1st string
                    len ++;
                } else{
                    break;
                }
            } else{
                break;
            }
        }
        //substring that will be visible will be from 0 till len - 1 location
        return str[0].substring(0, len);
    }
}
