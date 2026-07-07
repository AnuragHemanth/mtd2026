// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Check if a year is Leap year
/*Find if a number is Perfect Square
Accept the average score from the user and print the result as follows: 0 to 49 Fail 50 to 69 Second Class 70 to 89 First Class 90 to 100 Distiction*/
import java.util.*;
class anurag
 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int score= sc.nextInt();
        
        if(0<=score && score<=49){
            System.out.println("fail");
        }
        else if(50<=score && score<=69){
            System.out.println("second class");
        }
        else if(70<=score && score<=89){
            System.out.println("first class");
    }
    else if(90<=score && score<=100){
            System.out.println("distinction");
    }
    else{
        System.out.println("invalid input");
    }}}
   
