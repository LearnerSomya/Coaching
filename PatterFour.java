//Bosscoder
import java.io.*;
import java.util.*;
class PatterFour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        List<String> UpsideDownTriangle = UpsideDownTrianglePattern(num);
        for(String rows : UpsideDownTriangle){
            System.out.println(rows);
        }
    }
    static List<String> UpsideDownTrianglePattern(int num){
        List<String> pattern = new ArrayList<>();
        for(int i = 0; i < num; i++){
            StringBuilder row = new StringBuilder();
            for(int j = 0; j < num - i; j++){
                row.append("*");
            }
            pattern.add(row.toString());
        }
        return pattern;
    }
}
