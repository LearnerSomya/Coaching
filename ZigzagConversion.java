import java.io.*;
import java.util.*;
class ZigzagConversion {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string ");
        String enterdString = scn.nextLine();
        System.out.println("Enter Row ");
        int rowCount = scn.nextInt();
        Zigzag(enterdString, rowCount);
        System.out.println(Zigzag(enterdString, rowCount));
    }

    public static String Zigzag(String enteString, int rowCount){
        StringBuilder resultReturn = new StringBuilder();
        if(rowCount == 1){
            return enteString;
        }
        
        for(int i = 0; i < rowCount; i++){
            int index = i;
            int goingSouthFirstThenNorth = 2 * (rowCount - 1 - i);
            int goingNorthFirstThenSouth = 2 * i;

            boolean travelSouth = true;

            while(index < enteString.length()){
                //we are checking the characters at the index i 
                resultReturn.append(enteString.charAt(index));

                //if we are the very first row
                if(i == 0){
                    //if we are at very first row then we are traveling only south cause next charater is in row 1 
                    index += goingSouthFirstThenNorth;
                } else if(i ==  rowCount - 1){
                    //when we are at the last row
                    index += goingNorthFirstThenSouth;
                } else{
                    //when we are in the middle rows then we are traveling south and the north but the
                    //formula used in goingSouthFirstThenNorth counts the characters and includes next character in the row we need
                    if(travelSouth){
                        index += goingSouthFirstThenNorth;
                    } else{
                        index += goingNorthFirstThenSouth;
                    }

                    travelSouth = !travelSouth;
                }
            }
        }
        return resultReturn.toString();

    }
}
