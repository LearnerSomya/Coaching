import java.io.*;
import java.util.*;
class ThreeSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] ArrayForThreeSum = new int[arraySize];
        for(int a = 0; a < ArrayForThreeSum.length; a++){
            ArrayForThreeSum[a] = scn.nextInt();
        }
        System.out.println(threeSum(ArrayForThreeSum));

    }
    public static List<List<Integer>> threeSum(int[] numsArray){
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(numsArray); //here we are sorting the array which takes nlogn complexity
        int target = 0;
        HashSet<Long> set = new HashSet<>();//a HashSet of type List
        for(int i = 0; i < numsArray.length; i++) {
            int newTarget = target - numsArray[i];

            int leftIndex = i + 1; //j //as i is at 0 so keeping j next to i
            int rightIndex = numsArray.length - 1;
            while(leftIndex < rightIndex){
                if(numsArray[leftIndex] + numsArray[rightIndex] < newTarget){
                    leftIndex ++; // if value is less then newTarget than moving right from left side
                } else if(numsArray[leftIndex] + numsArray[rightIndex] > newTarget){
                    rightIndex --;
                } else{
                    long hash = getHash(numsArray[i], numsArray[leftIndex], numsArray[rightIndex]);//using rabincar aldorithm concepyt
                    if(set.contains(hash) == false){
                        answer.add(Arrays.asList(numsArray[i], numsArray[leftIndex], numsArray[rightIndex]));//triplate os made of i, leftIndex and rightIndex
                        set.add(hash);
                    }
                    leftIndex++;
                    rightIndex--;
                }
            }
        }
        return answer;
    }
    //Rabincar algorithm used here
    public static long getHash(int x, int y, int z){
        long hash = x;
        hash *= 100000;
        hash += y;
        hash *= 100000;
        hash += z;

        return hash;
    }
}
