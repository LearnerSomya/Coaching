//Bosscoder starting questions
import java.io.*;
import java.util.*;
class LeapYear {
    
    static boolean check(int year){
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            return true;
        } else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scn.nextInt();
        check(year);
        System.out.println(check(year));
    }
}
