import java.io.*;
import java.util.*;
// import java.util.random.RandomGenerator;
class ImplementRandTenUsingRandSeven {
    public static void main(String[] args) {
        // for(int i = 0; i < 10; i++){
        //     int result = randomTen();
        //     System.out.println(result);
        // }
        System.out.println(randomTen());
       
    }
    public static int randomTen(){
        int notLessThanFourty = 41;
        while(notLessThanFourty >= 40){
            notLessThanFourty = (randSeven() - 1)*7 + randSeven()-1;
        }
        return notLessThanFourty % 10 + 1;
    }
    public static int randSeven(){
        return (int) (Math.random() * 7) + 1;
        //return new Random().nextInt(7) + 1;
    }
}
