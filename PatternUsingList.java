import java.io.*;
import java.util.*;
class PatternUsingList {
    public static void main(String[] args)throws Exception {
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(brVal.readLine());
        List<String> result = new ArrayList<>();
        PatternForSquare(size);
        System.out.println(PatternForSquare(size));
        patternForRightAngleTriangle(size);
        System.out.println(patternForRightAngleTriangle(size));
    }
    static List<String> PatternForSquare(int n){
        List<String> pattern = new ArrayList<>();
        for(int i = 1 ; i <= n; i++){
            StringBuilder row = new StringBuilder();
            for(int j = 1; j <= n; j++){
                row.append("*");
                row.append("\n");
            }
        pattern.add(row.toString());
        }
        return pattern;
    }
    static List<String> patternForRightAngleTriangle(int n){
        List<String> patternTwo = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            StringBuilder row = new StringBuilder();
            for(int j = 1; j <= i; j++){
                row.append("*");
                row.append("\n");
            } 
            patternTwo.add(row.toString());
        }
        return patternTwo;
    }
}

