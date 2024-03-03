import java.io.*;
import java.util.*;
class RectangleOverlap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] recOne = new int[4];
        System.out.println("Enter Rec1 bottom left and top right coordinates");
        for(int i = 0; i < recOne.length; i++){
            recOne[i] = scn.nextInt();
        }
        int[] recTwo = new int[4];
        System.out.println("Enter Rec2 bottom left and top right coordinates");
        for(int i = 0; i < recTwo.length; i++){
            recTwo[i] = scn.nextInt();
        }

        System.out.println(IsRectangleOverlap(recOne,recTwo));
    }
    public static boolean IsRectangleOverlap(int[] rec1, int[] rec2){
        return rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec2[0] < rec1[2] && rec2[1] < rec1[3];
        //return rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec2[0] < rec1[2] && rec2[1] < rec1[3];
    }
}
