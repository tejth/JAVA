import java.util.*;
public class CheckingPrimeNumber{

    public static void checkpri(int n){
    int flag =0;
    for(int i=2;i<n;i++){
        if(n%i==0){
            System.out.println("not prime");
            flag=1;
            break;
        }
 }
  if(flag==0){
    System.out.println("prime");
  }
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CheckingPrimeNumber.checkpri(n);
        sc.close();


    }
}