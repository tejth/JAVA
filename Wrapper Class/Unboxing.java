import java.io.*;

public class Unboxing {

  public static void main(String args[]) {
    Integer i = new Integer(10);
    int ab = i.intValue();
    int j = i;
    System.out.println(i + j + ab);
  }
}
