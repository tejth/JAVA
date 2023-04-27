import java.util.*;
public class SumOfNumber{
    public void addd(int a,int b){
    System.out.println("Sum of numbers is : "+ (a+b));
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int a =sc.nextInt();
    System.out.println("enter another number");
    int b =sc.nextInt();
    SumOfNumber obj = new SumOfNumber();
    obj.addd(a,b);
    sc.close();




    
}
    
}