import java.util.*;
 public class CheckOddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("EVEN NUMBER");}
            else{
                
            System.out.println("ODD NUMBER");

            }
            sc.close();
        }
        
    }
 