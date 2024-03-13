import java.io.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
class GroupAnagrams {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter how many string you want to enter");
        int arraySize = Integer.parseInt(br.readLine());
        String[] userStringEntred = new String[arraySize];
        System.out.println("Enter Strings");
        for(int i = 0; i < userStringEntred.length; i++){
            userStringEntred[i] = br.readLine();
        }
        System.out.println(groupingAnagrams(userStringEntred));
    }

    public static List<List<String>> groupingAnagrams(String[] strs){
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bigMap = new HashMap<>();
        //frequency map
        for(String str : strs){
            HashMap<Character, Integer> frequencyMap = new HashMap<>();
            for(int i = 0; i< str.length(); i++){
                char ch = str.charAt(i);
                //took ch from string and put it in frequencyMap, if ch already exist then 
                //increase frequency count by 1 and if not present then put 0
                frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
            }

            if(bigMap.containsKey(frequencyMap) == false){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                bigMap.put(frequencyMap,list);
            } else{
                ArrayList<String> list = bigMap.get(frequencyMap);
                list.add(str);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(ArrayList<String> ans : bigMap.values()){
            result.add(ans);
        }
        return result;
    }
}
