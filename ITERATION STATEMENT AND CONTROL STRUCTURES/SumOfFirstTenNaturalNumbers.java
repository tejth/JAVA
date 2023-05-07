public class SumOfFirstTenNaturalNumbers {
    public static void main(String args[]){
        int sum =0;
        for(int i=0;i<=10;i++){
            sum=sum+i;
        }
        System.out.println("Sum is : " + sum);

        System.out.println("USING DO WHILE LOOP"+"\n");

        int sum1=0;
        int j=0;
        do{
            sum1=sum1+j;
            j++;
        }
        while(j<=10);
        System.out.println("Sum1 is : " + sum1); System.out.println("Sum1 is : " + sum1);

        
    }
}
