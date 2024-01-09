import java.io.*;
import java.util.*;
class IntegerToRoman {
    public static void main(String[] args) throws Exception {
        BufferedReader brVal = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number you wan to convert in Roman");
        int num = Integer.parseInt(brVal.readLine());
        //int num = Integer.parseInt(brVal.readLine());
        //intToRoman(num);
        System.out.println(intToRoman(num));
    }
    
    public static String intToRoman(int num){
        StringBuilder sbval = new StringBuilder();

        //this line will handle the value that are more 1000s as in question we are givven that values will be till 3999, so 
        //here in major and middle we are using '*', for minor we are using 'M' which represents 1000, and then num / 1000 whch will give quotient
        Process(sbval, '*', '*', 'M', num / 1000);
        num = num % 1000; // than reducing the num

        //this line will handle the value that are between 100 and 1000s  
        Process(sbval, 'M', 'D', 'C', num / 100);
        num = num % 100; // than reducing the num
        
        //this line will handle the value that are between 10 and 100
        Process(sbval, 'C', 'L', 'X', num / 10);
        num = num % 10; // than reducing the num

        //this line will handle the value that are between 1 and 10
        Process(sbval, 'X', 'V', 'I', num);

        return sbval.toString();
    }
    static void Process(StringBuilder sb, char major, char middle, char minor, int val){

        //procees of evaluating value form 1 to 3 is same
        if(val <= 3){
            for(int i = 0; i < val; i++){
                sb.append(minor);
            }
        } else if( val == 4){ 
            //procees of evaluating value 4 is different as in roman value 4 is written as IV where I represents 1 and V represents 5
            //which means for writing 4 in roman we use minor befor middle
            sb.append(minor);
            sb.append(middle);
        } else if(val == 5){
            //process of evlauating value 5 is different becaues in roman value 5 is written as V
            //and here V represents as middle 
            sb.append(middle);
        } else if( val <= 8){
            //procees of evaluating value form 6 to 8 is same as in roman value 6 is written as VI where I represents 1 and V represents 5
            //which means for writing 6 in roman we use minor after middle
            sb.append(middle);
            for(int j = 6; j <= val; j++){
                sb.append(minor);
            }
        } else if(val == 9){
            //process of evaluating 9 is different as in roman we write 9 as IX where I represents 1 and X represents 10
            //which means for writing 9 in roman we use minor befor major
            sb.append(minor);
            sb.append(major);
        }
    }
}
