import java.util.* ;

class TotalPrimeNumberInterval {
	public int totalPrime(int s, int e){
	int count = 0;
    int i;
    for(i=s;i<=e;i++){
        int n = i;
        int a = 2;
        int temp = 0;
        while(a<=(n/2)){
            if((n%a)==0){
                temp++;
                break;
            }
            a++;
        }
        if(temp==0 && i!= 1){
        count++;     
        }
    }
    return +count;
		
	}
}

class Solution {
	public static void main(String args[]) {
		
		TotalPrimeNumberInterval obj = new TotalPrimeNumberInterval();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
        sc.close();
	}
}
		
			