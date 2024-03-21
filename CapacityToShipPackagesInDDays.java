import java.io.*;
import java.util.*;
class CapacityToShipPackagesInDDays {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Total Packages we have");
        int PackageCount = Integer.parseInt(br.readLine());
        System.out.println("Weight of Each Package");
        int[] WeightOfPackages = new int[PackageCount];
        for(int i = 0; i < WeightOfPackages.length; i++){
            WeightOfPackages[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Days we have");
        int DaysWeHave = Integer.parseInt(br.readLine());
        System.out.println(LeastWeightPossible(WeightOfPackages, DaysWeHave));

    }
    //Least Possible weight that could be placed on convare belt throught out the days 
    public static int LeastWeightPossible(int[] weight, int days){
        int leastMaxWeight = 0; // max value from the array
        int heighestMaxWeight = 0; // sum of complete array
        for(int val : weight){
            leastMaxWeight = Math.max(leastMaxWeight,val); 
            heighestMaxWeight += val;
        }

        if(weight.length == days){
            return leastMaxWeight;
        }

        int low = leastMaxWeight;
        int heigh = heighestMaxWeight;
        int leastMaxWeightPossible = 0;
        while(low <= heigh){
            int mid = low + (heigh - low)/2;
            if(isPossible(weight,mid,days) == true){
                leastMaxWeightPossible = mid;
                heigh = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return leastMaxWeightPossible;
    }

    public static boolean isPossible(int[] weight,int mid,int days){
        int day = 1;
        int sum = 0;
        for(int i = 0; i < weight.length; i++){
            sum += weight[i];
            if(sum > mid){
                day++;
                sum = weight[i];
            }
        }
        return day <= days;
    }
}
