import java.io.*;
import java.util.*;
class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("total baskets we have");
        int totalBasket = Integer.parseInt(br.readLine());
        int[] basketPositions = new int[totalBasket];
        System.out.println("baskets position");
        for(int i = 0; i < basketPositions.length; i++){
            basketPositions[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("total balls");
        int totalBalls = Integer.parseInt(br.readLine());
        System.out.println(maxDistance(basketPositions,totalBalls));
    }
    public static int maxDistance(int[] position, int balls){
        Arrays.sort(position);
        int minBasket = position[0];
        int maxBasket = position[position.length - 1];
        int left = 0;
        int right = maxBasket -  minBasket;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(isPossibleToPlaceBall(balls, position, mid) == true){
                ans = mid;
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static boolean isPossibleToPlaceBall(int balls, int[] position, int midDist){
        int lastPlacedBall = position[0];
        int ballsPlaced = 1;
        for(int i = 1; i < position.length; i++){
            if(lastPlacedBall + midDist <= position[i]){
                lastPlacedBall = position[i];
                ballsPlaced++;
            }

            if(ballsPlaced == balls){
                return true;
            }
        }
        return false;
    }
}
