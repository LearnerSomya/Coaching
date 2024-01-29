import java.util.*;
import java.io.*;
class CharacterPattern {
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(brVal.readLine());
        List<String> answer = Pattern(num); //this "answer" means a variable which will hold the output that Pattern will return
        for(String rows : answer){
            System.out.println(rows + " ");
        }
    }

    //List<Datatype> is a Dynamic Array Data Structure 
    static List<String> Pattern(int num){
        List<String> answer = new ArrayList<>();
        for(int i = 1; i <= num; i++){
            StringBuilder row = new StringBuilder();
            for(char j = 'a'; j <= 'a' + i - 1; j++){ // this j will give char values
                row.append(j);
            }
            answer.add(row.toString());
        }
        return answer;
    }
}
