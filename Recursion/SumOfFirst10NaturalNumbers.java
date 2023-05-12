public class SumOfFirst10NaturalNumbers {

    public static void printnum(int i,int n,int sum){
    if(i==n){
        sum=sum+i;
        System.out.print(sum+" ");
        return;
    }



    sum=sum+i;
    printnum(i+1,n,sum);


        
    }
    public static void main(String[] args) {
        printnum(1,10,0);
        
    }
}
