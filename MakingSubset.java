import java.io.*;
import java.util.*;
class MakingSubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] arrayEntred = new int[arraySize];
        for(int i =0; i < arrayEntred.length; i++){
            arrayEntred[i] = scn.nextInt();
        }
        System.out.println(SubsetsAre(arrayEntred));
    }
    static List<List<Integer>> SubsetsAre(int[] input){
        List<List<Integer>> subsets = new ArrayList<>();
        int n = input.length;
        int totalSubsets = 1 << n;
        for(int i = 0; i < totalSubsets; i++){
            List<Integer> subset = new ArrayList<>();
            for(int j = 0; j < n; j++){
                //System.out.println("loop 2 entred");
                if((i & (1 << j)) != 0){
                    //System.out.println("inside if condition");
                    subset.add(input[j]);
                    System.out.println("subset " + subset);
                }
                //System.out.println("Loop Break " + j);
            }
            subsets.add(subset);
            System.out.println("subsets "+subsets);
        }
        return subsets;
    }
}
