import java.util.*;
public class SimpleInterestProgram {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter principle amount");
    float princ = sc.nextFloat();
    System.out.println("enter rate");
    float rate = sc.nextFloat();
    System.out.println("enter time");
    int time = sc.nextInt();
    
    System.out.println("Simple interest is :"+ ((princ*rate*time)/100));
    sc.close();
    }    
}
