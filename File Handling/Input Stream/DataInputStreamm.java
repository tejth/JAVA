import java.io.*;

public class DataInputStreamm {

  public static void main(String[] args) throws IOException {
    FileOutputStream file = new FileOutputStream("data.txt");
    DataOutputStream d = new DataOutputStream(file);
    d.writeInt(1);
    d.writeChar('t');
    d.writeDouble(33.55);
    d.close();

    FileInputStream f = new FileInputStream("data.txt");
    DataInputStream fin = new DataInputStream(f);
    System.out.println(fin.readInt());
    System.out.println(fin.readChar());
    System.out.println(fin.readDouble());
    fin.close();
  }
}
