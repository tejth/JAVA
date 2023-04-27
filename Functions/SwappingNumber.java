import java.util.*;
public class SwappingNumber {

    public void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("after swapping : "+ a +" "+b);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();
        SwappingNumber obj = new SwappingNumber();
        obj.swap(a,b);
        sc.close();

    }

    
}
