import java.util.*;
public class Fibonaaciii {
    public void fibo(int n){
        int a=0,b=1,c;
            System.out.print("0 ");
            for(int i=1;i<n;i++){  
                c=a+b;
                a=b;
                b=c;
                System.out.print(a+" ");     
            }      
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms");
        int n = sc.nextInt();
        Fibonaaciii obj = new Fibonaaciii();
        obj.fibo(n);
        sc.close();
    }
    

    }
    

