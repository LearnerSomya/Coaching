import java.io.*;
import java.util.*;
class CheckIfTwoArraysAreEqual {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arraySize = scn.nextInt();
        int[] arrayOne = new int[arraySize];
        System.out.println("Enter Array One Elements");
        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = scn.nextInt();
        }

        int[] arrayTwo = new int[arraySize];
        System.out.println("Enter Array Two Elements");
        for(int j = 0; j < arrayTwo.length; j++){
            arrayTwo[j] = scn.nextInt();
        }
        System.out.println(ArrayConatinsSameValues(arrayOne, arrayTwo));
        
    }

    static boolean ArrayConatinsSameValues(int[] arrayOne, int[] arrayTwo){
        boolean flag = false;
        //int arrayOneSize = Collections.max(Arrays.asList(arrayOne));
        //int arrayOneSize = Arrays.stream(arrayOne).max().orElse(Integer.MIN_VALUE);
        int arrayOneSize = findMaxValue(arrayOne);
        //System.out.println("array one size" + arrayOneSize);
        int[] indexerArrayOne = new int[arrayOneSize + 1];
        //int arrayTwoSize = Collections.max(Arrays.asList(arrayTwo));
        //int arrayTwoSize = Arrays.stream(arrayTwo).max().orElse(Integer.MIN_VALUE);
        int arrayTwoSize = findMaxValue(arrayTwo);
        //System.out.println("array Two size" + arrayTwoSize);
        int[] indexerArrayTwo = new int[arrayTwoSize + 1];

        //filling indexerArrayOne
        for(int i = 0; i < arrayOne.length; i++){
            int valueOne = arrayOne[i];
            if(valueOne >= 0 && valueOne < arrayOne.length){
                indexerArrayOne[valueOne]++;
            }
        }

        //filling indexerArrayTwo
        for(int j = 0; j < arrayTwo.length; j++){
            int valueTwo = arrayTwo[j];
            if(valueTwo >= 0 && valueTwo < arrayTwo.length){
                indexerArrayTwo[valueTwo]++;
            }
        }

        int common = Math.min(indexerArrayOne.length, indexerArrayTwo.length);
        for(int a = 0; a < common; a++){
            if(indexerArrayOne[a] == indexerArrayTwo[a]){
                flag = true;
            } else{
                flag = false;
            }
        }
        return flag;
    }
    static int findMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        //here int value will take each value of array, its a for each loop
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
