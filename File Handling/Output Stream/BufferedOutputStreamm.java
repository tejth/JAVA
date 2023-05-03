import java.io.*;

public class BufferedOutputStreamm {

  public static void main(String[] args) throws IOException {
    FileOutputStream f = new FileOutputStream("Myfile2.txt");
    BufferedOutputStream obj = new BufferedOutputStream(f);
    String s = "Hello world";
    byte[] b = s.getBytes();
    obj.write(b);
    obj.close();
  }
}
