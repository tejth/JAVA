import java.util.*;

class NegativeRadiusException extends Exception {

  @Override
  public String toString() {
    return "Radius cant be negative";
  }

  public String getMessage() {
    return "Radius cant be negative";
  }
}

public class Exceptionclass {

  public static double area(int r) throws NegativeRadiusException {
    if (r < 0) {
      throw new NegativeRadiusException();
    } else {
      double result = Math.PI * r * r;
      return result;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a radius");
    int r = sc.nextInt();
    try {
      System.out.println(area(r));
    } catch (Exception e) {
      System.out.println("Exception occured");
      System.out.println(e.getMessage());
    }
    sc.close();
  }
}
