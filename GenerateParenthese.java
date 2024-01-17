import java.io.*;
import java.util.*;
class GenerateParenthese {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of pairs");
        int numberOfPairs = Integer.parseInt(brVal.readLine());
        System.out.println(GeneratingParanthese(numberOfPairs));

    }
    @SuppressWarnings("unchecked")
    public static List<String> GeneratingParanthese(int numOfPair){
        List<String>[] ResultDP = new List[numOfPair + 1];
        ResultDP[0] = Arrays.asList(""); //empty as 0 will give empty 
        ResultDP[1] = Arrays.asList("()"); // for 1 it will generate on pair type 
        //forn here we are starting evaluation
        for(int i = 2; i <= numOfPair; i++){
            ResultDP[i] = new ArrayList<>();
            int innerPairsInsideParenthese = i - 1; //pairs inside "( )""
            int outerPairsOfParenthese = 0; //pairs out of first "()"
            while(innerPairsInsideParenthese >= 0 && outerPairsOfParenthese <= i- 1){
                for(String inner : ResultDP[innerPairsInsideParenthese]){
                    for(String outer : ResultDP[outerPairsOfParenthese]){
                        StringBuilder sb = new StringBuilder();
                        sb.append("(");
                        sb.append(inner);
                        sb.append(")");
                        sb.append(outer);
                        ResultDP[i].add(sb.toString());//collecting our output
                    }
                }
                innerPairsInsideParenthese--;
                outerPairsOfParenthese++;
            }
        }
        return ResultDP[numOfPair];
    }
}
