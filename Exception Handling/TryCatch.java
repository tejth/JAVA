import java.util.*;

public class TryCatch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    System.out.println("Enter another Number");
    int b = sc.nextInt();

    try {
      int c = a / b;
      System.out.println("Division is " + c);
    } catch (ArithmeticException e) {
      System.out.println("Exception Occured:");
      System.out.println(e);
    }
    sc.close();
  }
}
