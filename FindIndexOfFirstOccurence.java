import java.io.*;
import java.util.*;
class FindIndexOfFirstOccurence {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        String haystack = brVal.readLine();
        String needle = brVal.readLine();
        FindIndex(haystack, needle);
        System.out.println(FindIndex(haystack, needle));
    }
    public static int FindIndex(String haystack, String needle){
        int index = -1;
        if(haystack.length() == 0 || needle.length() == 0){
            return -1;
        }
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
       
        return -1;
    }
}
