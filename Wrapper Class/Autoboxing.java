import java.io.*;

public class Autoboxing {

  public static void main(String args[]) {
    int i = 100;
    Integer j = Integer.valueOf(i);
    Integer ab = j;
    System.out.println(i + j + ab);
  }
}
