public class XtoPowerLogn {
    public static int calpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if n is even
        if(n % 2 == 0) {
            return calpower(x, n/2) * calpower(x, n/2);
            }
            //odd
            else {
            return x * calpower(x, n/2) * calpower(x, n/2);
            }
    }
    public static void main(String[] args) {
        
    }
}
