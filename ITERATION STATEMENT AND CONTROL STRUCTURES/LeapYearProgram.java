import java.util.*;
public class LeapYearProgram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check");
        int num =sc.nextInt();
        if((num%4==0)&&(num%100!=0) || (num%400==0)){
            System.out.println("leap year");

        }
        else{
            System.out.println("not a leap year");        }
      sc.close();
    }
    

    
}
