import java.util.* ;
import java.io.*; 
class Rectangle { 
    // Write your code here.
    public int length;
    public int breath;

    Rectangle(int l,int b){
        length=l;
        breath=b;
    }

    public int getArea(){
        return length*breath;
    }
}
public class Rough{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Rectangle obj= new Rectangle(n, m);
        System.out.println(obj.getArea());
    }
}