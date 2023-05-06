import java.util.*;
public class SumOfDigitaOFNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EnTER A NUMBER");
        int n = sc.nextInt();
        int rev =0;
        int rem;
        int temp=n;
        int sum=0;
        while(temp>0){
            rem = temp%10;
            rev = (rev*10)+rem;
            sum=sum+rem;
            temp=temp/10;
            
        }
        System.out.println(sum);
        sc.close();

    }
    
}
