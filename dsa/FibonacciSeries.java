public class FibonacciSeries {
    public static int fibFunc(int n){
        if(n==0||n==1){
            return n;
        }

        int fib = fibFunc(n-1)+fibFunc(n-2);
        return fib;
    }
    public static void main(String args[]){
          System.out.println(fibFunc(5));
    }
    
}
