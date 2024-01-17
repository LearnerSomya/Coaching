//RECURSION
import java.io.*;
import java.util.*;
class LetterCombinatioOfPhoneNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        String numberString = brVal.readLine();
        LetterCombination(numberString);
        System.out.println(LetterCombination(numberString));
    }
    public static List<String> LetterCombination(String digits){
        if(digits.length() == 0){
            return new ArrayList<>();//returning empty array list
        }
        return getLetterCombination(digits, 0);
    }

    static String[] alphabateCode = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //Using Reursion and Faith 
    static List<String> getLetterCombination(String digits, int index){
        if(index == digits.length()){
            List<String> baseResult = new ArrayList<>();
            baseResult.add(""); //this will add blank as empty string aloso has 1 output i.e. blank, this "" will work for very right number of string user entred => "" + a = a, ""+b = b, ""+c = c => a+g = ag and so on
            return baseResult;
        }
        //so her we start valuation from index + 1 location
        List<String> myResult = new ArrayList<>();//in this list we will hold our result
        List<String> recursionResult = getLetterCombination(digits, index + 1); //if we got 234 the first we have fath that we calculate answer of 
        char characterAtStartingIndex = digits.charAt(index);//here we are calculating value which is befor 34 i.e. 2 here
        String code = alphabateCode[characterAtStartingIndex - '0']; //this will conatin alphabates at the numbers //here when we pass a integr that integewr ois not pass but its ascii value is passed
        //and subtrating 0 from them will give actual integer we pass as string 

        for(String recString: recursionResult){ 
            for(int i = 0; i < code.length(); i++){ // here we are getting value in code i.e. alphabates
                char charaterCode = code.charAt(i);
                myResult.add(charaterCode + recString);
            }
        }
        return myResult;
    } 
}
