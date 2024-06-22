import java.io.*;
import java.util.*;
class TwentyFourGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many cards you want to enter");
        int cardArraySize = scn.nextInt();
        int[] cards = new int[cardArraySize];
        System.out.println("Enter card values from 1 - 9");
        for(int i = 0; i < cards.length; i++){
            cards[i] = scn.nextInt();
        }

        judgePoint(cards);
        System.out.println(judgePoint(cards));
    }
    private static boolean judgePoint(int[] cards){
        List<Double> cardList = new ArrayList<>();
        for(int card : cards){
            cardList.add((double)(card));
        }
        return judgePointHelper(cardList);
    }
    private static boolean judgePointHelper(List<Double> cards){
        int n = cards.size();
        if(n == 1){
            if(Math.abs(cards.get(0) - 24) < 0.001){
                return true;
            } else{
                return false;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                double firstCard = cards.get(i);
                double secondCard = cards.get(j);
                List<Double> possibleResult = new ArrayList<>();
                possibleResult.add((double)(firstCard + secondCard));
                possibleResult.add((double)(firstCard - secondCard));
                possibleResult.add((double)(secondCard - firstCard));
                possibleResult.add((double)(firstCard * secondCard));
                if(firstCard != 0){
                    possibleResult.add(secondCard / firstCard);
                }
                if(secondCard != 0){
                    possibleResult.add(firstCard / secondCard);
                }
                for(double v : possibleResult){
                    List<Double> nextCard = new ArrayList<>();
                    nextCard.add(v);
                    for(int k = 0; k < n; k++){
                        if(k != i && k != j){
                            nextCard.add((double)(cards.get(k)));
                        }
                    }
                    if(judgePointHelper((nextCard))){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
