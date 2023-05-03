import java.io.*;

public class BufferedInputStreamm {

  public static void main(String[] args) throws IOException {
    FileInputStream obj = new FileInputStream("file1.txt");
    BufferedInputStream buff = new BufferedInputStream(obj);
    int k = 0;
    while ((k = buff.read()) != -1) {
      System.out.println((char) k);
    }
    buff.close();
  }
}
