import java.io.*;
import java.util.*;
class CountNSay {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer");
        int enterDigit = Integer.parseInt(br.readLine());
        HashMap<Integer,String> memo = new HashMap<>();
        System.out.println(IntegerCountNSay(enterDigit,memo));
    }
    //Approch One
    // static String IntegerCountNSay(int num){
    //     if(num == 1){
    //         return "1";
    //     }
    //     String previousResult = IntegerCountNSay(num - 1);
    //     StringBuilder result = new StringBuilder();
    //     int currentDigit = -1;
    //     int currentCount = 0;
    //     for(int i = 0; i < previousResult.length(); i++){
    //         int digitValue = Character.getNumericValue(previousResult.charAt(i));
    //         if(digitValue == currentDigit){
    //             currentCount++;
    //         } else{
    //             if(currentDigit != -1){
    //                 result.append(currentCount).append(currentDigit);
    //             }
    //             currentDigit = digitValue;
    //             currentCount = 1;
    //         }
    //     }
    //     if(currentDigit != -1){
    //         result.append(currentCount).append(currentDigit);
    //     }
    //     return result.toString();
    // }
    static String IntegerCountNSay(int num,HashMap<Integer,String> memo){
       
        if(num == 1){
            return "1";
        }
        if(memo.containsKey(num)){
            return memo.get(num);
        }
        String previousResult = IntegerCountNSay(num - 1,memo);
        StringBuilder result = new StringBuilder();
        //int currentDigit = -1;
        int currentCount = 0;
        for(int i = 0; i < previousResult.length(); i++){
            currentCount++;

            if(i == previousResult.length() - 1 || previousResult.charAt(i) != previousResult.charAt(i + 1)){
                result.append(currentCount).append(previousResult.charAt(i));
                currentCount = 0;
            }
        }
        String finalResult = result.toString();
        memo.put(num,finalResult);
        return finalResult;
    }
}
