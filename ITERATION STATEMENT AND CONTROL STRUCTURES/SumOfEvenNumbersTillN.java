import java.util.*;
public class SumOfEvenNumbersTillN{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    long sum =0;
    for (int i=2;i<=n;i+=2){
        sum = sum + i;
    }
    System.out.println("sum is : "+ sum);
    sc.close();
   }
}