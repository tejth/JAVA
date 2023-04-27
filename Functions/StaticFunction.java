import java.util.*;
public class StaticFunction {
    public static void arearect(int a,int b){
        System.out.println("Area of rectangle is "+a*b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        StaticFunction.arearect(a,b);
        sc.close();

    }
    
}
