import java.util.*;

public class NestedTryCatch {

  public static void main(String[] args) {
    int arr[] = { 4, 6, 7, 8 };
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an Array Index");
    int a = sc.nextInt();

    try {
      System.out.println("Welcome to the program!");
      try {
        System.out.println("The element at given index is" + arr[a]);
      } catch (Exception e) {
        System.out.println("Exception occured in level 2:");
        System.out.println(e);
      }
    } catch (Exception e) {
      System.out.println("Exception occured in level 1");
    }
    sc.close();
  }
}
