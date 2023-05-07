 import java.util.*;
public class Factorial {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int fact =1;
			if(n==0){
				System.out.println(1);
			}
			else if(n>=1){
                for(int i =1;i<=n;i++){
				fact = fact * i;
                }
                System.out.println(fact);
			}
			else{
				System.out.println("Error");
			}
			sc.close();
		}
	
	}

    

