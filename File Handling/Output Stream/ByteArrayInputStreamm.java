import java.io.*;

public class ByteArrayInputStreamm {

  public static void main(String[] args) {
    byte[] b = { 65, 66, 67 };
    ByteArrayInputStream file = new ByteArrayInputStream(b);
    int k = 0;
    while ((k - file.read()) != -1) {
      System.out.println((char) k);
    }
  }
}
