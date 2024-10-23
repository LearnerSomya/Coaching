//--------------------------------------------------------LEETCODE - 77--------------------------------------------------------//
import java.io.*;
import java.util.*;
public class Combination {
    public static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Array range");
        int n = Integer.parseInt(brVal.readLine());
        //int n = Integer.parseInt(br.readLine());
        System.out.println("Enter combination size");
        int k = Integer.parseInt(brVal.readLine());
        List<List<Integer>>answer = new ArrayList<>();
        answer = combine(n,k);
        System.out.println(answer);
    }
    public static List<List<Integer>> combine(int n, int k){
        List<Integer> temp = new ArrayList<>();
        solve(1, n, k, temp);
        return result;
    }
    public static void solve(int start, int n, int k, List<Integer> temp){
        //if range is 0 
        if(k == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(start > n){
            return;
        }
        temp.add(start);
        solve(start + 1, n, k - 1, temp);
        temp.remove(temp.size() - 1);
        solve(start + 1, n, k, temp);
    }
}