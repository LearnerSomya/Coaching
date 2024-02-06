import java.io.*;
import java.util.*;
class TimePlanner {
    public static void main(String[] args) throws Exception {
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        //firstly taking input in arr[][]
        System.out.println("Enter slots for soltA");
        String inputSlotA = brVal.readLine();
        int[][] slotA = parseInput(inputSlotA);

        System.out.println("Enter slots for soltb ");
        String inputSlotB = brVal.readLine();
        int[][] slotB = parseInput(inputSlotB);

        System.out.println("Enter duration");
        int dur = Integer.parseInt(brVal.readLine());

        meetingPlanner(slotA, slotB, dur);
        System.out.println(meetingPlanner(slotA, slotB, dur));
    }

    static int[][] parseInput(String input){

        input = input.trim();
        if(input.startsWith("{{") && input.endsWith("}}")){
        input = input.substring(2, input.length() - 2);
        String[] pairs = input.split("\\},\\{");
        int[][] result = new int[pairs.length][2];

        for(int i = 0; i < pairs.length; i++){
            String[] values = pairs[i].split(", ");
            result[i][0] = Integer.parseInt(values[0]);
            result[i][1] = Integer.parseInt(values[1]);
        }

        return result; 
        } else {
            throw new IllegalArgumentException("Invalid input format");

        }
    }

    static int[] meetingPlanner(int[][] slotA, int[][] slotB, int dur){
        
        // input:  slotsA = [[10, 50], [60, 120], [140, 210]]
        // slotsB = [[0, 15], [60, 70]]
        // dur = 8
        // output: [60, 68]
        //start with taking two pointers
        int slotAPointer = 0;
        int slotBPointer = 0;
        while(slotAPointer < slotA.length && slotBPointer < slotB.length){
            int start = Math.max(slotA[slotAPointer][0],slotB[slotBPointer][0]);
            int end = Math.max(slotA[slotAPointer][1], slotB[slotBPointer][1]);
            if(end - start >= dur){
                return new int[]{start,start+dur};
            }
            if(slotA[slotAPointer][1] < slotB[slotBPointer][1]){
                slotAPointer++;
            } else{
                slotBPointer--;
            }
        }
        
        return new int[]{};
    }

}
