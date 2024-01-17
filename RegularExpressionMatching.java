//theory of automata
//import java.beans.Expression;
import java.io.*;
import java.util.*;
class RegularExpressionMatching {
    public static void main(String[] args) throws Exception {
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        String string = brVal.readLine();
        System.out.println("Enter Pattern");
        String pattern = brVal.readLine();
        isMatch(string, pattern);
        System.out.println(isMatch(string, pattern));

    }

    public static boolean isMatch(String str, String pat){
        //string is toward rows and pattern is towards coloumn
        boolean[][] dynamicProgram = new boolean[str.length() + 1][pat.length() + 1];
        int maxRow = dynamicProgram.length - 1;
        int maxCol = dynamicProgram[0].length - 1;
        for(int i = 0; i <= maxRow; i++){
            for(int j = 0; j <= maxCol; j++){
                //for first cell of dp
                if(i == 0 && j == 0){
                    //blank string matches blank pattern
                    dynamicProgram[i][j] = true;
                } else if(i == 0){
                //for first row of dp 
                    char characterPattern = pat.charAt(j - 1);
                    //if pattern character is "*" then we will check 2 coloums back [its positive in row 0] means * is matching with _/./blank nothing
                    if(characterPattern == '*'){
                        dynamicProgram[i][j] = dynamicProgram[i][j - 2];
                    } else{
                        dynamicProgram[i][j] = false;
                    }
                } else if(j == 0){
                    //for first coloumn of dp
                    dynamicProgram[i][j] = false;
                } else{
                    //for rest of dp 
                    char characterAtPattern = pat.charAt(j - 1);
                    char characterAtString = str.charAt(i - 1);

                    if(characterAtPattern == '*'){
                         dynamicProgram[i][j] = dynamicProgram[i][j - 2];

                         char characterPrevious = pat.charAt(j - 2);
                         if(characterPrevious == '.' || characterPrevious == characterAtString){
                            // let pattern by xyz* ann string be xz, then elaborate pattern xyz* as xyzz* and compaire 
                            //it with xz then z of string is cut bu z of pattern and we are left with x of string and xyz* of pattern
                            dynamicProgram[i][j] |= dynamicProgram[i - 1][j];
                         }
                    } else if(characterAtPattern == '.'){
                        //. stands for nothic or it matches with any single character
                        dynamicProgram[i][j] = dynamicProgram[i - 1][j- 1];
                    } else if( characterAtPattern == characterAtString){
                        dynamicProgram[i][j] = dynamicProgram[i - 1][j- 1];
                    } else{
                        dynamicProgram[i][j] = false;
                    }
                }
            }
        }
        return dynamicProgram[maxRow][maxCol];
    }
}
