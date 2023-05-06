import java.util.*;
public class PallendromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev =0;
        int rem;
        int temp = n;

        while(temp>0){
            rem = temp%10;
            rev = (rev*10)+rem;
            temp = temp/10;
        }
        if(rev==n){
        System.out.println("It is a Palindrome Number");
        }
    else{
        System.out.println("It is not a Palindrome Number");
    }
    sc.close();
    }

}
