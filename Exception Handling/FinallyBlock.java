public class FinallyBlock {

  public static void main(String[] args) {
    int a = 9;
    int b = 0;
    try {
      System.out.println(a / b);
    } finally {
      System.out.println("end of program");
    }
  }
}
