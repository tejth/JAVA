import java.util.*;
public class Rough{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=0;
        int b=1;
        int c;
        System.out.print("0"+" ");
        for(int i=1; i<n; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(a+" ");
        }
        
    }
}