import java.util.*;
public class PowerOfNumber {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number whose power is to be found");
    int n =sc.nextInt();
    System.out.println("Enter power to which number is to raised");
    int m = sc.nextInt();
    int num =0;
    if(m>=1){
        for(int i=1;i<=m;i++){
            num = n*n;
        }
        System.out.println(num);
    }

    else if(m==0){
        System.out.println("1");
    }
    else{
        System.out.println("Invalid input");
    }
    sc.close();
}
    
   }