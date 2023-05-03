import java.io.*;

public class Reader {

  public static void main(String[] args) throws IOException {
    File f = new File("file.txt");
    FileReader obj = new FileReader(f);
    int k = 0;
    while ((k = obj.read()) != -1) {
      System.out.print((char) k);
    }
    obj.close();
  }
}
