import java.util.*;
public class FactorialFunction {
    public void facto(int n){
        int fact=1;
        if(n==0||n==1){
            System.out.println("Factorial is : 1");
        }
        else{
            for(int i =1;i<=n;i++){
                fact = fact*i;
            }
            System.out.println("Factorial is : "+fact);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        FactorialFunction obj = new FactorialFunction();
        obj.facto(num);
        sc.close();

    }
    }
    
