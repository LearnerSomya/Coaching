import java.io.*;
import java.util.*;
class ContainerWithMostWater {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter how many heights you want to enter");
        int sizeOfArray = scn.nextInt();
        int[] height = new int[sizeOfArray];
        System.out.println("Enter heights");
        for(int i = 0; i < height.length; i++){
            height[i] = scn.nextInt();
        }
        MaximumArea(height);
        System.out.println(MaximumArea(height));
    }

    public static int MaximumArea(int[] height){
        int leftCorner = 0;
        int rightCorner = height.length - 1;
        int result = 0;

        //here in these left corner and right corner they are haveing extrime right and left corner values
        while(leftCorner < rightCorner){
            int leftValue = height[leftCorner];
            int rightValue = height[rightCorner];

            int AreaIs = Math.min(leftValue, rightValue) * (rightCorner - leftCorner);
            //here we are comparing result with AreaIs and finding maximum from them
            result = Math.max(result, AreaIs);

            if(leftValue < rightValue){
                leftCorner++;
            } else{
                rightCorner--;
            }
        }
        return result;
    }
}
