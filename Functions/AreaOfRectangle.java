import java.util.*;
public class AreaOfRectangle {
    public void areaa(int a,int b){
        System.out.println("The area of ractangle is :"+ (a*b));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length");
        int l =sc.nextInt();
        System.out.println("enter breath");
        int b =sc.nextInt();
        AreaOfRectangle obj = new AreaOfRectangle();
        obj.areaa(l, b);
        sc.close();
    }
    
}
