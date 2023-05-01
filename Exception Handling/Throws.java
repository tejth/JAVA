import java.util.*;

public class Throws {

  public void caldivision(int a, int b) throws ArithmeticException {
    System.out.println("Division is " + a / b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    System.out.println("Enter Another Number");
    int b = sc.nextInt();
    try {
      Throws obj = new Throws();
      obj.caldivision(a, b);
    } catch (Exception e) {
      System.out.println("Exception occured");
    }
    sc.close();
  }
}
