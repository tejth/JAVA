import java.io.*;

public class FileOutputStreamm {

  public static void main(String[] args) throws IOException {
    FileOutputStream f = new FileOutputStream("Myfile.txt");
    byte[] b = { 65, 66, 67 };
    f.write(b);
    f.close();
  }
}
