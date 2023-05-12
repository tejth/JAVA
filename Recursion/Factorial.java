public class Factorial {
    public static int Facto(int n){
      if(n==0||n==1){
        return 1;
      }
      else{
        return n*Facto(n-1);
      }
    }
    public static void main(String[] args) {
        System.out.println(Facto(5));
        
    }
}
