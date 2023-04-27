import java.util.*;
public class PermutationAndCombination {
    public int facto(int num){
        if(num>=1){
          return num*facto(num-1);
        }
        else{
          return 1;
        }
  }

  public int ncr(int n ,int r){
    int numerator = facto(n);
    int denominator = facto(r)*facto(n-r);
    int result = numerator/denominator;
    return result;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n");
    int n = sc.nextInt();
    System.out.println("Enter value of r");
    int r = sc.nextInt();
    PermutationAndCombination obj = new PermutationAndCombination();
    int result = obj.ncr(n, r);
    System.out.println("Result is :"+result);
    sc.close();
  }
    
}
