import java.io.*;

public class ByteArrayInputStreamm {

  public static void main(String[] args) throws IOException {
    byte[] b = { 65, 66, 67, 68 };
    ByteArrayInputStream obj = new ByteArrayInputStream(b);
    int k = 0;
    while ((k = obj.read()) != -1) {
      System.out.println((char) k);
    }
  }
}
