import java.io.*;
import java.util.*;
class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int userEnterArraySize = scn.nextInt();
        int[] UserEnteredArray = new int[userEnterArraySize];
        for(int b = 0; b < UserEnteredArray.length;b++){
            UserEnteredArray[b] = scn.nextInt();
        }
        Arrays.sort(UserEnteredArray);
        RemoveDuplicateValue(UserEnteredArray);
        System.out.println("Till Index " + RemoveDuplicateValue(UserEnteredArray));
    }
    public static int RemoveDuplicateValue(int[] UserEnteredArray){
       int j = 1;
       for(int i = 1; i < UserEnteredArray.length;i++){
        if(UserEnteredArray[i] != UserEnteredArray[i - 1]){
            UserEnteredArray[j] = UserEnteredArray[i];
            j++;
        }
       }
       return j;
    }
}
