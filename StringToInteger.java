import java.io.*;
import java.util.*;
class StringToInteger {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String");
        String enterString = scn.nextLine();
        StringToIntegerAtoi(enterString);
        System.out.println("String converted into integr " + StringToIntegerAtoi(enterString));

    }
    public static int StringToIntegerAtoi(String str){
        //trim the string so that if string has any spaces those will be removed
        str = str.trim();
        if(str.length() == 0){
            return 0;
        }

        // hadeling if string has "-" sign in start
        boolean neg = false;
        long answer = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            //checing if character at index 0 is "-" or "+"
            if(i == 0){
                if(ch == '-'){
                    neg = true;
                    continue;
                } else if(ch == '+'){
                    neg = false;
                    continue;
                }
            }
            //checking if character is between 0 or 9
            if(ch >= '0' && ch <= '9'){
                //here ch accuires ascii value so to return an number value we subtracted ascii value of 0 [49] from ch
                int digit = ch - '0';
                answer = answer * 10 + digit;
                
                if(neg){
                    long check = -answer;
                    //cheking if answer is less the minimum value [-2^31]
                    if(check < Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    } 
                } else{
                    //here we checking answer directly if its greater than maximum value [2^31 - 1]
                    if(answer > Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                }

            } else{ 
                //if character is not between 0 or 9 tha loop will break
                break;
            }

        }
        if(neg){
            answer = -answer;
        } 
        return (int) answer;
    }
}
