import java.io.*;
import java.util.*;
class RichestCustomerWealth {
    public static void main(String[] args) throws Exception {
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        //Taking user input in List<List<Integer>>
        System.out.println("Enter Row counts");
        int rowCount = Integer.parseInt(brVal.readLine());
        List<List<Integer>> inputList = new ArrayList<>();
        System.out.println("Enter Coloumn counts" );
        int colCount = Integer.parseInt(brVal.readLine());
        for(int i = 0; i < rowCount; i++){
            System.out.println("Enter elements" );
            List<Integer> colElement = new ArrayList<>();
            for(int j = 0; j < colCount; j++){
                colElement.add(Integer.parseInt(brVal.readLine()));
            }
            inputList.add(colElement);
        }

        System.out.println("Richest Customer has Wealth of " + MaxWealth(inputList));
    }
    static int MaxWealth(List<List<Integer>> inputList){
        int maximumWealth = 0;
        for(int i = 0; i < inputList.size(); i++){
            //this inner List will have values of banks/columns
            List<Integer> ValueOfBank = inputList.get(i);
            int maxValue = 0;
            for(int j = 0; j < ValueOfBank.size();j++){
                maxValue += ValueOfBank.get(j);
            }
            maximumWealth = Math.max(maxValue,maximumWealth);
        }
        return maximumWealth;
    }
}
