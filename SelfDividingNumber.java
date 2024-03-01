import java.io.*;
import java.util.*;
class SelfDividingNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Left");
        int leftRange = Integer.parseInt(br.readLine());
        System.out.println("Right");
        int rightRange = Integer.parseInt(br.readLine());
        System.out.println(IsSelfDividNumber(leftRange, rightRange));
    }

    public static List<Integer> IsSelfDividNumber(int left, int right){
        List<Integer> SelfDividingNumersAre = new ArrayList<>();
        for(int range = left; range <= right; ++range){
            if(check(range)){
                SelfDividingNumersAre.add(range);
            }
        }
        return SelfDividingNumersAre;
    }
    public static boolean check(int range){
        for(int checkrange = range; checkrange != 0; checkrange /= 10){
            int x = checkrange % 10;
             if(x == 0 || range % x != 0){
                return false;
             }
        }
        return true;
    }
}
