import java.util.*;
public class CalculatorProgram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers.");
        double a = sc.nextDouble();
        double b =sc.nextDouble();
        System.out.println("enter a operator to perform opeartion.");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':
            System.out.println("Sum is : " + (a+b));
            break;

            case '-':
            System.out.println("Sum is : " + (a-b));
            break;

            case '*':
            System.out.println("Sum is : " + (a*b));
            break;

            case '/':
            System.out.println("Sum is : " + (a/b));
            break;

            default:
            System.out.println("Invalid input.");



        }
        sc.close();
    }
    
}
