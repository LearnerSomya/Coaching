import java.io.*;
import java.util.*;
import java.util.Collection;
class WAPforArrayStartsBosscoder {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length;i++){
            array[i] = scn.nextInt();
        }
        System.out.println("Enterer Array is");
        for(int i = 0; i < array.length;i++){

            System.out.println(array[i]);
        }

        int max = array[0];
        int min = array[0];
        for(int j = 0; j < array.length; j++){
            if(max > array[j]){
                max = array[j];
            } 
            if(min < array[j]){
                min = array[j];
            }
        }
        //int maximum = Collection.max(Arrays.asList(array));
        //int minimum = Collection.min(Arrays.asList(array));
        System.out.println("Maximum " + max);
        System.out.println("Minimum " + min);
    }
}
