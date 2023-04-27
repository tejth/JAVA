import java.util.*;
public class FactorialRecursiveFunction {

    public long facto(long num){
          if(num>=1){
            return num*facto(num-1);
          }
          else{
            return 1;
          }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = sc.nextLong();
        FactorialRecursiveFunction obj = new FactorialRecursiveFunction();
        long result = obj.facto(n);
        System.out.println("Result is : "+ result);
        sc.close();
    }
    
}
