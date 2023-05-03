import java.io.*;

public class Writer {

  public static void main(String[] args) throws IOException {
    File f = new File("file.txt");
    FileWriter obj = new FileWriter(f);
    String s = "hellow world";
    obj.write(s);
    obj.close();
  }
}
