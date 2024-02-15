import java.io.*;
import java.util.*;
class AngramString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String strOne = scn.nextLine();
        String strTwo = scn.nextLine();
        System.out.println(checkAnagram(strOne, strTwo));
    }
    static boolean checkAnagram(String str1, String str2){
        boolean flag = true;
		if(str1.length() != str2.length()){
            flag = false;
        }
        int[] indexerStrOne = new int[26];
        int[] indexerStrTwo = new int[26];
        for(int i = 0; i < str1.length(); i++){
           char currentCharOne = str1.charAt(i);
           char currentCharTwo = str2.charAt(i);
           if(currentCharOne >= 'a' && currentCharOne <= 'z'){
               indexerStrOne[currentCharOne - 'a']++;
           }
           if(currentCharTwo >= 'a' && currentCharTwo <= 'z'){
               indexerStrTwo[currentCharTwo - 'a']++;
           }

        }
       
        for(int a = 0; a < 26;a++){
            if(indexerStrOne[a] != indexerStrTwo[a]){
                flag = false;;
                break;
            }
        }

        return flag;

    }
}
