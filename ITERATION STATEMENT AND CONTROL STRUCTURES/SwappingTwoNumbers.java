import java.util.*;
public class SwappingTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter another number");
        int b = sc.nextInt();
        
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping :"+ a +" "+b);
          sc.close();



    }
}
