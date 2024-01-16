import java.io.*;
import java.util.*;
class RomanToInteger {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Roman number");
        String romanString = brVal.readLine();
        ConvertRomanToInteger(romanString);
        System.out.println(ConvertRomanToInteger(romanString));

    }
    public static int ConvertRomanToInteger(String romanString){
        int num = 0;
        int i = 0;

        while( i < romanString.length()){
            if(romanString.charAt(i) == 'M'){
                num += 1000;
            } else if(romanString.charAt(i) == 'D'){
                num += 500;
            } else if(romanString.charAt(i) == 'C'){
                num += 100;
            } else if(romanString.charAt(i)=='C' && i + 1 < romanString.length() && romanString.charAt(i + 1) == 'M'){
                num -= 100;
            }else if(romanString.charAt(i)=='C' && i + 1 < romanString.length() && romanString.charAt(i + 1) == 'D'){
                num -= 100;
            } else if(romanString.charAt(i) == 'L'){
                num += 50;
            } else if(romanString.charAt(i) == 'X'){
                num += 10;
            }else if(romanString.charAt(i)=='X' && i + 1 < romanString.length() && romanString.charAt(i + 1) == 'C'){
                num -= 10;
            } else if(romanString.charAt(i)=='X' && i + 1 < romanString.length() && romanString.charAt(i + 1) == 'L'){
                num -= 10;
            }else if(romanString.charAt(i) == 'V'){
                num += 5;
            } else if(romanString.charAt(i) == 'I'){
                num += 1;
            } else if(romanString.charAt(i)=='I' && i + 1 < romanString.length() && romanString.charAt(i + 1) == 'X'){
                num -= 1 ;
            } else if(romanString.charAt(i)=='I' && i + 1 < romanString.length() && romanString.charAt(i + 1) == 'V'){
                num -= 1;
            }
        }
        return num;
    }
    
    }

