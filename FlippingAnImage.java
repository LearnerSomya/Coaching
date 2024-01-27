import java.io.*;
import java.util.*;
import java.util.ArrayList.*;
class FlippingAnImage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //created a 2d array
       List<List<Integer>> input = new ArrayList<>();
       System.out.println("Row");
       int row =scn.nextInt();
       System.out.println("Column");
       int column =scn.nextInt();
       System.out.println("Enter Values");
       for(int i = 0; i < row; i++){
        List<Integer> rowArray = new ArrayList<>();
        for(int j = 0; j < column;j++){
            rowArray.add(scn.nextInt());
        }
        input.add(rowArray);
       }

       List<List<Integer>> result = solve(input);
       for(List<Integer> rowArray : result){

           System.out.println(rowArray);
       }
    }

    static List<List<Integer>> solve(List<List<Integer>>  input){
        //horizontal flip
        int inputArraySize = input.size();
        List<List<Integer>> answerArray = new ArrayList<>();
        for(int i = 0;i < inputArraySize;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < inputArraySize;j++){
                temp.add(1 - input.get(i).get(inputArraySize - j - 1));
            }
            answerArray.add(temp);
        }        
        return answerArray;
    }
}
