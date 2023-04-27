import java.util.*;
public class DivisorsOfNumber {

    public void printDivisor(int n){
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
	}
    public static void main(String args[]){
     DivisorsOfNumber obj = new DivisorsOfNumber();
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		obj.printDivisor(n);
        sc.close();
    }    
}
