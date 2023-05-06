public class rough{
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("HELLO");
        sb.setCharAt(0,'p');
        System.out.println(sb);

        sb.insert(2,'m');
        System.out.println(sb);
    }
}