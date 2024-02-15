import java.io.*;
import java.util.*;
class ReverseWordsInString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String sentance = scn.nextLine();
        //System.out.println(solve(sentance));
        solve(sentance);

    } 
    static String solve(String s){
        List<String> temp = new ArrayList<>();
        String str = "";
        for(int i = 0; i < s.length(); i++){
            //checking the characters
            if(s.charAt(i) == ' '){
                if(!str.isEmpty()){
                    temp.add(str);
                    str = "";
                }
            } else{
                str += s.charAt(i);
            }
        }
        temp.add(str);

        //StringBuilder reversed = new StringBuilder();
        for(int i = temp.size() - 1; i >= 0; i--){
            //printing them in reverse order
           System.out.print(temp.get(i) + " ");
           //reversed.append(temp.get(i)).append(" ");
        }
        String result = String.join(" ",temp);
        return result;
        //return reversed.toString().trim();
    }
}
