import java.io.*;

public class FileInputStreamm {

  public static void main(String[] args) throws IOException {
    FileInputStream obj = new FileInputStream("file1.txt");
    int k = 0;
    while ((k = obj.read()) != -1) {
      System.out.println((char) k);
    }
    obj.close();
  }
}
